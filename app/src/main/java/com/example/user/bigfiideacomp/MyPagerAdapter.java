package com.example.user.bigfiideacomp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by USER on 2017-10-25.
 */

public class MyPagerAdapter extends PagerAdapter {
    private Context context;
    private List<DataObject> dataObjectsList;
    private LayoutInflater layoutInflater;

    public MyPagerAdapter(Context context, List<DataObject> dataObjectsList) {
        this.context = context;
        this.dataObjectsList = dataObjectsList;
        this.layoutInflater = (LayoutInflater)this.context.getSystemService(this.context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dataObjectsList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        View view = this.layoutInflater.inflate(R.layout.idea_15_1, container, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.idea_15_z1_img);
        imageView.setImageResource(this.dataObjectsList.get(position).getImageId());
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }
}
