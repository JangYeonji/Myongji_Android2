package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText id, pwd;
    Button register, login;
    LinearLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        background = (LinearLayout)findViewById(R.id.background);
        background.setBackgroundColor(Color.rgb(183,206,251));

        id =(EditText)findViewById(R.id.id);
        pwd=(EditText)findViewById(R.id.pwd);
        login = (Button)findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String result;

                    LoginTask task = new LoginTask();

                    result = task.execute( id.getText().toString(), pwd.getText().toString() ).get();

                    Toast.makeText(getApplicationContext(), result+"님 반갑습니다", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } catch (Exception e) {

                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent2);
            }
        });
    }
}
