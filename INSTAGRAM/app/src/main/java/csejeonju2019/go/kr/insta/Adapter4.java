package csejeonju2019.go.kr.insta;

import android.content.Context;
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
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider4, container, false);
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