package com.ahmmedalmzini783.mhadra_tatwer_aft5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img=findViewById(R.id.img);

        //هذه الطريقة الأولى
        Picasso.get()
                .load("https://www.aljazeera.net/wp-content/uploads/2022/03/GettyImages-1308668145.jpg")
                .error(R.drawable.ic_launcher_background)
                .into(img);


        //هذه الطريقة الثانية فيها خصائص أكثر
        Glide.with(this)
                .load("https://www.aljazeera.net/wp-content/uploads/2022/03/GettyImages-1308668145.jpg")
                .into(img);
    }
}