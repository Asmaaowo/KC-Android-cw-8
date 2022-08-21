package com.example.cw7u;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<item> itemArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        item item1 = new item("cheese", R.drawable.cheese, 2);
        item item2 = new item("chocolate", R.drawable.chocolate, 4);
        item item3 = new item("coffee", R.drawable.coffee, 3);
        item item4 = new item("donut", R.drawable.donut, 3);


        itemArrayList.add(item2);
        itemArrayList.add(item1);
        itemArrayList.add(item3);
        itemArrayList.add(item4);

        ItemAdapter itemAdapter = new ItemAdapter(this, 0, itemArrayList);
        ListView listView = findViewById(R.id.hmm);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                item currentitemm = itemArrayList.get(i);
                Intent intent = new Intent(MainActivity.this, dat.class);
                intent.putExtra("item1", currentitemm);
                startActivity(intent);
            }
        });

    }
}