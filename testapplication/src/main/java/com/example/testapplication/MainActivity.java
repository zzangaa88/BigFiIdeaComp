package com.example.testapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private CustomPagerAdapter customPagerAdapter;
    private ViewPager viewPager;
    private ImageView imageView;
    private TextView textView;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.main_img);
        textView = (TextView)findViewById(R.id.main_text);
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "경기천년바탕_Regular.otf"));
        imageView.setImageResource(R.drawable.bf_main);
        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(300);
        animation.setStartOffset(20);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);
        textView.startAnimation(animation);

    }
    public void mOnClick(View view) {
        intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
    }
}
