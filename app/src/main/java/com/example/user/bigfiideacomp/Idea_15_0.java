package com.example.user.bigfiideacomp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by USER on 2017-10-25.
 */

public class Idea_15_0 extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idea_15_0);

        final VideoView videoView = (VideoView)findViewById(R.id.vv_15);
        final MediaController mediaController = new MediaController(this){
            @Override
            public void hide() {
            }

            @Override
            public boolean dispatchKeyEvent(KeyEvent event) {
                if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
                    Activity a = (Activity)getContext();
                    a.finish();
                }
                return true;
            }
        };

        mediaController.show(90000000);
        videoView.setMediaController(mediaController);

        String path = Environment.getExternalStorageDirectory().getAbsolutePath();
        Log.d("test", "절대경로 : " + path);

        videoView.setVideoPath(path + "/Movies/ideacomp2015.mp4");
        videoView.requestFocus();
        videoView.start();
        videoView.postDelayed(new Runnable() {
            @Override
            public void run() {
                mediaController.show();
//                videoView.pause();
            }
        }, 100);
    }
}
