package csejeonju2019.go.kr.insta;

import android.app.Activity;
import android.widget.Toast;

public class BackPressTwice {
    private long holdtime=0;
    private Toast toast;
    private Activity  activity;

    public BackPressTwice(Activity context){
        this.activity=context;
    }
    public void onBackPressed(){
        if(System.currentTimeMillis()>holdtime+3000){
            holdtime=System.currentTimeMillis();
            toast=Toast.makeText(activity,"뒤로 버튼을 한번 더 누르시면 종료됩니다",Toast.LENGTH_SHORT);
            return;
        }
        if(System.currentTimeMillis()<=holdtime+3000){
            activity.finish();
            toast.cancel();
        }

    }

}