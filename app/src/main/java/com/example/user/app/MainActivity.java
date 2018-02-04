package com.example.user.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  String str_user,str_password;
    private EditText user_text,password_text;
    private Button btn_login,btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_text = (EditText) findViewById(R.id.user_text);
        password_text = (EditText) findViewById(R.id.password_text);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_register = (Button) findViewById(R.id.btn_register);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               str_user = user_text.getText().toString().trim();
               str_password = password_text.getText().toString().trim();

               if(str_user.equals("")|| str_password.equals("")) {
                   Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูล", Toast.LENGTH_SHORT).show();
               }else {
                   Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูล", Toast.LENGTH_SHORT).show();
               }
            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register_Activity.class);
                startActivity(intent
                );
            }
        });
    }
}


