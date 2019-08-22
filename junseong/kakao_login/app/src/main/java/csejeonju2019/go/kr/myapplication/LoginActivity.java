package csejeonju2019.go.kr.myapplication;

import android.content.Context;

import android.content.pm.PackageInfo;

import android.content.pm.PackageManager;

import android.content.pm.Signature;

import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Base64;

import android.util.Log;

import android.view.View;

import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.kakao.usermgmt.LoginButton;



import java.security.MessageDigest;



public class LoginActivity extends AppCompatActivity {

    private Context mContext;



    private Button btn_custom_login;

    private LoginButton btn_kakao_login;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        mContext = getApplicationContext();



        btn_custom_login = (Button) findViewById(R.id.btn_custom_login);

        btn_custom_login.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                btn_kakao_login.performClick();

            }

        });

        btn_kakao_login = (LoginButton) findViewById(R.id.btn_kakao_login);



    }

}