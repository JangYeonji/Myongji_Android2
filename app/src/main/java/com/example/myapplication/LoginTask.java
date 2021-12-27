package com.example.myapplication;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginTask extends AsyncTask<String, Void, String> { //첫번째 String만 doinbackground의 매개변수다
    String sendMsg, receiveMsg;

    //Code > Override로 실행
    @Override
    protected String doInBackground(String... strings) {   //AsyncTask의 execute() 호출 시 전달 인자를 파라메터로 받게 됨(배열로?ㅇㅇ)
        //jsp url에 있는 걸 실행..?
        try {
            String str;
            URL url = new URL("http://175.193.168.115:8001/android1/roadlogin.jsp");
            // PC 네트워크 정보 확인*, URL 주소는 이클립스의 URL 주소와 같게 한다.

            //밑에 3줄은 바꿀게 없음
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestMethod("POST");

            //교과서 p332 output file 스트림과 비교
            OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
            //select라 파라미터가 없으면 밑에 두줄 없애고 flush만 해도됨
            sendMsg = "id="+strings[0]+"&pwd="+strings[1];    //요청 파라메터 생성, strings는 DoInBackground의 매개변수
            osw.write(sendMsg);
            osw.flush(); //실행되게끔.

            if(conn.getResponseCode() == conn.HTTP_OK) {     //교과서 p331 input file 스트림과 비교
                //연결이 되면 out을 보내라

                InputStreamReader is = new InputStreamReader(conn.getInputStream(), "utf-8");
                BufferedReader reader = new BufferedReader(is); //String은 byte단위로 오므로 일다 버퍼리더에 넣음
                StringBuffer buffer = new StringBuffer();

                while ((str = reader.readLine()) != null) {
                    buffer.append(str); //읽은 버퍼를 String으로 만들어줌
                }
                receiveMsg = buffer.toString();

            } else {
                Log.i("통신 결과", conn.getResponseCode()+"에러");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return receiveMsg;  //name을 리턴
    }
}
