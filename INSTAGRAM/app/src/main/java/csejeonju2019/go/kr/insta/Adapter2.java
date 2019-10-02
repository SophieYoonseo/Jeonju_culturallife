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

public class Adapter2 extends PagerAdapter {
    private int[] images = {R.drawable.ohmokdae,
            R.drawable.taezoro,
            R.drawable.jeondongsungdang,
            R.drawable.kyeongkijeon,
            R.drawable.kyodong,
            R.drawable.choimeonghee,
            R.drawable.boochae,
            R.drawable.eungangro,
            R.drawable.taezoro,
            R.drawable.juntonghanzi,
            R.drawable.seongkwangjae,
            R.drawable.soolmuseum,
            R.drawable.sorimoonhwakwan,
            R.drawable.kimchimoonhwa
            
    };
    //오목대 → 태조로 → 전동성당 → 경기전 → 교동미술관 → 최명희문학관(체험) → 부채문화관(체험) → 은행로 → 태조로 → 전통한지원(체험) → 승광재 → 전통술박물관(체험) → 소리문화관(체험) → 전주김치문화관(체험)
    String[] imagee={
            "오목대",
            "태조로",
            "전동성당",
            "경기전",
            "교동미술관",
            "최명희문학관",
            "부채문화관",
            "은행로",
            "태조로",
            "전통한지원",
            "승광재",
            "전퉁술박물관",
            "소리문화관",
            "전주김치문화관"

    };
    private LayoutInflater inflater;
    private Context context;
    public Adapter2(Context context){
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
        View v = inflater.inflate(R.layout.slider2, container, false);
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
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=20103217&query=%EC%98%A4%EB%AA%A9%EB%8C%80"));
                    context.startActivity(homepage);
                }else if(position==1)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/PostView.nhn?blogId=bada3347&logNo=220796100043&categoryNo=0&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView"));
                    context.startActivity(homepage);
                }else if(position==2)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=12942911&query=%EC%B2%9C%EC%A3%BC%EA%B5%90%EC%A0%84%EB%8F%99%EA%B5%90%ED%9A%8C"));
                    context.startActivity(homepage);
                }else if(position==3)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://terms.naver.com/entry.nhn?docId=948171&cid=42865&categoryId=42865"));
                    context.startActivity(homepage);
                }else if(position==4)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gdart.co.kr/"));
                    context.startActivity(homepage);
                }else if(position==5)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=11795803&query=%EC%B5%9C%EB%AA%85%ED%9D%AC%EB%AC%B8%ED%95%99%EA%B4%80"));
                    context.startActivity(homepage);
                }else if(position==6)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=36410556&query=%EC%A0%84%EC%A3%BC%EB%B6%80%EC%B1%84%EB%AC%B8%ED%99%94%EA%B4%80"));
                    context.startActivity(homepage);
                }else if(position==7)//은행로
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ttearth.com/world/asia/korea/jeonju/ginkgo_street.htm#.XY1dmkYzaUk"));
                    context.startActivity(homepage);
                }else if(position==8)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/PostView.nhn?blogId=bada3347&logNo=220796100043&categoryNo=0&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView"));
                    context.startActivity(homepage);
                }else if(position==9)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hanzi.co.kr/"));
                    context.startActivity(homepage);
                }else if(position==10)//승광재
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/accommodations/detail?entry=plt&id=17448775&query=%EC%8A%B9%EA%B4%91%EC%9E%AC"));
                    context.startActivity(homepage);
                }else if(position==11)//전통술박물관
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://urisul.net/"));
                    context.startActivity(homepage);
                }else if(position==12)//소리문화관
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g1143545-d10792043-Reviews-Jeonju_Sori_Culture_Center-Jeonju_Jeollabuk_do.html"));
                    context.startActivity(homepage);
                }else if(position==13)//전주김치문화관
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g1143545-d15675478-Reviews-Jeonju_Kimchi_Cultural_Center-Jeonju_Jeollabuk_do.html"));
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