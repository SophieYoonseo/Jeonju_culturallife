package kr.go.dbwrite;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class Account implements Serializable {
    public String AccessToken, AccessTime, LoginType;
    public Account() {}

    public Account(String token, String time, String type) {
        this.AccessToken = token;
        this.AccessTime = time;
        this.LoginType = type;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("AccessToken", AccessToken);
        result.put("AccessTime", AccessTime);
        result.put("LoginType", LoginType);

        return result;
    }
}


