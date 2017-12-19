package com.example.basiclogin;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by USER on 2017-12-19.
 */

public class JoinActivity extends Activity implements View.OnClickListener {
    private EditText ed_id;
    private EditText ed_pw;
    private EditText ed_pw_check;
    private Button btn_join;
    String sId, sPw, sPwCheck;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_activity);

        ed_id = findViewById(R.id.ed_id);
        ed_pw = findViewById(R.id.ed_pw);
        ed_pw_check = findViewById(R.id.ed_pw_check);
        btn_join = findViewById(R.id.btn_join);

        btn_join.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        sId = ed_id.getText().toString();
        sPw = ed_pw.getText().toString();
        sPwCheck = ed_pw_check.getText().toString();

        if (sPw.equals(sPwCheck)) {
//            패스워드 확인이 정상
        } else {
//            패스워드 확인이 오류
        }
    }
}
