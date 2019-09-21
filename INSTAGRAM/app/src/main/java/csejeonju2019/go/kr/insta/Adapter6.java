package csejeonju2019.go.kr.insta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

public class Adapter6 extends PagerAdapter {
    private int[] images = {R.drawable.kyeongkijeon,
            R.drawable.uhzinmuseum,
            R.drawable.taezoro,
            R.drawable.ohmokdae,
            R.drawable.eemokdae,
            R.drawable.jamanbeokhwamaul,



    };
    //경기전 → 어진박물관 → 태조로 → 오목대 → 이목대 → 자만벽화마을
    String[] imagee={
            "경기전",
            "어진박물관",
            "태조로",
            "오목대",
            "이목대",
            "자만벽화마을"





    };
    private LayoutInflater inflater;
    private Context context;
    public Adapter6(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return images.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider6, container, false);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
        TextView textView = (TextView)v.findViewById(R.id.textView);
        imageView.setImageResource(images[position]);
        String text = imagee[position];
        textView.setText(text);
        container.addView(v);
        return v;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}