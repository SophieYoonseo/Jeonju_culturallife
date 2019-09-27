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

public class Adapter3 extends PagerAdapter {
    private int[] images = {R.drawable.poongnam,
            R.drawable.jeondongsungdang,
            R.drawable.kyeongkijeon,
            R.drawable.ohmokdae,
            R.drawable.hyangkyo,
            R.drawable.wanpanbonmoon,
            R.drawable.omokkyo,
            R.drawable.yousan,
            R.drawable.namcheonkyo,

    };
    //오목대 → 태조로 → 전동성당 → 경기전 → 교동미술관 → 최명희문학관(체험) → 부채문화관(체험) → 은행로 → 태조로 → 전통한지원(체험) → 승광재 → 전통술박물관(체험) → 소리문화관(체험) → 전주김치문화관(체험)
    String[] imagee={
            "풍남문",
            "전동성당",
            "경기전",
            "오목대",
            "전주향교",
            "완판본문화관",
            "오목교",
            "국립무형유산원",
            "남천교",


    };
    private LayoutInflater inflater;
    private Context context;
    public Adapter3(Context context){
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
        View v = inflater.inflate(R.layout.slider3, container, false);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
        TextView textView = (TextView)v.findViewById(R.id.textView);
        imageView.setImageResource(images[position]);
        String text = imagee[position];
        textView.setText(text);
        container.addView(v);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)//풍남문
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=13562101&query=풍남문"));
                    context.startActivity(homepage);
                }
                else if(position==1)//전동성당
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=12942911&query=%EC%B2%9C%EC%A3%BC%EA%B5%90%EC%A0%84%EB%8F%99%EA%B5%90%ED%9A%8C"));
                    context.startActivity(homepage);
                }  else if(position==2)//경기전
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://terms.naver.com/entry.nhn?docId=948171&cid=42865&categoryId=42865"));
                    context.startActivity(homepage);
                }else if(position==3)//오목대
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=20103217&query=%EC%98%A4%EB%AA%A9%EB%8C%80"));
                    context.startActivity(homepage);
                }  else if(position==4)//전주향교
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=13208787&query=%EC%A0%84%EC%A3%BC%ED%96%A5%EA%B5%90"));
                    context.startActivity(homepage);
                } else if(position==5)//완판본문화관
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g1143545-d15634495-Reviews-Wanpanbon-Jeonju_Jeollabuk_do.html"));
                    context.startActivity(homepage);
                } else if(position==6)//오목교
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.daum.net/_blog/BlogTypeView.do?blogid=07Dzc&articleno=15952048&_bloghome_menu=recenttext"));
                    context.startActivity(homepage);
                }else if(position==7)//국립무형유산원
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=17452519&query=%EA%B5%AD%EB%A6%BD%EB%AC%B4%ED%98%95%EC%9C%A0%EC%82%B0%EC%9B%90"));
                    context.startActivity(homepage);
                }else if(position==8)//남천교
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://ryeohang.tistory.com/177"));
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