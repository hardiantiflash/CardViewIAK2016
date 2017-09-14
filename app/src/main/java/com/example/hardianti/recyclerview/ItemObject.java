package com.example.hardianti.recyclerview;

/**
 * Created by hardianti on 11/26/16.
 */

public class ItemObject {
    private int id;
    private String judul;
    private String deskripsi;

    public ItemObject(int id, String judul, String deskripsi) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
