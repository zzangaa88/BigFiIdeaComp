package com.example.testapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 2017-12-08.
 */

public class AnalyDetail extends Activity implements View.OnClickListener{
    private CustomPagerAdapter customPagerAdapter;
    private ViewPager viewPager;
    private ImageButton btn_left;
    private ImageButton btn_rigth;
    private ImageButton btn_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);
        viewPager = findViewById(R.id.viewpager);
        Intent intent = getIntent();
        String extra = intent.getStringExtra("Year");
        customPagerAdapter = new CustomPagerAdapter(getApplicationContext(), dataList(extra));
        viewPager.setAdapter(customPagerAdapter);

        btn_left = findViewById(R.id.left);
        btn_rigth = findViewById(R.id.right);
        btn_back = findViewById(R.id.btn_back);

        btn_left.setOnClickListener(this);
        btn_rigth.setOnClickListener(this);
        btn_back.setOnClickListener(this);

    }

    public List<DataObject> dataList(String extra) {
        List<DataObject> data = new ArrayList<>();
        if(extra.equals("15")){
            data.add(new DataObject(R.drawable.bf_analysis_15_1));
            data.add(new DataObject(R.drawable.bf_analysis_15_2));
            data.add(new DataObject(R.drawable.bf_analysis_15_3));
            data.add(new DataObject(R.drawable.bf_analysis_15_4));
            data.add(new DataObject(R.drawable.bf_analysis_15_5));
            data.add(new DataObject(R.drawable.bf_analysis_15_6));
            data.add(new DataObject(R.drawable.bf_analysis_15_7));
            data.add(new DataObject(R.drawable.bf_analysis_15_8));
            data.add(new DataObject(R.drawable.bf_analysis_15_9));
            data.add(new DataObject(R.drawable.bf_analysis_15_10));
            data.add(new DataObject(R.drawable.bf_analysis_15_11));
        }else if(extra.equals("16")){
            data.add(new DataObject(R.drawable.bf_analysis_16_1));
            data.add(new DataObject(R.drawable.bf_analysis_16_2));
            data.add(new DataObject(R.drawable.bf_analysis_16_3));
            data.add(new DataObject(R.drawable.bf_analysis_16_4));
            data.add(new DataObject(R.drawable.bf_analysis_16_5));
            data.add(new DataObject(R.drawable.bf_analysis_16_6));
            data.add(new DataObject(R.drawable.bf_analysis_16_7));
        }
        return data;
    }

    @Override
    public void onClick(View v) {
        int getId = v.getId();
        int COUNT = customPagerAdapter.getCount();
        if(getId == R.id.left){
            int cur = viewPager.getCurrentItem();
            if(cur > 0){
                viewPager.setCurrentItem(cur-1, true);
            }else {
                Toast.makeText(getApplicationContext(), "첫번째 페이지 입니다", Toast.LENGTH_SHORT).show();
            }
        }else if(getId == R.id.right){
            int cur = viewPager.getCurrentItem();
            if(cur < COUNT-1){
                viewPager.setCurrentItem(cur+1, true);
            }else{
                Toast.makeText(getApplicationContext(), "마지막 페이지 입니다", Toast.LENGTH_SHORT).show();
            }
        }if(getId == R.id.btn_back){
            finish();
        }
    }
}
