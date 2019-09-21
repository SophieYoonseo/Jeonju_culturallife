package csejeonju2019.go.kr.insta;

import android.content.Context;
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
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider2, container, false);
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