package csejeonju2019.go.kr.insta;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;//바텀 네비게이션 뷰 (하단바)
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;
    private Frag4 frag4;
    private Frag5 frag5;
    private  FirstFragment fragment1;
    private space_list_frag space_list_frag;    //문화공간
    public experience_list_frag experience; //문화체험
    public Show_list_frag show; //공연
    private BackPressTwice backPressTwice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backPressTwice=new BackPressTwice(this);




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
        setFrag(0); //첫화면지정
    }
    @Override
    public void onBackPressed(){
        backPressTwice.onBackPressed();
    }
    //프레그먼트 교체실행
    public void setFrag(int n){
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        switch (n){
            case 0:
                frag1=new Frag1();
                ft.replace(R.id.main_frame, frag1);
                ft.commit();    //fragment를 다루기 위해 필요한 함수
                break;
            case 1:
                frag2=new Frag2();
                ft.replace(R.id.main_frame, frag2);
                ft.commit();
                break;
            case 2:
                frag3=new Frag3();
                ft.replace(R.id.main_frame, frag3);
                ft.commit();
                break;
            case 3:
                frag4=new Frag4();
                ft.replace(R.id.main_frame, frag4);
                ft.commit();
                break;
            case 4:
                frag5=new Frag5();
                ft.replace(R.id.main_frame, frag5);
                ft.commit();
                break;
        }
    }
    public void setFrag2(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        if(n==1){
            space_list_frag=new space_list_frag();
            ft.replace(R.id.main_frame, space_list_frag);
            ft.commit();    //문화공간
        }
        else if(n==2){
            experience=new experience_list_frag();
            ft.replace(R.id.main_frame, experience);
            ft.commit();    //문화체험
        } else if(n==3){
            show=new Show_list_frag();
            ft.replace(R.id.main_frame, show);
            ft.commit();    //공연정보
        }

    }
    private boolean checkPermissions() {
        int permissionState = ActivityCompat.checkSelfPermission(this, Manifest.permission.INTERNET);
        return permissionState == PackageManager.PERMISSION_GRANTED;
    }

}
