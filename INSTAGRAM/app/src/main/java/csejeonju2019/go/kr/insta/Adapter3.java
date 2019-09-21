package csejeonju2019.go.kr.insta;

import android.content.Context;
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
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider3, container, false);
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