package com.hfad.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        //Create an onItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                (listView, itemView, position, id) -> {
                    if(position == 0) {
                        Intent intent = new Intent(TopLevelActivity.this,
                                                   DrinkCategoryActivity.class);
                        startActivity(intent);
                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}