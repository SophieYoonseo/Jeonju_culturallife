package csejeonju2019.go.kr.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainMenuFragment mainmenu=new MainMenuFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,mainmenu).commit();
    }
}
