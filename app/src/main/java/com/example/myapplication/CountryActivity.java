package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity {
    TextView country, seat;
    LinearLayout background, main_container;
    Button main_btn1, main_btn2, main_btn3;
    OneFragment oneFragment;
    TwoFragment twoFragment;
    ThreeFragment threeFragment;
    Button home;
    ImageView flag;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        background = (LinearLayout)findViewById(R.id.background);
        background.setBackgroundColor(Color.rgb(183,206,251));

        country = (TextView)findViewById(R.id.country);
        flag = (ImageView) findViewById(R.id.flag);
        seat = (TextView)findViewById(R.id.seat);

        main_container = (LinearLayout)findViewById(R.id.main_container);
        main_btn1 = (Button)findViewById(R.id.main_btn1);
        main_btn2 = (Button)findViewById(R.id.main_btn2);
        main_btn3 = (Button)findViewById(R.id.main_btn3);
        home = (Button)findViewById(R.id.home2);

        oneFragment = new OneFragment(); //외부 클래스. 방법3과 차이.
        twoFragment = new TwoFragment();
        threeFragment = new ThreeFragment();//new ThreeFragment();

        Intent it3 = this.getIntent();
        final String var = it3.getStringExtra("it_listData");

        Bundle bundle = new Bundle();
        bundle.putString("var",var);
        twoFragment.setArguments(bundle);
        oneFragment.setArguments(bundle);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        country.setText(var);
        switch (var){
            case "독일":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.ger));
                seat.setText("운전석 : 한국과 동일");
                break;
            case "미국":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.usa));
                seat.setText("운전석 : 한국과 동일");
                break;
            case "스위스":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.sw));
                seat.setText("운전석 : 한국과 동일");
                break;
            case "스페인":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.spa));
                seat.setText("운전석 : 한국과 동일");
                break;
            case "영국":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.eng));
                seat.setText("운전석 : 한국과 반대");
                break;
            case "일본":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.jap));
                seat.setText("운전석 : 한국과 반대");
                break;
            case "캐나다":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.can));
                seat.setText("운전석 : 한국과 동일");
                break;
            case "포르투칼":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.por));
                seat.setText("운전석 : 한국과 동일");
                break;
            case "필리핀":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.pil));
                seat.setText("운전석 : 한국과 동일");
                break;
            case "호주":
                flag.setImageDrawable(getResources().getDrawable(R.drawable.aus));
                seat.setText("운전석 : 한국과 반대");
                break;
        }

        MyListener my = new MyListener();

        main_btn1.setOnClickListener(my);
        main_btn2.setOnClickListener(my);
        main_btn3.setOnClickListener(my);

        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.main_container,threeFragment)
                .commit();
    }

    class MyListener implements View.OnClickListener{  //이거 만들고
        //여기에 Code > Implements 누르면 onClick이 있다.
        @Override
        public void onClick(View view) {
            //Toast.makeText(getApplicationContext(),"클릭",Toast.LENGTH_SHORT).show();

            //프래그먼트 대체. 메뉴와 다름.
            if(view==main_btn1){
                if(!oneFragment.isVisible()){
                    getSupportFragmentManager()
                            .beginTransaction() //프래그먼트 열기
                            .addToBackStack(null) //뒤로가기
                            .replace(R.id.main_container,oneFragment) //add는 넣어주기, replace는 있는걸 넣어주기
                            .commit();  //프래그먼트 닫기
                }
            }
            if(view==main_btn2){
                if(!twoFragment.isVisible()){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.main_container,twoFragment)
                            .commit();
                }
                //Intent intent = new Intent(getApplicationContext(),DriveActivity.class);
                //startActivity(intent);
            }
            if(view==main_btn3){
                if(!threeFragment.isVisible()){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.main_container,threeFragment)
                            .commit();
                }
            }

        }
    }
}
