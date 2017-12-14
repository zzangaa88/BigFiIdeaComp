package com.example.user.bigfiideacomp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by USER on 2017-10-23.
 */

public class IdeaComp16 extends AppCompatActivity{
    private final int COUNT = 11;
    private ViewPager viewPager16;
    private ImageButton btn_left;
    private ImageButton btn_right;
    private ImageButton btn_back;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idea_comp_16_vp);
        viewPager16 = (ViewPager)findViewById(R.id.bd_vp_16);
        btn_left = (ImageButton)findViewById(R.id.btn_left);
        btn_right =(ImageButton) findViewById(R.id.btn_right);
        btn_back = (ImageButton)findViewById(R.id.btn_back);

        viewPager16.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        btn_right.setOnClickListener(movepageListener);
        btn_left.setOnClickListener(movepageListener);
        btn_back.setOnClickListener(movepageListener);

    }

    private View.OnClickListener movepageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int getId = v.getId();
            if(getId == R.id.btn_left){
                int cur = viewPager16.getCurrentItem();
                if(cur > 0 ){
                    viewPager16.setCurrentItem(cur-1, true);
                }else{
                    Toast.makeText(getApplicationContext(), "First Page", Toast.LENGTH_SHORT).show();
                }
            }else if(getId == R.id.btn_right){
                int cur = viewPager16.getCurrentItem();
                if(cur < COUNT-1){
                    viewPager16.setCurrentItem(cur+1, true);
                }else{
                    Toast.makeText(getApplicationContext(), "Last Page", Toast.LENGTH_SHORT).show();
                }
            }else if(getId == R.id.btn_back){
                finish();
            }
        }
    };

    private class pagerAdapter extends FragmentStatePagerAdapter {

        public pagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Idea_16_1();
                case 1:
                    return  new Idea_16_2();
                case 2:
                    return  new Idea_16_3();
                case 3:
                    return  new Idea_16_4();
                case 4:
                    return  new Idea_16_5();
                case 5:
                    return  new Idea_16_6();
                case 6:
                    return  new Idea_16_7();
                case 7:
                    return  new Idea_16_8();
                case 8:
                    return  new Idea_16_9();
                case 9:
                    return  new Idea_16_10();
                case 10:
                    return  new Idea_16_11();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return COUNT;
        }
    }
}
