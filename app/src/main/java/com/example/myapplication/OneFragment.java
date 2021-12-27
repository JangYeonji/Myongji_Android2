package com.example.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class OneFragment extends Fragment {
    public OneFragment() {
        // Required empty public constructor
    }
    ImageView imageView7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one2, container,false);

        imageView7 = (ImageView)view.findViewById(R.id.imageView11);


        Bundle extra = this.getArguments();
        if(extra != null) {
            extra = getArguments();
            String var = extra.getString("var");

            switch (var){
                case "독일":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.gerlaw));
                    break;
                case "미국":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.amelaw));
                    break;
                case "스위스":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.swilaw));
                    break;
                case "스페인":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.spalaw));
                    break;
                case "영국":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.englaw));
                    break;
                case "일본":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.japlaw));
                    break;
                case "캐나다":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.canlaw));
                    break;
                case "포르투칼":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.porlaw));
                    break;
                case "필리핀":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.pillaw));
                    break;
                case "호주":
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.auslaw));
                   break;
            }
        }
        return view;
    }
}
