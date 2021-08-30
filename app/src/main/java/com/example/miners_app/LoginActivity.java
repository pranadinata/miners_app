package com.example.miners_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText dtUsername, dtPassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setView();
    }
    public void initView(){
        btnLogin = findViewById(R.id.btn_login);
        dtUsername = findViewById(R.id.dt_username);
        dtPassword = findViewById(R.id.dt_password);
    }
    public void setView(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                username = dtUsername.getText().toString();
//                password = dtPassword.getText().toString();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                intent.putExtra("username",username);
//                intent.putExtra("password",password);
                startActivity(intent);
            }
        });
    }
}