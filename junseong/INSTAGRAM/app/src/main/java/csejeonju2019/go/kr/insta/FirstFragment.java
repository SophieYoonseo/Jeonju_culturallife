package csejeonju2019.go.kr.insta;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;


public class FirstFragment extends Fragment  {
    // Store instance variables
    private String title;
    private int page;
    int i=0;
    ImageView imageView=null;
    private View view;
    // newInstance constructor for creating fragment with arguments
    public static FirstFragment newInstance(int page, String title) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragment.setArguments(args);
        return fragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");

    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ImageButton button=(ImageButton)view.findViewById(R.id.button);
         imageView=(ImageView)view.findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                i=1-i;
                if(i==0)
                    imageView.setImageResource(R.drawable.slide2);
                else
                    imageView.setImageResource(R.drawable.slide3);
            }
        });

        return view;
    }
}