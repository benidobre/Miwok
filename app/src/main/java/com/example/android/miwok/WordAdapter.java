package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by beni on 6/21/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {



    public WordAdapter(Context c, ArrayList<Word> w){
        super(c,0,w);

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);
        TextView miwok = (TextView) listItemView.findViewById(R.id.miwok);
        miwok.setText(currentWord.getMiwokTranslation());

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.defaultTranslation);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        return listItemView;

    }
}
