package csejeonju2019.go.kr.insta;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public  class Frag5 extends Fragment{
    ListView listView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.frag5,container,false);
        listView = (ListView)view.findViewById(R.id.listView);

        ArrayList<String> items = new ArrayList<>();
        items.add("한옥마을 단숨에 보는 코스(1~2시간)");
        items.add("Busan");
        items.add("Daegu");
        items.add("Jeju");

        CustomAdapter adapter = new CustomAdapter(getContext(), 0, items);
        listView.setAdapter(adapter);



        return view;
    }
    private class CustomAdapter extends ArrayAdapter<String> {
        private ArrayList<String> items;

        public CustomAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
            super(context, textViewResourceId, objects);
            this.items = objects;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.listviewitemfrag5, null);
            }

            // ImageView 인스턴스
            ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
            TextView subitem=(TextView)v.findViewById(R.id.subtext);
            // 리스트뷰의 아이템에 이미지를 변경한다.
            if("한옥마을 단숨에 보는 코스(1~2시간)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.hanokcourse);
                subitem.setText("전동성당 → 경기전 → 교동미술관 → 최명희문학관 → 부채문화관 → 은행로 → 태조로 사거리 → 오목대");
            }

            else if("Busan".equals(items.get(position)))
                imageView.setImageResource(R.drawable.balloons);
            else if("Daegu".equals(items.get(position)))
                imageView.setImageResource(R.drawable.amkak);
            else if("Jeju".equals(items.get(position)))
                imageView.setImageResource(R.drawable.hmm);


            TextView textView = (TextView)v.findViewById(R.id.textView);
            textView.setText(items.get(position));

            final String text = items.get(position);
            Button button = (Button)v.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Frag5.this.getContext(), text, Toast.LENGTH_SHORT).show();
                }
            });

            return v;
        }
    }



}
