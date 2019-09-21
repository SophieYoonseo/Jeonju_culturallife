package csejeonju2019.go.kr.insta;

import android.content.Context;
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
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider5, container, false);
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