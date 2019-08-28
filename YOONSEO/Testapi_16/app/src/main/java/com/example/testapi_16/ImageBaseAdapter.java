package com.example.testapi_16;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.coremodeling.naver.R;

public class ImageBaseAdapter extends BaseAdapter {
    private List<Image> imageList;
    private LayoutInflater layoutInflater;

    public ImageBaseAdapter(Context context, List<Image> imageList) {
        this.imageList = imageList;
        layoutInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return imageList.size();
    }

    public Object getItem(int position) {
        return imageList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.image_row, null);
        }
        else {
            view = convertView;
        }
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView1);
        TextView textViewTitle = (TextView)view.findViewById(R.id.textViewTitle);
        TextView textViewLink = (TextView)view.findViewById(R.id.textViewLink);

        String title = imageList.get(position).getTitle();
        String link = imageList.get(position).getLink().toString();
        String thumbnail = imageList.get(position).getThumbnail();

        try {
            URL url = new URL("thumbnail);
                    URLConnection conn = url.openConnection();
            conn.connect();
            BufferedInputStream  bis = new BufferedInputStream(conn.getInputStream());
            Bitmap bm = BitmapFactory.decodeStream(bis); bis.close();
            imageView.setImageBitmap(bm);
        } catch (IOException e) {
            e.printStackTrace();
        }

        textViewTitle.setText(title);
        textViewLink.setText(link);

        return view;
    }
}