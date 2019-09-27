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

public class Adapter5 extends PagerAdapter {
    private int[] images = {R.drawable.hanokmaulkwankangannae,
            R.drawable.sorimoonhwakwan,
            R.drawable.seongkwangjae,
            R.drawable.ohmokdae,
            R.drawable.jeontongmoonhwayeonsu,
            R.drawable.hyangkyo,
            R.drawable.hyangkyokil,
            R.drawable.wanpanbonmoon,
            R.drawable.ohmokdaekil,
            R.drawable.taezoro,
            R.drawable.doldamkil,
            R.drawable.choimeungheeekill,
            R.drawable.eungangro,
            R.drawable.yearsixhundred,
            R.drawable.kimchimoonhwa,
            R.drawable.hanokmaulkwankangannae


    };
//한옥마을관광안내소(주차장) → 소리문화관 → 승광재 → 전통한지원 → 오목대 → 전통문화연수원(동헌) → 전주향교 → 향교길 → 완판본문화관 → 오목대길(당산나무) → 태조로 → 경기전 돌담길 → 최명희길(최명희 문학관)
// → 은행로 → 600년 은행나무 → 전주김치문화관(구 한옥생활체험관) → 한옥마을 관광안내소(주차장)"
    String[] imagee={
            "한옥마을관광안내소",
            "소리문화관",
            "승광재",
            "오목대",
            "전통문화연수원",
            "전주향교",
            "향교길",
        "완판본문화관",
        "오목대길",
        "태조로",
        "경기전 돌담길",
        "최명희길",
        "은행로",
        "600년 은행나무",
        "전주김치문화관",
        "한옥마을관광안내소"




    };
    private LayoutInflater inflater;
    private Context context;
    public Adapter5(Context context){
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
        View v = inflater.inflate(R.layout.slider5, container, false);
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
                    //http://tour.jeonju.go.kr/index.9is?contentUid=9be517a74f72e96b014f82c717c008a6
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://tour.jeonju.go.kr/index.9is?contentUid=9be517a74f72e96b014f82c717c008a6"));
                    context.startActivity(homepage);
                }
                else if(position==1)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g1143545-d10792043-Reviews-Jeonju_Sori_Culture_Center-Jeonju_Jeollabuk_do.html"));
                    context.startActivity(homepage);
                } else if(position==2)
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/accommodations/detail?entry=plt&id=17448775&query=%EC%8A%B9%EA%B4%91%EC%9E%AC"));
                    context.startActivity(homepage);
                }else if(position==3)//오목대
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=20103217&query=%EC%98%A4%EB%AA%A9%EB%8C%80"));
                    context.startActivity(homepage);
                }else if(position==4)//전통문화연수원
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dongheon.or.kr/2013_korean/"));
                    context.startActivity(homepage);
                }
                else if(position==5)//전주향교
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=13208787&query=%EC%A0%84%EC%A3%BC%ED%96%A5%EA%B5%90"));
                    context.startActivity(homepage);
                } else if(position==6)//향교깃
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://jjhyanggyo.cafe24.com/"));
                    context.startActivity(homepage);
                } else if(position==7)//완판본문화관
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://wanpanbon.modoo.at/"));
                    context.startActivity(homepage);
                } else if(position==8)//오목대길
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%EC%A0%84%EB%9D%BC%EB%B6%81%EB%8F%84+%EC%A0%84%EC%A3%BC%EC%8B%9C+%EC%99%84%EC%82%B0%EA%B5%AC+%ED%92%8D%EB%82%A8%EB%8F%99+%EC%98%A4%EB%AA%A9%EB%8C%80%EA%B8%B8/data=!4m2!3m1!1s0x3570249dc22d8f01:0xfb79ed1f58d96896?sa=X&ved=2ahUKEwiKrd-B6u_kAhUeyosBHZ70ASsQ8gEwE3oECA0QBA"));
                    context.startActivity(homepage);
                } else if(position==9)//오목대길
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/PostView.nhn?blogId=bada3347&logNo=220796100043&categoryNo=0&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView"));
                    context.startActivity(homepage);
                } else if(position==10)//경기전돌담길
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/PostView.nhn?blogId=jungbongs31&logNo=221634460236&categoryNo=0&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView"));
                    context.startActivity(homepage);
                }
                else if(position==11)//최명희길
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%EC%A0%84%EB%9D%BC%EB%B6%81%EB%8F%84+%EC%A0%84%EC%A3%BC%EC%8B%9C+%EC%99%84%EC%82%B0%EA%B5%AC+%ED%92%8D%EB%82%A8%EB%8F%99+%EC%B5%9C%EB%AA%85%ED%9D%AC%EA%B8%B8/data=!4m2!3m1!1s0x357023618add86f7:0x418369869af30e31?sa=X&ved=2ahUKEwjJ28bE6u_kAhXoxYsBHeHeBmoQ8gEwE3oECAoQBA"));
                    context.startActivity(homepage);
                }else if(position==12)//은행로
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ttearth.com/world/asia/korea/jeonju/ginkgo_street.htm#.XY1jd0YzaUk"));
                    context.startActivity(homepage);
                }else if(position==13)//600년
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=sgyoung3532&logNo=220647513467&proxyReferer=https%3A%2F%2Fwww.google.com%2F"));
                    context.startActivity(homepage);
                }else if(position==14)//김치
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/attractions/detail?entry=plt&id=1974551320&query=%EC%A0%84%EC%A3%BC%EA%B9%80%EC%B9%98%EB%AC%B8%ED%99%94%EA%B4%80"));
                    context.startActivity(homepage);
                }else if(position==15)//김치
                {
                    Intent homepage=new Intent(Intent.ACTION_VIEW, Uri.parse("http://tour.jeonju.go.kr/index.9is?contentUid=9be517a74f72e96b014f82c717c008a6"));
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