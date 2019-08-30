package csejeonju2019.go.kr.insta;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class culture_space extends Fragment {
  public culture_space(){

  }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1, container, false);
        return view;
    }

}
