package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;

public class DriveAdapter extends ArrayAdapter<DriveVO> {
    Context context;
    int resId;
    ArrayList<DriveVO> datas;
    public  DriveAdapter(Context context, int resId, ArrayList<DriveVO> datas){
        super(context, resId);
        this.context=context;
        this.resId =resId;
        this.datas=datas;
    }
    @Override
    public int getCount() {
        return datas.size();
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 리스트 1개용 뷰홀더(DriverHolder)를 한번만 만들어 재사용
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resId, null);
            DriverHolder holder = new DriverHolder(convertView);
            convertView.setTag(holder);  // convertView에 setTag() 사용 홀더 저장
        }
        DriverHolder holder = (DriverHolder)convertView.getTag();

        //뷰 얻기
        ImageView typeImageView = holder.img;
        TextView titleView = holder.title;
        TextView contentsView = holder.contents;

        int[] resDraws = {R.drawable.passport, R.drawable.driver, R.drawable.card, R.drawable.voucher,R.drawable.phone };
        String[] titles = { "여권","면허증","신용카드","바우처","거치대" };
        //1개 리스트 데이터 얻기
        final DriveVO vo = datas.get(position);

        titleView.setText(vo.title);
        contentsView.setText(vo.contents);
        int i=0;
        for(;i<titles.length;i++) {
            if (titles[i].equals(vo.title)) {
                typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), resDraws[i], null));
                break;
            }
        }
        if(i==titles.length){
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), resDraws[i], null));
        }

        //if(vo.amount >0)
            //typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.t, null));
        //else
            //typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.s, null));

        return convertView;
    }
}
