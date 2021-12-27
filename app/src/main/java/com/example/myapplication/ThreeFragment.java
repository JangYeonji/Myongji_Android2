package com.example.myapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ThreeFragment extends Fragment {
    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vi = inflater.inflate(R.layout.fragment_three, container, false);

        ListView listView = (ListView)vi.findViewById(R.id.custom_listview);
        DBHelper helper = new DBHelper(getContext());
        SQLiteDatabase db = helper.getWritableDatabase();

        Cursor cursor = db.rawQuery("select title, contents from law", null);
        ArrayList<DriveVO> datas = new ArrayList<>();
        while (cursor.moveToNext()){
            DriveVO vo=new DriveVO();
            vo.title=cursor.getString(0);
            vo.contents = cursor.getString(1);
            datas.add(vo);
        }
        db.close();
        DriveAdapter adapter = new DriveAdapter(getContext(), R.layout.custom_item, datas);
        listView.setAdapter(adapter);

        return vi;
    }
}
