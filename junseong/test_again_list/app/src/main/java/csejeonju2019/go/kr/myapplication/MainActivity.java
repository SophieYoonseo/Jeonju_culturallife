package csejeonju2019.go.kr.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ListView lvArticleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvArticleList = (ListView) findViewById(R.id.listlist);
        List articleList = new ArrayList(); for (int i = 0; i < 300; i++) {
            articleList.add(new ArticleVo("제목입니다..." + i, "글쓴이입니다.", new Random().nextInt(9999)));
        }
        lvArticleList.setAdapter(new ArticleListViewAdapter(articleList, this));


    }
    private class ArticleListViewAdapter extends BaseAdapter{
        private List articleList;
        private Context context;
        public ArticleListViewAdapter(List articleList,Context context){
            this.articleList=articleList;
            this.context=context;
        }
        public int getCount(){
            return articleList.size();
        }
        public Object getItem(int position){
            return articleList.get(position);
        }
        public long getItemId(int position){
            return position;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView==null){
                LayoutInflater inflater=(LayoutInflater)context.getSystemService(LAYOUT_INFLATER_SERVICE);
                convertView=inflater.inflate(R.layout.listitem,parent,false);
            }
            TextView tvsubject=(TextView) convertView.findViewById(R.id.subject);
            TextView author=(TextView)convertView.findViewById(R.id.author);
            TextView hitcount=(TextView)convertView.findViewById(R.id.hit);

            ArticleVo article=(ArticleVo)getItem(position);
            tvsubject.setText(article.getSubject());
            author.setText(article.getAuthor());
            hitcount.setText(article.getHitCoutn()+"");
            return convertView;
        }
    }
}
