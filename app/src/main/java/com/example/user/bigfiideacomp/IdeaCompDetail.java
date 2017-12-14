package com.example.user.bigfiideacomp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 2017-10-23.
 */

public class IdeaCompDetail extends AppCompatActivity {
    private ViewPager viewPager15;
    private ImageButton btn_left;
    private ImageButton btn_right;
    private ImageButton btn_back;
    private MyPagerAdapter myPagerAdapter;
    private Intent intent = getIntent();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idea_comp_15_vp);
        viewPager15 = (ViewPager) findViewById(R.id.bd_vp_15);
        List<DataObject> getDate = dateSource();
        myPagerAdapter = new MyPagerAdapter(IdeaCompDetail.this, getDate);
        viewPager15.setAdapter(myPagerAdapter);

        btn_left = (ImageButton) findViewById(R.id.btn_left);
        btn_right = (ImageButton) findViewById(R.id.btn_right);
        btn_back = (ImageButton) findViewById(R.id.btn_back);

        btn_left.setOnClickListener(movepageListener);
        btn_right.setOnClickListener(movepageListener);
        btn_back.setOnClickListener(movepageListener);

    }

    public View.OnClickListener movepageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int getId = v.getId();
            int Count = myPagerAdapter.getCount();
            if (getId == R.id.btn_left) {
                int cur = viewPager15.getCurrentItem();
                if (cur > 0) {
                    viewPager15.setCurrentItem(cur - 1, true);
                } else {
                    Toast.makeText(getApplicationContext(), "First Page", Toast.LENGTH_SHORT).show();
                }
            } else if (getId == R.id.btn_right) {
                int cur = viewPager15.getCurrentItem();
                if (cur < Count - 1) {
                    viewPager15.setCurrentItem(cur + 1, true);
                } else {
                    Toast.makeText(getApplicationContext(), "Last Page", Toast.LENGTH_SHORT).show();
                }
            }
            if (getId == R.id.btn_back) {
                finish();
            }
        }
    };

    private List<DataObject> dateSource() {
        List<DataObject> date = new ArrayList<DataObject>();
        String extra = intent.getStringExtra("Year");
        if (extra.equals("15")) {
            date.add(new DataObject(R.drawable.bc_15_1));
            date.add(new DataObject(R.drawable.bc_15_2));
            date.add(new DataObject(R.drawable.bc_15_3));
            date.add(new DataObject(R.drawable.bc_15_4));
            date.add(new DataObject(R.drawable.bc_15_5));
            date.add(new DataObject(R.drawable.bc_15_6));
            date.add(new DataObject(R.drawable.bc_15_7));
            date.add(new DataObject(R.drawable.bc_15_8));
            date.add(new DataObject(R.drawable.bc_15_9));
            date.add(new DataObject(R.drawable.bc_15_10));
            date.add(new DataObject(R.drawable.bc_15_11));
            date.add(new DataObject(R.drawable.bc_15_12));
        } else if (extra.equals("16")) {
            date.add(new DataObject(R.drawable.bc_16_1));
            date.add(new DataObject(R.drawable.bc_16_2));
            date.add(new DataObject(R.drawable.bc_16_3));
            date.add(new DataObject(R.drawable.bc_16_4));
            date.add(new DataObject(R.drawable.bc_16_5));
            date.add(new DataObject(R.drawable.bc_16_6));
            date.add(new DataObject(R.drawable.bc_16_7));
            date.add(new DataObject(R.drawable.bc_16_8));
            date.add(new DataObject(R.drawable.bc_16_9));
            date.add(new DataObject(R.drawable.bc_16_10));
            date.add(new DataObject(R.drawable.bc_16_11));
        } else if (extra.equals("17")) {
            date.add(new DataObject(R.drawable.bc_17_1));
            date.add(new DataObject(R.drawable.bc_17_2));
            date.add(new DataObject(R.drawable.bc_17_3));
            date.add(new DataObject(R.drawable.bc_17_4));
            date.add(new DataObject(R.drawable.bc_17_5));
            date.add(new DataObject(R.drawable.bc_17_6));
            date.add(new DataObject(R.drawable.bc_17_7));
            date.add(new DataObject(R.drawable.bc_17_8));
            date.add(new DataObject(R.drawable.bc_17_9));
            date.add(new DataObject(R.drawable.bc_17_10));
            date.add(new DataObject(R.drawable.bc_17_11));
            date.add(new DataObject(R.drawable.bc_17_12));
        }
        return date;
    }
}
