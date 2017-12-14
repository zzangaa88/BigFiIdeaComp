package com.example.user.bigfiideacomp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by USER on 2017-10-23.
 */

public  class Year15_17 extends Activity{
    private Intent intent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.year_15_to_17);
    }
    public void yearOnClick(View view){
        int getid = view.getId();
        intent = new Intent(this, IdeaCompDetail.class);
        String year = null;
        if (getid == R.id.bd_vp_15) {
            year = "15";
        } else if (getid == R.id.bd_vp_16) {
            year = "16";
        } else if (getid == R.id.bd_vp_17) {
            year = "17";
        }
        intent.putExtra("Year", year);
        startActivity(intent);
    }
    public void VideoClick(View view){
        switch(view.getId()){
            case R.id.btn_vv15:
                intent = new Intent(this, Idea_15_0.class);
                startActivity(intent);
                break;
            case R.id.btn_vv16:
                intent = new Intent(this, Idea_16_0.class);
                startActivity(intent);
                break;
            case R.id.btn_vv17:
                intent = new Intent(this, Idea_17_0.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
