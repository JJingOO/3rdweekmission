package com.cookandroid.a3rdweekmission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView photo, photo2;
    Button btnUD;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        photo = (ImageView) findViewById(R.id.photo);
        photo2 = (ImageView) findViewById(R.id.photo2);

        btnUD = (Button) findViewById(R.id.btnUD);

        photo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        photo.setAdjustViewBounds(true);
        photo2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        photo2.setAdjustViewBounds(true);

        photo.setImageResource(R.drawable.jingu);

        btnUD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "지난 겨울에 친구들과 함께 놀러가서 찍은 사진입니다 ^^ 제출이 늦어서 죄송합니다. 최선을 다하겠습니다! - 2021041086 김진구",Toast.LENGTH_SHORT).show();
                i++;
                if (i % 2 == 1) {
                    photo2.setImageResource(R.drawable.jingu);
                    photo.setVisibility(View.INVISIBLE);
                    photo2.setVisibility(View.VISIBLE);
                }
                else {
                    photo.setImageResource(R.drawable.jingu);
                    photo2.setVisibility(View.INVISIBLE);
                    photo.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}