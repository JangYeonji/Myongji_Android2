package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=7;   //버전 업그레드 이후에  아래로 변경 못함

    public DBHelper(Context context){
        super(context, "lawdb", null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String lawSQL="create table law (" +
                "_id integer primary key autoincrement," +
                "title text," +
                "contents text);";

        db.execSQL(lawSQL);
        db.execSQL("insert into law (title, contents) values ('여권','만일을 대비해 여권 복사본도 챙겨두세요!')");
        db.execSQL("insert into law (title, contents) values ('면허증','국제/한국 운전 면허증 둘 다 필요합니다!')");
        db.execSQL("insert into law (title, contents) values ('신용카드','운전자는 신용카드를 소지해 주세요!')");
        db.execSQL("insert into law (title, contents) values ('바우처','렌트카를 빌릴 때 바우처가 필요합니다!')");
        db.execSQL("insert into law (title, contents) values ('거치대','네비게이션이 없는 차도 있을 수 있어요!')");
    }
    @Override    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion==DATABASE_VERSION){
            db.execSQL("drop table law");
            onCreate(db);
        }
    }
}
