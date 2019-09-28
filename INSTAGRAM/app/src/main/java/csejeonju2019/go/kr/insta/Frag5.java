package csejeonju2019.go.kr.insta;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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

import java.lang.reflect.Array;
import java.util.ArrayList;

public  class Frag5 extends Fragment{
    ListView listView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.frag5,container,false);
        listView = (ListView)view.findViewById(R.id.listrecommand);

        ArrayList<String> items = new ArrayList<>();
        items.add("한옥마을 단숨에 보는 코스");
        items.add("골목과 체험이 있는 코스");
        items.add("산책과 사색이 있는 코스");
        items.add("역사의 숨결을 느끼는 코스");
        items.add("'사드락 사드락' 전주한옥마을 슬로투어 코스");
        items.add("조선 태조 이성계 역사탐방 투어코스");
        items.add("전주 토박이의 추천루트");
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

           // TextView subitem=(TextView)v.findViewById(R.id.subtext);
            // 리스트뷰의 아이템에 이미지를 변경한다.
            //전동성당 → 경기전 → 교동미술관 → 최명희문학관 → 부채문화관 → 은행로 → 태조로 사거리 → 오목대
            if("한옥마을 단숨에 보는 코스(1~2시간)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.hanokcourse);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),recommend1hanok.class);
                        startActivity(intent);
                    }
                });
                //subitem.setText("전동성당 → 경기전 → 교동미술관 → 최명희문학관 → 부채문화관 → 은행로 → 태조로 사거리 → 오목대");
            }

            else if("골목과 체험이 있는 코스(체험시간 포함 2~3시간)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.golmok);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),recommend2golmok.class);
                        startActivity(intent);
                }
                });
                //subitem.setText("오목대 → 태조로 → 전동성당 → 경기전 → 교동미술관 → 최명희문학관(체험) → 부채문화관(체험) → 은행로 → 태조로 → 전통한지원(체험) → 더보기...");
                //오목대 → 태조로 → 전동성당 → 경기전 → 교동미술관 → 최명희문학관(체험) → 부채문화관(체험) → 은행로 → 태조로 → 전통한지원(체험) → 승광재 → 전통술박물관(체험) → 소리문화관(체험) → 전주김치문화관(체험)
            }
            else if("산책과 사색이 있는 코스(2~3시간)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.sanchak);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),recommend3sanchak.class);
                        startActivity(intent);
                    }
                });
           //     subitem.setText("풍남문 → 전동성당 → 경기전 → 오목대 → 전주향교 → 완판본문화관 → 오목교(다리) → 국립무형유산원 → 남천교(다리)");
            }

            else if("역사의 숨결을 느끼는 코스(2~3시간)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.yeoksa);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),recommend4yeoksa.class);
                        startActivity(intent);
                    }
                });
                //subitem.setText("전주한벽문화관 → 국립무형유산원 → 충경사 → 남고사 → 남고산성(만경대, 억경대, 천경대) → 관성묘 → 산성천");
            }
            else if("'사드락 사드락' 전주한옥마을 슬로투어 코스(3시간이상)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.sadlock);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),recommend5sadlock.class);
                        startActivity(intent);
                    }
                });
                //subitem.setText("한옥마을관광안내소(주차장) → 소리문화관 → 승광재 → 전통한지원 → 오목대 → 전통문화연수원(동헌) → 전주향교 → 향교길 → 더보기....");
            //한옥마을관광안내소(주차장) → 소리문화관 → 승광재 → 전통한지원 → 오목대 → 전통문화연수원(동헌) → 전주향교 → 향교길 → 완판본문화관 → 오목대길(당산나무) → 태조로 → 경기전 돌담길 → 최명희길(최명희 문학관) → 은행로 → 600년 은행나무 → 전주김치문화관(구 한옥생활체험관) → 한옥마을 관광안내소(주차장)"
            }
            else if("조선 태조 이성계 역사탐방 투어코스(2시간 이상)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.chosun);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),recommend6chosun.class);
                        startActivity(intent);
                    }
                });
                //subitem.setText("경기전 → 어진박물관 → 태조로 → 오목대 → 이목대 → 자만벽화마을");
            }
            /*
            else if("전주 토박이의 추천루트".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.tobakee);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(),recommend7tobak.class);
                        startActivity(intent);
                    }
                });
                //subitem.setText("경기전 → 어진박물관 → 태조로 → 오목대 → 이목대 → 자만벽화마을");
            }

             */





            TextView textView = (TextView)v.findViewById(R.id.textView);
            textView.setText(items.get(position));


            final String text = items.get(position); //title출력위한;




            return v;
        }
    }



}
