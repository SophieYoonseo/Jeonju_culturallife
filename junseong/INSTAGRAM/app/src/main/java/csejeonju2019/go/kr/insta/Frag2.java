package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;



public class Frag2 extends Fragment
{
    private FragmentManager fm;
    private FragmentTransaction ft;
    private culture_experience fragment1;

    public Frag2()
    {
        // required
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.frag2, container, false);
        ImageButton button1=(ImageButton)view.findViewById(R.id.culture_space);
        ImageButton button2=(ImageButton)view.findViewById(R.id.cultural_experience);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(getActivity(),after_experience.class);
            startActivity(intent);

            Toast.makeText(getActivity(),"호출되라좀",Toast.LENGTH_SHORT).show();


            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            //문화체험 리스트 출력

            }
        });


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }






}
