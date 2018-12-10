package com.example.hemant.miwok;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> a = new ArrayList<Word>();

        a.add(new Word("one","lutti",R.drawable.a1));
        a.add(new Word("two","otiiko",R.drawable.a2));
        a.add(new Word("three","tolookosu",R.drawable.a3));
        a.add(new Word("four","oyyisa",R.drawable.a4));
        a.add(new Word("five","massokka",R.drawable.a5));
        a.add(new Word("six","temmokka",R.drawable.a6));
        a.add(new Word("seven","kenekaku",R.drawable.a7));
        a.add(new Word("eight","kawinta",R.drawable.a8));
        a.add(new Word("nine","wo'e",R.drawable.a9));
        a.add(new Word("ten","na'aacha",R.drawable.a10));

        WordAdapter wordAdapter=new WordAdapter(this, a);
        ListView listView=(ListView)findViewById(R.id.number);
        listView.setAdapter(wordAdapter);
    }
}