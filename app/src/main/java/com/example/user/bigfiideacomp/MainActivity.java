package com.example.user.bigfiideacomp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.blink_text);
        Animation animation = new AlphaAnimation(0.0f , 1.0f);
        animation.setDuration(300);
        animation.setStartOffset(30);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);
        textView.startAnimation(animation);
        textView.setText("화면을 클릭해 주세요");
        textView.setVisibility(View.VISIBLE);
        LinearLayout layout = (LinearLayout)findViewById(R.id.main_ll);
        layout.setVisibility(View.VISIBLE);

    }

    public void img_Click(View view) {
        Intent intent = new Intent(this, Year15_17.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

    }
}
