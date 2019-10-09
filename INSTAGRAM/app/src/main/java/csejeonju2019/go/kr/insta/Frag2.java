package csejeonju2019.go.kr.insta;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Frag2 extends Fragment{
    /*
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
       */
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2, container, false);
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<Recycler_item> items=new ArrayList<>();
        Recycler_item[] item=new Recycler_item[6];
        item[0]=new Recycler_item(R.drawable.festival,"전주축제 정보");
        item[1]=new Recycler_item(R.drawable.show, "공연행사 정보");
        item[2]=new Recycler_item(R.drawable.yousan,"향토문화유산 정보");
        item[3]=new Recycler_item(R.drawable.jeonju,"지정문화재 정보");
        item[4]=new Recycler_item(R.drawable.experience,"문화체험 정보");
        item[5]=new Recycler_item(R.drawable.space1,"문화공간 정보");

        for(int i=0; i<6; i++){
            items.add(item[i]);
        }

        recyclerView.setAdapter(new RecyclerAdapter(getActivity(),items,R.layout.frag2));

        return view;

    }
}
