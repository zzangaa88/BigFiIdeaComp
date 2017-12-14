package com.example.testapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by USER on 2017-12-06.
 */

public class ForumYearChoice extends Activity implements View.OnClickListener{
    private ImageButton btn_15;
    private ImageButton btn_16;
    private ImageButton btn_17;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum_year_choice);
        btn_15 = (ImageButton)findViewById(R.id.btn_15);
        btn_16 = (ImageButton)findViewById(R.id.btn_16);
        btn_17 = (ImageButton)findViewById(R.id.btn_17);

        btn_15.setOnClickListener(this);
        btn_16.setOnClickListener(this);
        btn_17.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int getid = v.getId();
        String year;
        intent = new Intent(getApplicationContext(), ForumDetail.class);
        if(getid == R.id.btn_15) {
            year = "15";
            intent.putExtra("Year", year);
        }if(getid == R.id.btn_16){
            year = "16";
            intent.putExtra("Year", year);
        }else if(getid == R.id.btn_17){
            year = "17";
            intent.putExtra("Year", year);
        }
        startActivity(intent);
    }
}
