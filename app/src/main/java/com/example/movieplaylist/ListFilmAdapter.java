package com.example.movieplaylist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.ListViewHolder>{
    private ArrayList<Film>  listfilm;

    public ListFilmAdapter(ArrayList<Film> list) {
        this.listfilm = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_film, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Film film = listfilm.get(position);
        Glide.with(holder.itemView.getContext())
                .load(film.getPoster())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPoster);
        holder.tvTitle.setText(film.getTitle());
        holder.tvDescription.setText(film.getDescription());

    }

    @Override
    public int getItemCount() {
        return listfilm.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoster;
        TextView tvTitle;
        TextView tvDescription;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPoster = itemview.findViewById(R.id.img_item_film);
            tvTitle = itemview.findViewById(R.id.tv_item_title);
            tvDescription = itemview.findViewById(R.id.tv_deskripsi);
        }
    }
}
