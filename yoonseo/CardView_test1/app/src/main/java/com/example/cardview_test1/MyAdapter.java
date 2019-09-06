package com.example.cardview_test1;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Seongwook on 2017. 1. 16..
 */
class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<DataSet> mDataset;
    private Context mContext;
// Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView mImageView;
        public TextView tvName,tvAddr,tvNumber ;
        public CardView cvItem; //for touch listener
        public ViewHolder(View view) {
            super(view);
            mImageView = (ImageView)view.findViewById(R.id.id_imgview1);
            tvName = (TextView)view.findViewById(R.id.id_tv_name);
            tvAddr = (TextView)view.findViewById(R.id.id_tv_addr);
            tvNumber = (TextView)view.findViewById(R.id.id_tv_number);
            cvItem = (CardView)view.findViewById(R.id.id_cardview1);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(Context mContext, ArrayList<DataSet> mDataset) {
        this.mContext = mContext;
        this.mDataset = mDataset;

    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
// create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);
// set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String selItem = mDataset.get(position).strName;

// - get element from your dataset at this position
// - replace the contents of the view with that element
        holder.tvName.setText(mDataset.get(position).strName);
        holder.tvAddr.setText(mDataset.get(position).strAddr);
        holder.tvNumber.setText(mDataset.get(position).strNumber);
        holder.mImageView.setImageResource(mDataset.get(position).img);

        holder.cvItem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(mContext,selItem,Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}// end of class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
