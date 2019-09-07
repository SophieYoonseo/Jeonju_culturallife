package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public  class Frag5 extends Fragment{

    private Frag2 frag2;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        frag2=new Frag2();
        View view = inflater.inflate(R.layout.frag5, container, false);
        Button space=(Button)view.findViewById(R.id.button_space);
        Button experience=(Button)view.findViewById(R.id.button_experience);
        Button festival=(Button)view.findViewById(R.id.button_festival);
        Button moonhwa=(Button)view.findViewById(R.id.button_moonhwa);
        space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),space_list_acitivty.class);//문화공간
                startActivity(intent);

            }
        });
       experience.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(),experience_list_activitiy.class);//문화체험
               startActivity(intent);
           }
       });
        festival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),show_list_activity.class);////공연
                startActivity(intent);
            }
        });
        moonhwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),jijung_cultural_property_list_activity.class);////지정문화재
                startActivity(intent);
            }
        });


        return view;
    }
}
