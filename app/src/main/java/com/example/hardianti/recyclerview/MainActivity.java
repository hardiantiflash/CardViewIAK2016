package com.example.hardianti.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView listItem;
    LinearLayoutManager linearLayout;

    List<ItemObject> abc;
    ListitemAdapter adapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //casting
        listItem = (RecyclerView) findViewById(R.id.lst_item);

        //inisialisasi
        linearLayout = new LinearLayoutManager(this);

        //implement
        listItem.setLayoutManager(linearLayout);

        // tambah data
        abc=new ArrayList<>();
        abc.add( new ItemObject(R.drawable.ole,"Yuli Hardianti", "Yuli Hardianti\n" +
                "Ole\n" +
                "1996 june 24\n" +
                "Moeslem\n" +
                "female\n" +
                "jl.M. Yusuf raya no 42\n" +
                "Single , no Children  \""));
            abc.add(new ItemObject(R.drawable.killua, "Killua Zoldyk","Killua Zoldyk\n" +
                  " Killua\n" +
                  " 1997 April 28\n" +
                  " Khatolik\n" +
                  " male\n" +
                  " jl.Jap no 23\n" +
                    "Single , no Children  \""));
        abc.add(new ItemObject(R.drawable.alexa, "Alexandra cristine", "Alexandra cristian\n" +
                "Alexa\n" +
                "1996 November 12\n" +
                "Khatolik\n" +
                "female\n" +
                "jl.B. train no 42\n" +
                "Single , no Children  \""));
        abc.add(new ItemObject(R.drawable.ray, "Rayi Alamsyah", "Rayi Alamsyah\n" +
                "Ray\n" +
                "1997 April 12\n" +
                "Moeslim\n" +
                "male\n" +
                "jl.M ray no21\n" +
                "Single , no Children  \""));

        adapter = new ListitemAdapter(this, abc);

        //set adapter ke listitem
        listItem.setAdapter(adapter);

    }
}
