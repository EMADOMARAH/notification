package com.emad.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap( BitmapFactory.decodeResource(this.getResources(),
                R.drawable.pp));
    }
}