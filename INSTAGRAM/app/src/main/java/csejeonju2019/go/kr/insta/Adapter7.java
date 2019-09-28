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

public class Adapter7 extends PagerAdapter {
    private int[] images = {R.drawable.gaeklidan,
            R.drawable.hanokmaul,
            R.drawable.namboosizang,
            R.drawable.poongnam,
            R.drawable.hanokguest,




    };
    //경기전 → 어진박물관 → 태조로 → 오목대 → 이목대 → 자만벽화마을
    String[] imagee={
            "객리단길",
            "전주한옥마을",
            "남부시장",
            "풍남문",
            "한옥게스트하우스",






    };
    private LayoutInflater inflater;
    private Context context;
    public Adapter7(Context context){
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
        View v = inflater.inflate(R.layout.slider7, container, false);
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
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=windseeker7&logNo=221263550190&proxyReferer=https%3A%2F%2Fwww.google.com%2F"));
                    context.startActivity(homepage);
                }
                else  if(position==1)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=13208779&query=%EC%A0%84%EC%A3%BC%20%ED%95%9C%EC%98%A5%EB%A7%88%EC%9D%84"));
                    context.startActivity(homepage);
                }  else if(position==2)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jeonju.go.kr/index.9is?contentUid=9be517a74f72e96b014f82f9a7fb0e5a&subPath="));
                    context.startActivity(homepage);
                } else if(position==3)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=13562101&query=%ED%92%8D%EB%82%A8%EB%AC%B8"));
                    context.startActivity(homepage);
                } else if(position==4)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=sunlovebs&logNo=220924060549&proxyReferer=https%3A%2F%2Fwww.google.com%2F"));
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