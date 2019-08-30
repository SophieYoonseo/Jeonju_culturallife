package csejeonju2019.go.kr.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class MainMenuFragment extends Fragment {

    public MainMenuFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_main_menu,container,false);

        String[] menuItems={"천우희1",
            "천우희2",
                "천우희3"
        };
        ListView listView=(ListView)view.findViewById(R.id.mainmenu);

        ArrayAdapter<String> listViewAdapter=new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_expandable_list_item_1,menuItems
        );
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(getActivity(),otheractivity.class);
                    startActivity(intent);
                    Toast.makeText(getActivity(),"천우희1선택",Toast.LENGTH_SHORT).show();
                }else if(i==1){
                    Toast.makeText(getActivity(),"천우희2선택",Toast.LENGTH_SHORT).show();
                }else if(i==2){
                    Toast.makeText(getActivity(),"천우희3선택",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
