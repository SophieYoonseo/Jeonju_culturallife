package csejeonju2019.go.kr.insta;

//19.09.23 MrJANG: for KAKAO
public class Account
{
    public String AccessToken, AccessTime, LoginType;

    public Account(String token, String time, String type)
    {
        this.AccessToken = token;
        this.AccessTime = time;
        this.LoginType = type;
    }
}