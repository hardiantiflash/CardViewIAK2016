package com.example.hardianti.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hardianti on 11/26/16.
 */

public class ListitemHolder extends RecyclerView.ViewHolder {

    public ImageView imgAvatar;
    public TextView txtJudul;
    public  TextView txtDeskripsi;
    public CardView itemCv;

    public ListitemHolder(View itemView) {
        super(itemView);
        imgAvatar = (ImageView) itemView.findViewById(R.id.list_logo);
        txtJudul = (TextView) itemView.findViewById(R.id.judul);
        txtDeskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
        itemCv=(CardView) itemView.findViewById(R.id.item_cv);
    }

}
