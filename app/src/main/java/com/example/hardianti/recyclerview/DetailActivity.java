package com.example.hardianti.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hardianti on 11/26/16.
 */

public class DetailActivity extends AppCompatActivity {
    TextView txtJudulDetail, txtDescripsiDetail;
    ImageView imgAvatarDetail;
    Button btnBackground;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imgAvatarDetail= (ImageView) findViewById(R.id.img_avatar_detail);
        txtJudulDetail = (TextView) findViewById(R.id.txt_Judul_Detail);
        txtDescripsiDetail = (TextView) findViewById(R.id.txt_Deskripsi);
        btnBackground = (Button) findViewById(R.id.btn_background);
        //implement
        imgAvatarDetail.setImageResource(getIntent().getIntExtra("id_img", 0));
        txtJudulDetail.setText(getIntent().getStringExtra("id_Judul"));
        txtDescripsiDetail.setText(getIntent().getStringExtra("id_Deskripsi"));

        btnBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtJudulDetail.getText().toString().equals("Yuli Hardianti")) {
                    Intent i = new Intent(getApplicationContext(), BackgroundActivity.class);
                    startActivity(i);
                } else if (txtJudulDetail.getText().toString().equals("Killua Zoldyk")) {
                    Intent i = new Intent(getApplicationContext(), BackgroundActivityKillua.class);
                    startActivity(i);
                } else if (txtJudulDetail.getText().toString().equals("Alexandra cristine")) {
                    Intent i = new Intent(getApplicationContext(), BackgroundActivityAlexa.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(getApplicationContext(), BackgroundActivityRay.class);
                    startActivity(i);
                }
            }
        });

    }
}
