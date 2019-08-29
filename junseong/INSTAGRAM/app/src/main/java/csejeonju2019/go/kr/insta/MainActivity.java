package csejeonju2019.go.kr.insta;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;//바텀 네비게이션 뷰 (하단바)
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;
    private Frag4 frag4;
    private Frag5 frag5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_airplane:
                        frag1=new Frag1();
                        setFrag(0);
                        break;
                    case R.id.action_star:
                        setFrag(1);
                        break;
                    case R.id.station:
                        setFrag(2);
                        break;
                    case R.id.black:
                        setFrag(3);
                        break;
                    case R.id.nature:
                        setFrag(4);
                        break;
                }
                return true;
            }
        });
        frag1=new Frag1();
        frag2=new Frag2();
        frag3=new Frag3();
        frag4=new Frag4();
        frag5=new Frag5();
        setFrag(0);//첫화면지정
    }
    //프레그먼트 교체실행
    private void setFrag(int n){
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        switch (n){
            case 0:
                frag1=new Frag1();
                ft.replace(R.id.main_frame,frag1);
               ft.commit();
                break;
            case 1:
                frag2=new Frag2();
                ft.replace(R.id.main_frame,frag2);
                ft.commit();
                break;
            case 2:
                frag3=new Frag3();
                ft.replace(R.id.main_frame,frag3);
                ft.commit();
                break;
            case 3:
                frag4=new Frag4();
                ft.replace(R.id.main_frame,frag4);
                ft.commit();
                break;
            case 4:
                frag5=new Frag5();
                ft.replace(R.id.main_frame,frag5);
                ft.commit();
                break;
        }
    }
}
