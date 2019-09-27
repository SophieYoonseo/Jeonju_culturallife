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

public class Adapter4 extends PagerAdapter {
    private int[] images = {R.drawable.jeonjuhanbeokmoonhwa,
            R.drawable.kooklipmooheyong,
            R.drawable.choongkeongsa,
            R.drawable.namgosa,
            R.drawable.namgosansung,
            R.drawable.kwansungmyo,
            R.drawable.sansungcheon,


    };
    //전주한벽문화관 → 국립무형유산원 → 충경사 → 남고사 → 남고산성(만경대, 억경대, 천경대) → 관성묘 → 산성천
    String[] imagee={
            "전주한벽문화관",
            "국립무형유산원",
            "충경사",
            "남고사",
            "남고산성(만경대,억경대,천경대)",
            "관성묘",
            "산성천",



    };
    private LayoutInflater inflater;
    private Context context;
    public Adapter4(Context context){
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
        View v = inflater.inflate(R.layout.slider4, container, false);
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
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=11671624&query=%EC%A0%84%EC%A3%BC%ED%95%9C%EB%B2%BD%EB%AC%B8%ED%99%94%EA%B4%80"));
                    context.startActivity(homepage);
                }
                else if(position==1)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=17452519&query=%EA%B5%AD%EB%A6%BD%EB%AC%B4%ED%98%95%EC%9C%A0%EC%82%B0%EC%9B%90"));
                    context.startActivity(homepage);
                }   else if(position==2)//충경사
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/twinkia?Redirect=Log&logNo=221608849414"));
                    context.startActivity(homepage);
                }  else if(position==3)//남고사
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=smjkso&logNo=220515938866&proxyReferer=https%3A%2F%2Fwww.google.com%2F"));
                    context.startActivity(homepage);
                }  else if(position==4)//남고산성
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=jcjkks&logNo=220816552306&proxyReferer=https%3A%2F%2Fwww.google.com%2F"));
                    context.startActivity(homepage);
                } else if(position==5)//산성천
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=turpu&logNo=220765748121&proxyReferer=https%3A%2F%2Fwww.google.com%2F"));
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