package com.example.cardview_test1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jizard.testapplication.NoticeActivity;
import com.example.jizard.testapplication.R;
import com.example.jizard.testapplication.datatype.NoticeData;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by gold24park on 2016. 4. 4..
 */
public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.ViewHolder> {
    Context context;
    ArrayList<NoticeData> noticeList; //공지사항 정보 담겨있음

    public NoticeAdapter(Context context, ArrayList<NoticeData> noticeList) {
        Log.e("[IMPORTANT] ", "init size" + noticeList.size());
        this.context = context;
        this.noticeList = noticeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //recycler view에 반복될 아이템 레이아웃 연결
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notice,null);
        return new ViewHolder(v);
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    /** 정보 및 이벤트 처리는 이 메소드에서 구현 **/
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        NoticeData noticeData = noticeList.get(position);
        final int pos = position;
        //정보 다듬기
        String content = noticeData.content;
        String title = noticeData.title;
        if(content.length() > 50 ) {
            content = content.substring(0,50) + "..."; //50자 자르고 ... 붙이기
        }
        if(title.length() > 16 ) {
            title = title.substring(0,16) + "..."; //18자 자르고 ... 붙이기
        }
        //정보 세팅해서 출력
        if(noticeData.img1.isEmpty()) {
            holder.rl_image.setVisibility(View.GONE);
        } else {
            //resize = pixel
            Picasso.with(context).load(noticeData.img1).into(holder.iv_image);
        }
        holder.tv_writer.setText(noticeData.writer); //작성자
        holder.tv_title.setText(title); //제목
        holder.tv_content.setText(content); //내용 일부
        holder.tv_date.setText(noticeData.date); //작성일
        holder.tv_count.setText(noticeData.count); //댓글 수
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, NoticeActivity.class);
                i.putExtra("writer", noticeList.get(pos).writer);
                i.putExtra("title", noticeList.get(pos).title);
                i.putExtra("content", noticeList.get(pos).content);
                i.putExtra("regist_day", noticeList.get(pos).date);
                i.putExtra("r_count", noticeList.get(pos).count);
                i.putExtra("cnum", noticeList.get(pos).cnum);
                i.putExtra("img1", noticeList.get(pos).img1);
                i.putExtra("img2", noticeList.get(pos).img2);
                i.putExtra("img3", noticeList.get(pos).img3);
                i.putExtra("id", noticeList.get(pos).id);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.noticeList.size();
    }
    /** item layout 불러오기 **/
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;
        TextView tv_date;
        TextView tv_content;
        TextView tv_writer;
        TextView tv_count;
        CardView cv;
        ImageView iv_image;
        RelativeLayout rl_image;

        public ViewHolder(View v) {
            super(v);
            tv_title = (TextView) v.findViewById(R.id.tv_title);
            tv_date = (TextView) v.findViewById(R.id.tv_date);
            tv_content = (TextView) v.findViewById(R.id.tv_content);
            tv_writer = (TextView) v.findViewById(R.id.tv_writer);
            tv_count = (TextView) v.findViewById(R.id.tv_count);
            cv = (CardView) v.findViewById(R.id.cv);
            iv_image = (ImageView) v.findViewById(R.id.iv_image);
            rl_image = (RelativeLayout) v.findViewById(R.id.rl_image);
        }
    }
}


출처: https://jizard.tistory.com/40 [GEUMSON]