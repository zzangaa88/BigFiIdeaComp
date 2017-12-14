package com.example.testapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by USER on 2017-12-06.
 */

public class SecondActivity extends Activity{
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void secOnClick(View view){
        int viewId = view.getId();
        switch (viewId){
            case R.id.btn_analysis:
                intent = new Intent(this, AnalysisYearChoice.class);
                startActivity(intent);
                break;
            case R.id.btn_business:
                intent = new Intent(this, BusinessYearChoice.class);
                startActivity(intent);
                break;
            case R.id.btn_contest:
                intent = new Intent(this, ContestYearChoice.class);
                startActivity(intent);
                break;
            case R.id.btn_edu:
                intent = new Intent(this, EduYearChoice.class);
                startActivity(intent);
                break;
            case R.id.btn_forum:
                intent = new Intent(this, ForumYearChoice.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
