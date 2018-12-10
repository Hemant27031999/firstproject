package com.example.hemant.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG=WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listitemview=convertView;
        if(listitemview==null){
            listitemview=LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord=getItem(position);

        ImageView nameimageview=(ImageView) listitemview.findViewById(R.id.i1);
        nameimageview.setImageResource(currentWord.getImg());

        TextView nametextview=(TextView) listitemview.findViewById(R.id.t2);
        nametextview.setText(currentWord.getDefaultTranslation());

        TextView numbertextview=(TextView) listitemview.findViewById((R.id.t1));
        numbertextview.setText(currentWord.getMiwokTranslation());

        return listitemview;
    }
}
