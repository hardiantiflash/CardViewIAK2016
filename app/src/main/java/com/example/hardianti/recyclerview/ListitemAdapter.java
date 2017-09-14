package com.example.hardianti.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;


/*** Created by hardianti on 11/26/16.
 */

public class ListitemAdapter extends RecyclerView.Adapter<ListitemHolder> {
    Context context;
    List<ItemObject> itemObjects;

    public ListitemAdapter (Context context, List<ItemObject> itemObjects){
        this.context= context;
        this.itemObjects=itemObjects;

    }
    @Override
    public ListitemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, null);
        return new ListitemHolder(view);
    }

    @Override
    public void onBindViewHolder(ListitemHolder holder, final int position) {
        holder.imgAvatar.setImageResource(itemObjects.get(position).getId());
        holder.txtJudul.setText(itemObjects.get(position).getJudul());
        holder.txtDeskripsi.setText("Lihat Selengkapnya...");
        holder.itemCv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(view.getContext(), DetailActivity.class);
                a.putExtra("id_img", itemObjects.get(position).getId());
                a.putExtra("id_Judul", itemObjects.get(position).getJudul());
                a.putExtra("id_Deskripsi", itemObjects.get(position).getDeskripsi());
                view.getContext().startActivity(a);
            }
        });

    }



    @Override
    public int getItemCount() {
        return itemObjects.size();
    }
}
