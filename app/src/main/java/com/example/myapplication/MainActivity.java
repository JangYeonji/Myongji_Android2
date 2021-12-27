package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView search;
    LinearLayout background;
    ImageButton prev1,next1,prev2,next2;
    ViewFlipper viewFlipper, viewFlipper2;
    ImageView rant1, rant2, rant3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prev1 = (ImageButton)findViewById(R.id.prev1);
        next1 = (ImageButton)findViewById(R.id.next1);
        viewFlipper = (ViewFlipper)findViewById(R.id.flipper);

        prev2 = (ImageButton)findViewById(R.id.prev2);
        next2 = (ImageButton)findViewById(R.id.next2);
        viewFlipper2 = (ViewFlipper)findViewById(R.id.flipper2);

        rant1 = (ImageView)findViewById(R.id.imageView3);
        rant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rentalcars.com/?affiliateCode=google&preflang=ko&label=generic-bx2vF4a0fRVFswx8gTuIQQS71673565609&ws=&ppc_placement=&ppc_target=&ppc_param1=&ppc_param2=&aceid=&adposition=1t1&ppc_network=g&feeditemid=&ppc_targetid=kwd-3231437591&loc_physical_ms=1009871&loc_interest_ms=&ppc_device=c&ppc_devicemodel=&gclid=EAIaIQobChMIsoPw7bKO5gIVUT5gCh2F6gPbEAAYASAAEgKri_D_BwE"));
                startActivity(intent);
            }
        });

        rant2 = (ImageView)findViewById(R.id.imageView4);
        rant2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.hertz.com/rentacar/reservation/"));
                startActivity(intent);
            }
        });
        rant3 = (ImageView)findViewById(R.id.imageView5);
        rant3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kayak.co.kr/cars"));
                startActivity(intent);
            }
        });


        prev1.setOnClickListener(this);
        next1.setOnClickListener(this);

        prev2.setOnClickListener(this);
        next2.setOnClickListener(this);

        background = (LinearLayout)findViewById(R.id.background);
        background.setBackgroundColor(Color.rgb(183,206,251));

        final String[] country = {"나라를 선택하세요","독일","미국","스위스","스페인","영국","일본","캐나다","포르투칼","필리핀","호주"};

        Spinner spinner = (Spinner)findViewById(R.id.spinner1);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,country);
        spinner.setAdapter(adapter);
        spinner.setSelection(0, false);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(MainActivity.this, CountryActivity.class);   // 인텐트 처리
                it.putExtra("it_listData", country[i]);
                startActivity(it);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    @Override
    public void onClick(View view) {
        if(view == prev1 ){
            viewFlipper.showPrevious();
        }
        if(view == next1){
            viewFlipper.showNext();
        }
        if(view == prev2){
            viewFlipper2.showPrevious();
        }
        if(view == next2){
            viewFlipper2.showNext();
        }

    }
}