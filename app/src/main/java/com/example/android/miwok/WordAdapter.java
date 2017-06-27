package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by beni on 6/21/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundId;


    public WordAdapter(Context c, ArrayList<Word> w,int backgroundId){
        super(c,0,w);
        this.backgroundId = backgroundId;

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

        ImageView img= (ImageView) listItemView.findViewById(R.id.word_image);
        if(currentWord.getImageId() != 0){
            img.setVisibility(View.VISIBLE);
            img.setImageResource(currentWord.getImageId());
        }else{
            img.setVisibility(View.GONE);
        }


        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.vertical);
        linearLayout.setBackgroundResource(backgroundId);

        return listItemView;

    }

}
