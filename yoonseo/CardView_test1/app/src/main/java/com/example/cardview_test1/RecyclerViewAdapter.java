package com.example.cardview_test1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview_test1.Item;
import com.example.cardview_test1.ItemRepository;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolders> {

    List<Item> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<Item> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layout);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.title.setText(itemList.get(position).getTitle());
        holder.description.setText(itemList.get(position).getDescription());
    }
    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView description;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.text_title);
            description = (TextView) itemView.findViewById(R.id.text_description);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), ((TextView) view.findViewById(R.id.text_title)).getText() + "Item Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
