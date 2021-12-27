package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TwoFragment extends Fragment {
    TextView roadname1, roadname2, roadname3;
    ImageView img1, img2, img3;
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_two, container,false);

        roadname1 = (TextView)view.findViewById(R.id.roadname1);
        roadname2 = (TextView)view.findViewById(R.id.roadname2);
        roadname3 = (TextView)view.findViewById(R.id.roadname3);
        img1 = (ImageView)view.findViewById(R.id.imageView1);
        img2 = (ImageView)view.findViewById(R.id.imageView2);
        img3 = (ImageView)view.findViewById(R.id.imageView3);

        Bundle extra = this.getArguments();
        if(extra != null) {
            extra = getArguments();
            String var = extra.getString("var");

                switch (var){
                    case "독일":
                        roadname1.setText("Füssen");
                        roadname2.setText("Autobahn");
                        roadname3.setText("Würzburg");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.huisen));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.au));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.bui));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/B17,+87642+Halblech,+%EB%8F%85%EC%9D%BC/@47.6196121,10.8066615,17z/data=!3m1!4b1!4m5!3m4!1s0x479c3dc919c3549b:0x57a03e10468f25dc!8m2!3d47.6196121!4d10.8088502"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%EB%8F%85%EC%9D%BC+%EB%B5%88%EB%B8%94%EB%A7%81%EC%97%94/@48.93196,8.7411254,13.75z/data=!4m5!3m4!1s0x4799e0833ed3d32b:0x570fde3c380e768b!8m2!3d48.6813312!4d9.0088299"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%EB%B7%94%EB%A5%B4%EC%B8%A0%EB%B6%80%EB%A5%B4%ED%81%AC+%EA%B6%81%EC%A0%84/@49.7922127,9.9193742,15.25z/data=!4m13!1m7!3m6!1s0x47a2902012da4dd9:0x41db728f06209a0!2z64-F7J28IOu3lOultOy4oOu2gOultO2BrA!3b1!8m2!3d49.7913044!4d9.9533548!3m4!1s0x47a2902dd0137021:0xd0ec04fef5adb93f!8m2!3d49.7927419!4d9.9391186"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "미국":
                        roadname1.setText("Bixby Creek Bridge");
                        roadname2.setText("Pikes Peak");
                        roadname3.setText("Swan Falls Road");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.bixy));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.pikes));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.swan));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/Bixby+Creek+Bridge,+CA-1,+Monterey,+CA+93940+%EB%AF%B8%EA%B5%AD/@36.3711298,-121.9067147,16.5z/data=!4m13!1m7!3m6!1s0x808d94a0aea9511b:0xadfeac07efb3a389!2zQml4YnkgQ3JlZWsgQnJpZGdlLCBDQS0xLCBNb250ZXJleSwgQ0EgOTM5NDAg66-46rWt!3b1!8m2!3d36.371434!4d-121.9017074!3m4!1s0x808d94a0aea9511b:0xadfeac07efb3a389!8m2!3d36.371434!4d-121.9017074"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%ED%94%BC%ED%81%AC%EC%8A%A4+%ED%94%BC%ED%81%AC/@38.8408688,-105.0597691,14z/data=!4m13!1m7!3m6!1s0x8714a806033005bd:0xa67b8c79d6580c1e!2z7ZS87YGs7IqkIO2UvO2BrA!3b1!8m2!3d38.8408707!4d-105.0422595!3m4!1s0x8714a806033005bd:0xa67b8c79d6580c1e!8m2!3d38.8408707!4d-105.0422595"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/S+Swan+Falls+Rd,+Idaho,+%EB%AF%B8%EA%B5%AD/@43.2894835,-116.4717312,11.42z/data=!4m5!3m4!1s0x54ae450364c6caaf:0x13de04cf80e77116!8m2!3d43.363024!4d-116.4138846"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "스위스":
                        roadname1.setText("Gotthardpass");
                        roadname2.setText("Thunersee");
                        roadname3.setText("Viamala");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.gott));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.toon));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.via));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%EA%B3%A0%ED%83%80%EB%A5%B4+%EA%B3%A0%EA%B0%9C/@46.5773959,8.5038339,12z/data=!3m1!4b1!4m5!3m4!1s0x478576eb49b3f227:0x131a5c101ba0985f!8m2!3d46.5588864!4d8.5623231"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/Steinbruch/@46.6824389,7.7634165,15.25z/data=!4m13!1m7!3m6!1s0x478fb20a290391d3:0x609b256178f8d463!2zT2JlcmhvZmVuLCDsiqTsnITsiqQ!3b1!8m2!3d46.7315725!4d7.6692035!3m4!1s0x478fa57e127fb579:0x6c362ff121329ba1!8m2!3d46.682086!4d7.7715424"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/Viamala/@46.6627009,9.4480924,18z/data=!4m8!1m2!2m1!1sviamala!3m4!1s0x4784ec9b13a95b9f:0x5db57e716dada67a!8m2!3d46.6625847!4d9.4480481"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "스페인":
                        roadname1.setText("Madrid");
                        roadname2.setText("Sevilla");
                        roadname3.setText("València");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.mad));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.sev));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.bal));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/dir/%EB%A7%88%EB%93%9C%EB%A6%AC%EB%93%9C+%EC%8A%A4%ED%8E%98%EC%9D%B8+%EB%A7%88%EB%93%9C%EB%A6%AC%EB%93%9C/%EC%8A%A4%ED%8E%98%EC%9D%B8+%EB%98%98%EB%A0%88%EB%8F%84+%ED%86%A8%EB%A0%88%EB%8F%84/@40.1398583,-4.1406774,10z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0xd422997800a3c81:0xc436dec1618c2269!2m2!1d-3.7037902!2d40.4167754!1m5!1m1!1s0xd6a0bad0bb5fdf1:0xc67f5be86a75adfe!2m2!1d-4.0273231!2d39.8628316!3e0"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/dir/%EC%8A%A4%ED%8E%98%EC%9D%B8+%EC%84%B8%EB%B9%84%EC%95%BC/%EC%8A%A4%ED%8E%98%EC%9D%B8+%EB%A1%A0%EB%8B%A4/@37.0674302,-6.0576472,9z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0xd126c1114be6291:0x34f018621cfe5648!2m2!1d-5.9844589!2d37.3890924!1m5!1m1!1s0xd0d3143e258a279:0x94358021349a5ba2!2m2!1d-5.1612251!2d36.746209!3e0"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/dir/%EC%8A%A4%ED%8E%98%EC%9D%B8+%EB%B0%9C%EB%A0%8C%EC%8B%9C%EC%95%84/%EC%8A%A4%ED%8E%98%EC%9D%B8+%EB%B0%94%EB%A5%B4%EC%85%80%EB%A1%9C%EB%82%98/@40.4243404,-0.2143836,8z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0xd604f4cf0efb06f:0xb4a351011f7f1d39!2m2!1d-0.3762881!2d39.4699075!1m5!1m1!1s0x12a49816718e30e5:0x44b0fb3d4f47660a!2m2!1d2.1734035!2d41.3850639!3e0"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "영국":
                        roadname1.setText("Dartmoor");
                        roadname2.setText("Abergwesyn");
                        roadname3.setText("Saint Ives");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.dart));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.aber));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.st));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%EB%8B%A4%ED%8A%B8%EB%AC%B4%EC%96%B4+%EA%B5%AD%EB%A6%BD%EA%B3%B5%EC%9B%90/@50.5983932,-3.9813757,11.75z/data=!4m12!1m6!3m5!1s0x486d00cf28cd19ff:0xb6f41325fa1a8bc1!2z64uk7Yq466y07Ja0IOq1reumveqzteybkA!8m2!3d50.5718857!4d-3.9206884!3m4!1s0x486d00cf28cd19ff:0xb6f41325fa1a8bc1!8m2!3d50.5718857!4d-3.9206884"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://m.post.naver.com/viewer/postView.nhn?volumeNo=9808669&memberNo=24328789"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/St+Ives,+%EC%98%81%EA%B5%AD/@50.2106472,-5.4966087,15z/data=!3m1!4b1!4m5!3m4!1s0x486ac1883d3d7aed:0x90fba57b84271131!8m2!3d50.2083858!4d-5.4908864"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "일본":
                        roadname1.setText("Ororon Line");
                        roadname2.setText("Tennizu");
                        roadname3.setText("Roller Coaster Road");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.oro));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.ten));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.rol));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.co.kr/maps/place/Ororon+Line/@45.0250322,141.5282415,11z/data=!4m8!1m2!2m1!1z44Kq44Ot44Ot44Oz44Op44Kk44Oz!3m4!1s0x5f0e2e40fce86c71:0x22827bc5b4e84829!8m2!3d45.0250322!4d141.6683172"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%ED%95%98%EB%8A%98%EB%A1%9C+%EC%9D%B4%EC%96%B4%EC%A7%84+%EA%B8%B8(%E5%A4%A9%E3%81%AB%E7%B6%9A%E3%81%8F%E9%81%93)+%EC%A0%84%EB%A7%9D%EB%8C%80/@43.9063784,144.7834147,17z/data=!4m12!1m6!3m5!1s0x5f6d1f96aef57585:0x3e1016f10cab8c1e!2z7ZWY64qY66GcIOydtOyWtOynhCDquLgo5aSp44Gr57aa44GP6YGTKSDsoITrp53rjIA!8m2!3d43.9063746!4d144.7856034!3m4!1s0x5f6d1f96aef57585:0x3e1016f10cab8c1e!8m2!3d43.9063746!4d144.7856034?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%EB%A1%A4%EB%9F%AC%EC%BD%94%EC%8A%A4%ED%84%B0%EC%9D%98+%EA%B8%B8/@43.5114522,142.422402,17z/data=!4m12!1m6!3m5!1s0x5f0cb63704203ff7:0xe0d2279900e76982!2z66Gk65-s7L2U7Iqk7YSw7J2YIOq4uA!8m2!3d43.5114522!4d142.422402!3m4!1s0x5f0cb63704203ff7:0xe0d2279900e76982!8m2!3d43.5114522!4d142.422402?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "캐나다":
                        roadname1.setText("Sea-to-Sky Hwy");
                        roadname2.setText("Icefields Pkwy");
                        roadname3.setText("Fundy Trail Pkwy");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.sea));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.ice));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.fundy));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/Sea-to-Sky+Hwy,+British+Columbia,+%EC%BA%90%EB%82%98%EB%8B%A4/@49.8364272,-123.1376726,17z/data=!4m13!1m7!3m6!1s0x5486e3228784d4d3:0x1bde2487f161fc94!2zU2VhLXRvLVNreSBId3ksIEJyaXRpc2ggQ29sdW1iaWEsIOy6kOuCmOuLpA!3b1!8m2!3d49.8364272!4d-123.1354786!3m4!1s0x5486e3228784d4d3:0x1bde2487f161fc94!8m2!3d49.8364272!4d-123.1354786?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/Icefields+Pkwy,+Alberta,+%EC%BA%90%EB%82%98%EB%8B%A4/@52.1703581,-117.0752071,17z/data=!4m8!1m2!2m1!1z7LqQ64KY64ukIOyVjOuyhO2DgCDsnqzsiqTtjbwg7JWE7J207Iqk7ZWE7KaIIO2MjO2BrOybqOydtOyjvOuzgO2MjOydtOu4jCDqsIDsnbTspog!3m4!1s0x5377f438f81b1851:0x2577663f9ac05e1c!8m2!3d52.1703548!4d-117.0730184?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/Fundy+Trail+Pkwy,+Saint+Martins,+NB,+%EC%BA%90%EB%82%98%EB%8B%A4/@45.428814,-65.3920678,17z/data=!4m13!1m7!3m6!1s0x4ca77455a75a722b:0x1c7bc965b6963d35!2zRnVuZHkgVHJhaWwgUGt3eSwgU2FpbnQgTWFydGlucywgTkIsIOy6kOuCmOuLpA!3b1!8m2!3d45.4288103!4d-65.3898791!3m4!1s0x4ca77455a75a722b:0x1c7bc965b6963d35!8m2!3d45.4288103!4d-65.3898791?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "포르투칼":
                        roadname1.setText("Cabo da Roca");
                        roadname2.setText("Sagres Fortress");
                        roadname3.setText("Óbidos");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.cabo));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.sag));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.obi));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%ED%98%B8%EC%B9%B4+%EA%B3%B6/@38.7801367,-9.5066959,15z/data=!4m12!1m6!3m5!1s0xd1edac0235d438d:0x953ad8a898fcb3af!2z7Zi47Lm0IOqztg!8m2!3d38.780417!4d-9.498885!3m4!1s0xd1edac0235d438d:0x953ad8a898fcb3af!8m2!3d38.780417!4d-9.498885?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/Sagres+Fortress/@37.0073858,-8.9569368,15z/data=!4m13!1m7!3m6!1s0xd1b4c17d26b1a2d:0x500ebbde490b750!2zU2FncmVzLCDtj6zrpbTtiKzqsIg!3b1!8m2!3d37.0168316!4d-8.9405858!3m4!1s0xd1b4c603fdb81a5:0x146154612cb3a3d4!8m2!3d36.9973345!4d-8.948831?hl=ko\n"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%ED%8F%AC%EB%A5%B4%ED%88%AC%EA%B0%88+%EC%98%A4%EB%B9%84%EB%91%90%EC%8A%A4/@39.3684406,-9.2008742,13z/data=!4m13!1m7!3m6!1s0xd18b49eef1edec5:0x170a628ab34d3bb3!2z7Y-s66W07Yis6rCIIOyYpOu5hOuRkOyKpA!3b1!8m2!3d39.3604212!4d-9.1582014!3m4!1s0xd18b49eef1edec5:0x170a628ab34d3bb3!8m2!3d39.3604212!4d-9.1582014?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "필리핀":
                        roadname1.setText("Antipolo");
                        roadname2.setText("Subic");
                        roadname3.setText("Lungsod ng Tagaytay");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.anti));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.sub));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.lun));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%ED%95%84%EB%A6%AC%ED%95%80+%EB%A6%AC%EC%82%B4+%EC%95%88%ED%8B%B0%ED%8F%B4%EB%A1%9C/@14.6254801,121.0893794,13z/data=!4m21!1m15!4m14!1m6!1m2!1s0x3397bf0c8d8310c5:0x34dc8e5a7fbf80a3!2z7JWI7Yuw7Y-066GcIEFudGlwb2xv!2m2!1d121.1244847!2d14.6254827!1m6!1m2!1s0x3397bf0c8d8310c5:0x34dc8e5a7fbf80a3!2z7ZWE66as7ZWAIOumrOyCtCDslYjti7Dtj7TroZw!2m2!1d121.1244847!2d14.6254827!3m4!1s0x3397bf0c8d8310c5:0x34dc8e5a7fbf80a3!8m2!3d14.6254827!4d121.1244847?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%ED%95%84%EB%A6%AC%ED%95%80+%EC%9E%A0%EB%B0%9C%EB%A0%88%EC%8A%A4+%EC%88%98%EB%B9%84%ED%81%AC/@14.8853126,120.1854642,12z/data=!4m13!1m7!3m6!1s0x3396708393efc3af:0x39fb0a314cd0b13d!2z7ZWE66as7ZWAIOyeoOuwnOugiOyKpCDsiJjruYU!3b1!8m2!3d14.8306563!4d120.182022!3m4!1s0x3396775ea9ab62d9:0x65dcd14425f56924!8m2!3d14.8968475!4d120.2366066?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%ED%95%84%EB%A6%AC%ED%95%80+%EC%B9%B4%EB%B9%84%ED%85%8C+%ED%83%80%EA%B0%80%EC%9D%B4%ED%83%80%EC%9D%B4/@14.1170534,120.898721,12z/data=!4m13!1m7!3m6!1s0x33bd777b1ab54c8f:0x6ecc514451ce2be8!2z7ZWE66as7ZWAIOy5tOu5hO2FjCDtg4DqsIDsnbTtg4DsnbQ!3b1!8m2!3d14.115286!4d120.9621165!3m4!1s0x33bd777b1ab54c8f:0x6ecc514451ce2be8!8m2!3d14.115286!4d120.9621165?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        break;
                    case "호주":
                        roadname1.setText("Royal National");
                        roadname2.setText("Boat Harbour Beach");
                        roadname3.setText("Wilsons Promontory");
                        img1.setImageDrawable(getResources().getDrawable(R.drawable.roy));
                        img2.setImageDrawable(getResources().getDrawable(R.drawable.boat));
                        img3.setImageDrawable(getResources().getDrawable(R.drawable.wil));
                        roadname1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%EB%A1%9C%EC%97%B4+%EA%B5%AD%EB%A6%BD%EA%B3%B5%EC%9B%90/@-34.0750792,151.0548448,17.25z/data=!4m12!1m6!3m5!1s0x6b12c44505675b5f:0xf017d68f9f2aaa0!2z66Gc7Je0IOq1reumveqzteybkA!8m2!3d-34.0750773!4d151.0566579!3m4!1s0x6b12c44505675b5f:0xf017d68f9f2aaa0!8m2!3d-34.0750773!4d151.0566579?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        roadname2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%EB%B3%B4%ED%8A%B8+%ED%95%98%EB%B2%84+%EB%B9%84%EC%B9%98+%ED%99%80%EB%A6%AC%EB%8D%B0%EC%9D%B4+%EA%B3%B5%EC%9B%90/@-40.9355995,145.5974535,14z/data=!4m8!3m7!1s0xaa7bf6211860accb:0x391e315bd536c34d!5m2!4m1!1i2!8m2!3d-40.92918!4d145.6157354?hl=ko"));
                                startActivity(intent);
                            }
                        });
                        roadname3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.google.com/maps/place/%EC%9C%8C%EC%84%A0%EC%8A%A4+%ED%94%84%EB%A1%9C%EB%AA%AC%ED%86%A0%EB%A6%AC+%EA%B5%AD%EB%A6%BD%EA%B3%B5%EC%9B%90/@-39.0054786,146.2676085,12z/data=!4m12!1m6!2m5!1z7JyM7ISg7IqkIO2UhOuhnOuqrO2GoOumrA!5m3!5m2!4m1!1i2!3m4!1s0x0:0x529a6bb897a9d6e4!8m2!3d-39.0270687!4d146.3338137?hl=ko\n"));
                                startActivity(intent);
                            }
                        });
                        break;

                }

            }


        return view;
    }
}
