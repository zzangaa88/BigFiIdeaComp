package com.example.user.bigfiideacomp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by USER on 2017-10-24.
 */

public class Idea_16_2 extends android.support.v4.app.Fragment {
    public Idea_16_2(){
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.idea_16_2, container, false);
        return layout;
    }
}