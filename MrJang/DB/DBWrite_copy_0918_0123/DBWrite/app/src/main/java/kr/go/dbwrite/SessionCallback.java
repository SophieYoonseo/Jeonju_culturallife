package kr.go.dbwrite;


import android.util.Log;
import android.widget.Toast;


import com.kakao.auth.ISessionCallback;

import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.MeResponseCallback;

import com.kakao.usermgmt.response.model.UserProfile;
import com.kakao.util.exception.KakaoException;


//0914 MrJang Kakako Callback create! (return the results with informations after login)
public class SessionCallback implements ISessionCallback
{
    MainActivity mMainActivity;

    //로그인에 성공한 상태
    @Override
    public void onSessionOpened()
    {
        requestMe();
    }

    //로그인에 실패한 상태
    @Override
    public void onSessionOpenFailed(KakaoException exception)
    {
        Log.e("SessionCallback ::", "onSessionOpenFailed:"+exception.getMessage());
    }

    //사용자 정보 요청
    public void requestMe()
    {
        //사용자 정보 요청 결과에 대한 Callback
        UserManagement.getInstance().requestMe(new MeResponseCallback()
        {
            //세션 오픈 실패, 세션이 삭제된 경우
            @Override
            public void onSessionClosed(ErrorResult errorResult)
            {
                Log.e("SessionCallback ::","onSessionClosed:"+errorResult.getErrorMessage());
            }

            //회원이 아닌 경우,
            @Override
            public void onNotSignedUp()
            {
                Log.e("SessionCallback::","onNotSignedUp");
            }

            //사용자정보 요청에 성공한 경우,
            @Override
            public void onSuccess(UserProfile userProfile)
            {
                Log.e("SessionCallback::","onSuccess");

                String nickname = userProfile.getNickname();
                String email = userProfile.getEmail();
                String profileImagePath = userProfile.getProfileImagePath();
                String thumnailPath = userProfile.getThumbnailImagePath();
                String UUID = userProfile.getUUID();
                long id = userProfile.getId();

                Log.e("Profile :", nickname+"");
                Log.e("Profile :", email+"");
                Log.e("Profile :", profileImagePath+"");
                Log.e("Profile :", thumnailPath+"");
                Log.e("Profile :", UUID+"");
                Log.e("Profile :", id+"");

                //0916 mrJang added!
                mMainActivity = new MainActivity();
                //mMainActivity.callKakaoDatabase();
                mMainActivity.writeAccountInfo(email,"kakao");

            }

            //사용자 정보 요청 실패
            @Override
            public void onFailure(ErrorResult errorResult)
            {
                Log.e("SessionCallback ::","onFailure :" + errorResult.getErrorMessage());
            }
        });
    }
}