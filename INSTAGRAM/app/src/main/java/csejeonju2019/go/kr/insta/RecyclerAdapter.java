package csejeonju2019.go.kr.insta;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private space_list_acitivty fragment1;
    Context context;
    List<Recycler_item> items;
    int item_layout;
    public RecyclerAdapter(Context context, List<Recycler_item> items, int item_layout) {
        this.context=context;
        this.items=items;
        this.item_layout=item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,null);
        return new ViewHolder(v);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Recycler_item item=items.get(position);
        Drawable drawable=context.getResources().getDrawable(item.getImage());
        holder.image.setBackground(drawable);
        holder.title.setText(item.getTitle());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //카드뷰 클릭은 여기서
                if(item.getTitle()=="공연행사 정보")
                {
                    Intent intent=new Intent(context,show_list_activity.class);
                    context.startActivity(intent);
                }else if(item.getTitle()=="문화공간 정보")
                {
                    Intent intent=new Intent(context,space_list_acitivty.class);
                    context.startActivity(intent);
                }else if(item.getTitle()=="문화체험 정보")
                {
                    Intent intent=new Intent(context,experience_list_activitiy.class);
                    context.startActivity(intent);
                }else if(item.getTitle()=="지정문화재 정보")
                {
                    Intent intent=new Intent(context,jijung_cultural_property_list_activity.class);
                    context.startActivity(intent);
                }else if(item.getTitle()=="향토문화유산 정보")
                {
                    Intent intent=new Intent(context,Hyangji_Cultural_Heritage_list_activity.class);
                    context.startActivity(intent);
                }else if(item.getTitle()=="전주축제 정보")
                {
                    Intent intent=new Intent(context,festival_list_activity.class);
                    context.startActivity(intent);
                }

                Toast.makeText(context,item.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.image);
            title=(TextView)itemView.findViewById(R.id.title);
            cardview=(CardView)itemView.findViewById(R.id.cardview);
        }
    }
}
