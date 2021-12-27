package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

public class LogoActivity extends AppCompatActivity {
    LinearLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        background = (LinearLayout)findViewById(R.id.background);
        background.setBackgroundColor(Color.rgb(183,206,251));

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(), 2000); // 1초 후에 hd handler 실행  3000ms = 2초

    }
    private class splashhandler implements Runnable{
        public void run(){
            startActivity(new Intent(getApplication(), LoginActivity.class)); //로딩이 끝난 후, ChoiceFunction 이동
            LogoActivity.this.finish(); // 로딩페이지 Activity stack에서 제거
        }
    }
    @Override
    public void onBackPressed() {
        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게 함
    }

}
