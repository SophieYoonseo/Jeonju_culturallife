package csejeonju2019.go.kr.insta;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Frag5 extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.frag5,container,false);

        String[] menuItems={"전주역사박물관",
                "공예공방촌1단지(꽃숙이)",
                "인후문화의집",
                "전주자연생태관",
                "목우헌",
                "전라북도 교육문화회관",
                "우아 문화의집",
                "전주대학교어린이영어도서관",
                "전주완산시립도서관",
                "바이전주관",
                "한옥생활체험관",
                "전통술박물관",
                "전주시청소년상담복지센터(YWCA)",
                "전주삼천도서관",
                "덕진 청소년 수련방,놀이마당",
                "동학혁명기념관",
                "국립무형유산원",
                "한지관",
                "전주 목판서화 체험관",
                "전북예술회관",
                "창작극회.창작소극장",
                "전주부채문화관",
                "완판본 문화관",
                "전주 덕진예술회관",
                "청소년문화광장",
                "한국소리문화의전당",
                "한방문화센터",
                "전주한지박물관",
                "전주서신도서관",
                "전주인후도서관",
                "전주금암도서관",
                "승광재",
                "삼천 문화의 집",
                "한옥마을 아트홀",
                "전주시 청소년 문화의 집",
                "장현식고택",
                "완산 청소년 문화의 집",
                "전주공예품전시관",
                "고전번역교육원",
                "정읍고택",
                "태조어진 박물관",
                "한지산업지원센터",
                "천년전주명품ONN",
                "전주책마루어린이도서관",
                "전북대학교 삼성문화회관",
                "전주자수민속박물관",
                "전주한벽문화관",
                "국립전주박물관",
                "여명 카메라 박물관",
                "전주소리문화관",
                "전주전통한지원",
                "전주전통문화연수원",
                "전주동헌",
                "진북문화의 집",
                "솔내청소년수련관",
                "임실 진참봉 고택",
                "혼불문학공원",
                "전주송천도서관",
                "강암서예관",
                "덕진동 청소년문화의 집",
                "교동미술관",
                "효자문화의집",
                "최명희문학관",
                "강암서예관",
                "전주시청소년자유센터",
                "리빙콘텐츠DIT센터",
                "김치문화관",
                "전주시민놀이터",
                "한옥마을역사관",
                "팔복예술공장",
                "전주미술관",
                "우진문화공간",
                "전주효자도서관",
                "한옥마을선비문화관",
                "전주건지도서관",
                "전주쪽구름도서관",
                "전주아중도서관",
                "한국전통문화전당",
                "전주평화도서관"
                //79개
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
                    Intent intent=new Intent(getActivity(),after_experience.class);
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
