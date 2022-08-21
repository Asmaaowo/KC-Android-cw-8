package com.example.cw7u;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class dat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat);

        Bundle bundle = getIntent().getExtras();
        item idk = (item) bundle.getSerializable("item1");

        TextView itemnaem =  findViewById(R.id.textView);
        ImageView aaa = findViewById(R.id.imageView);

        itemnaem.setText(idk.getItemName());
        aaa.setImageResource(idk.getItemImage());
    }
}