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

public class RegisterActivity extends AppCompatActivity {
    EditText id, pwd, name, mail, tel;
    Button registerBtn;
    LinearLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        background = (LinearLayout)findViewById(R.id.background);
        background.setBackgroundColor(Color.rgb(183,206,251));

        id=(EditText)findViewById(R.id.id);
        pwd=(EditText)findViewById(R.id.pwd);
        name=(EditText)findViewById(R.id.name);
        mail=(EditText)findViewById(R.id.mail);
        tel=(EditText)findViewById(R.id.phone);

        registerBtn = (Button)findViewById(R.id.button);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String result, register;
                    String id_ = id.getText().toString();
                    String pwd_ = pwd.getText().toString();
                    String name_ = name.getText().toString();
                    String mail_ = mail.getText().toString();
                    String tel_ = tel.getText().toString();

                    RegisterTask task2 = new RegisterTask();
                    result = task2.execute(id_, pwd_, name_, mail_, tel_).get();
                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

                    LoginTask task = new LoginTask();

                    register = task.execute( id.getText().toString(), pwd.getText().toString() ).get();

                    Toast.makeText(getApplicationContext(), register+"님 반갑습니다", Toast.LENGTH_SHORT).show();

                    if(id_!=null&&pwd_!=null&name_!=null&&mail_!=null&&tel_!=null){
                        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(intent);
                    }
                } catch (Exception e){ }
            }
        });

    }

}
