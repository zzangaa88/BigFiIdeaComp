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

public class IdeaComp17 extends AppCompatActivity{
    private final int COUNT = 12;
    private ViewPager viewPager17;
    private ImageButton btn_left;
    private ImageButton btn_right;
    private ImageButton btn_back;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idea_comp_17_vp);
        viewPager17 = (ViewPager)findViewById(R.id.bd_vp_17);
        btn_left = (ImageButton)findViewById(R.id.btn_left);
        btn_right =(ImageButton) findViewById(R.id.btn_right);
        btn_back = (ImageButton)findViewById(R.id.btn_back);


        viewPager17.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        btn_right.setOnClickListener(movepageListener);
        btn_left.setOnClickListener(movepageListener);
        btn_back.setOnClickListener(movepageListener);

    }

    private View.OnClickListener movepageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int getId = v.getId();
            if(getId == R.id.btn_left){
                int cur = viewPager17.getCurrentItem();
                if(cur > 0 ){
                    viewPager17.setCurrentItem(cur-1, true);
                }else{
                    Toast.makeText(getApplicationContext(), "First Page", Toast.LENGTH_SHORT).show();
                }
            }else if(getId == R.id.btn_right){
                int cur = viewPager17.getCurrentItem();
                if(cur < COUNT-1){
                    viewPager17.setCurrentItem(cur+1, true);
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
                    return new Idea_17_1();
                case 1:
                    return  new Idea_17_2();
                case 2:
                    return  new Idea_17_3();
                case 3:
                    return  new Idea_17_4();
                case 4:
                    return  new Idea_17_5();
                case 5:
                    return  new Idea_17_6();
                case 6:
                    return  new Idea_17_7();
                case 7:
                    return  new Idea_17_8();
                case 8:
                    return  new Idea_17_9();
                case 9:
                    return  new Idea_17_10();
                case 10:
                    return  new Idea_17_11();
                case 11:
                    return  new Idea_17_12();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return COUNT;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
