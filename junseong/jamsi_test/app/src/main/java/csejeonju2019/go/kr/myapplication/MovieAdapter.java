package csejeonju2019.go.kr.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private ArrayList<Movie> items = new ArrayList<>();

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder viewHolder, int position) {

        Movie item = items.get(position);

        Glide.with(viewHolder.itemView.getContext())
                .load(item.getUrl())
                .into(viewHolder.ivMovie);

        viewHolder.tvTitle.setText(item.getTitle());
        viewHolder.tvContent.setText(item.getContent());
        viewHolder.tvGenre.setText(item.getGenre());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(ArrayList<Movie> items) {
        this.items = items;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivMovie;
        TextView tvTitle, tvContent, tvGenre;

        ViewHolder(View itemView) {
            super(itemView);

            ivMovie = itemView.findViewById(R.id.iv_item_movie);

            tvTitle = itemView.findViewById(R.id.tv_item_movie_title);
            tvContent = itemView.findViewById(R.id.tv_item_movie_content);
            tvGenre = itemView.findViewById(R.id.tv_item_movie_genre);
        }
    }
}
