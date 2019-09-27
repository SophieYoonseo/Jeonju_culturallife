package csejeonju2019.go.kr.insta;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
    public Object instantiateItem(ViewGroup container, final int position) {
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider6, container, false);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
        TextView textView = (TextView)v.findViewById(R.id.textView);
        imageView.setImageResource(images[position]);
        String text = imagee[position];
        textView.setText(text);
        container.addView(v);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://terms.naver.com/entry.nhn?docId=948171&cid=42865&categoryId=42865"));
                    context.startActivity(homepage);
                }
                else  if(position==1)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=19550901&query=%EC%96%B4%EC%A7%84%EB%B0%95%EB%AC%BC%EA%B4%80"));
                    context.startActivity(homepage);
                }  else if(position==2)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/PostView.nhn?blogId=bada3347&logNo=220796100043&categoryNo=0&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView"));
                    context.startActivity(homepage);
                } else if(position==3)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=20103217&query=%EC%98%A4%EB%AA%A9%EB%8C%80"));
                    context.startActivity(homepage);
                } else if(position==4)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/restaurants/detail?entry=plt&id=35904979&query=%EC%9D%B4%EB%AA%A9%EB%8C%80"));
                    context.startActivity(homepage);
                }else if(position==5)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=36439466&query=%EC%9E%90%EB%A7%8C%EB%B2%BD%ED%99%94%EB%A7%88%EC%9D%84"));
                    context.startActivity(homepage);
                }
            }
        });
        return v;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}