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
        listView = (ListView)view.findViewById(R.id.listrecommand);

        ArrayList<String> items = new ArrayList<>();
        items.add("한옥마을 단숨에 보는 코스(1~2시간)");
        items.add("골목과 체험이 있는 코스(체험시간 포함 2~3시간)");
        items.add("산책과 사색이 있는 코스(2~3시간)");
        items.add("역사의 숨결을 느끼는 코스(2~3시간)");
        items.add("'사드락 사드락' 전주한옥마을 슬로투어 코스(3시간이상)");
        items.add("조선 태조 이성계 역사탐방 투어코스(2시간 이상)");
        items.add("한옥마을 및 주변연계코스 ① (1박2일)");
        items.add("한옥마을 및 주변연계코스 ② (1박2일)");
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

            else if("골목과 체험이 있는 코스(체험시간 포함 2~3시간)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.golmok);
                subitem.setText("오목대 → 태조로 → 전동성당 → 경기전 → 교동미술관 → 최명희문학관(체험) → 부채문화관(체험) → 은행로 → 태조로 → 전통한지원(체험) → 더보기...");
                //오목대 → 태조로 → 전동성당 → 경기전 → 교동미술관 → 최명희문학관(체험) → 부채문화관(체험) → 은행로 → 태조로 → 전통한지원(체험) → 승광재 → 전통술박물관(체험) → 소리문화관(체험) → 전주김치문화관(체험)
            }
            else if("산책과 사색이 있는 코스(2~3시간)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.sanchak);
                subitem.setText("풍남문 → 전동성당 → 경기전 → 오목대 → 전주향교 → 완판본문화관 → 오목교(다리) → 국립무형유산원 → 남천교(다리)");
            }

            else if("역사의 숨결을 느끼는 코스(2~3시간)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.yeoksa);
                subitem.setText("전주한벽문화관 → 국립무형유산원 → 충경사 → 남고사 → 남고산성(만경대, 억경대, 천경대) → 관성묘 → 산성천");
            }
            else if("'사드락 사드락' 전주한옥마을 슬로투어 코스(3시간이상)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.sadlock);
                subitem.setText("한옥마을관광안내소(주차장) → 소리문화관 → 승광재 → 전통한지원 → 오목대 → 전통문화연수원(동헌) → 전주향교 → 향교길 → 더보기....");
            //한옥마을관광안내소(주차장) → 소리문화관 → 승광재 → 전통한지원 → 오목대 → 전통문화연수원(동헌) → 전주향교 → 향교길 → 완판본문화관 → 오목대길(당산나무) → 태조로 → 경기전 돌담길 → 최명희길(최명희 문학관) → 은행로 → 600년 은행나무 → 전주김치문화관(구 한옥생활체험관) → 한옥마을 관광안내소(주차장)"
            }
            else if("조선 태조 이성계 역사탐방 투어코스(2시간 이상)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.chosun);
                subitem.setText("경기전 → 어진박물관 → 태조로 → 오목대 → 이목대 → 자만벽화마을");
            }
            else if("한옥마을 및 주변연계코스 ① (1박2일)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.hanokarray);
                subitem.setText("군경묘지 → 견훤왕궁터 → 승암산정상 → 치명자산성지 → 자연생태관 → 한벽당 → 전주향교 → 전통문화연수원(동헌) → 강암서예관 → 더보기...");
                //군경묘지 → 견훤왕궁터 → 승암산정상 → 치명자산성지 → 자연생태관 → 한벽당 → 전주향교 → 전통문화연수원(동헌) → 강암서예관 → 남부시장 → 풍남문 → 전동성당 → 경기전 → 교동미술관 → 최명희문학관 → 부채문화관 → 승광재 → 전통술박물관 → 전주김치문화관(구 한옥생활체험관)
            }
            else if("한옥마을 및 주변연계코스 ② (1박2일)".equals(items.get(position)))
            {
                imageView.setImageResource(R.drawable.hanokarray2);
                subitem.setText("전주객사 → 전라감영지(부영지) → 풍남문 → 남부시장(청년몰) → 전동성당 → 경기전 → 교동미술관 → 최명희문학관 → 부채문화관 → 더보기...");
                //전주객사 → 전라감영지(부영지) → 풍남문 → 남부시장(청년몰) → 전동성당 → 경기전 → 교동미술관 → 최명희문학관 → 부채문화관 → 600년 된 은행나무 → 동락원 → 전주김치문화관(구 한옥생활체험관) → 전통술박물관 → 전주전통한지원 → 오목대 → 당산나무 → 강암서예관 → 전주천 둔치 산책길 → 한벽루 → 자연생태관 → 치명자산성지
            }



            TextView textView = (TextView)v.findViewById(R.id.textView);
            textView.setText(items.get(position));

            final String text = items.get(position); //title출력위한;

            Button button = (Button)v.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Frag5.this.getContext(), text, Toast.LENGTH_SHORT).show();
                    if(text=="한옥마을 단숨에 보는 코스(1~2시간)")
                    {
                        Intent intent=new Intent(getActivity(),recommend1hanok.class);
                        startActivity(intent);
                    }
                    else if(text=="골목과 체험이 있는 코스(체험시간 포함 2~3시간)")
                    {
                        Intent intent=new Intent(getActivity(),recommend2golmok.class);
                        startActivity(intent);
                    }
                    else if(text=="산책과 사색이 있는 코스(2~3시간)")
                    {
                        Intent intent=new Intent(getActivity(),recommend3sanchak.class);
                        startActivity(intent);
                    }
                }
            });

            return v;
        }
    }



}
