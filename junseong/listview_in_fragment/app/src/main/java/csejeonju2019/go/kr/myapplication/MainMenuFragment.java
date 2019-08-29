package csejeonju2019.go.kr.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        return view;
    }
}
