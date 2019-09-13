package kr.go.dbwrite;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

@IgnoreExtraProperties
public class Account implements Serializable {
    public String AccessToken, AccessTime, LoginType;
    public Account() {}
    public Account(String token, String time, String type) {
        this.AccessToken = token;
        this.AccessTime = time;
        this.LoginType = type;
    }
}


