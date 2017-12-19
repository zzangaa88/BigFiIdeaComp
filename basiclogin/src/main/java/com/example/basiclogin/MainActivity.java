package com.example.basiclogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button btn_login;
    private Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = findViewById(R.id.btn_login);
        btn_signup = findViewById(R.id.btn_signup);

        btn_login.setOnClickListener(this);
        btn_signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int getid = v.getId();
        Intent intent;
        switch (getid) {
            case R.id.btn_login:
//                intent = new Intent(getApplicationContext(), login);
                break;
            case R.id.btn_signup:
                intent = new Intent(getApplicationContext(), JoinActivity.class);
                break;
        }
    }
}
