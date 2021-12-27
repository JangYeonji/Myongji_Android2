package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DriverHolder {
    public ImageView img;
    public TextView title;
    public  TextView contents;
    public DriverHolder(View root){
        img =(ImageView)root.findViewById(R.id.cust_imageView);
        title=(TextView)root.findViewById(R.id.cust_textView);
        contents=(TextView)root.findViewById(R.id.cust_textView2);
    }
}
