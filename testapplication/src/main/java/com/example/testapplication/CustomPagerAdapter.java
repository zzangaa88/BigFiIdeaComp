package com.example.testapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/**
 * Created by USER on 2017-11-16.
 */
public class CustomPagerAdapter extends PagerAdapter {
    private Context context;
    private List<DataObject> dataObjects;
    private LayoutInflater layoutInflater;

    /**
     * context와 dataObjects를 메게변수로 받는 생성자를 이용해 값 전달
     * @param context view를 표현할 context 값
     * @param dataObjects 표현될 view가 저장된 List
     *
     */
    public CustomPagerAdapter(Context context, List<DataObject> dataObjects) {
        this.context = context;
        this.layoutInflater = (LayoutInflater)this.context.getSystemService(this.context.LAYOUT_INFLATER_SERVICE);
        this.dataObjects = dataObjects;
    }

    /**
     * @return
     *  ImageView에서 CustomPagerAdapter 객체에 요청하는 값
     *  CustomPagerAdapter 객체가 만들어낼 View의 개수를 반환
     *  전달받은 dataObject List의 size()를 반환한다
     */

    @Override
    public int getCount() {
        return dataObjects.size();
    }

    /**
     *
     * @param view
     * @param object
     * @return object 값과 view값이 일치하는지 확인한 결과를 반환
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.pager_list_items, container, false);
        ImageView imageView = view.findViewById(R.id.large_image);
        imageView.setImageResource(this.dataObjects.get(position).getImagerId());
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView((View) object); // ViewPager에 보이지않는 View를 제거한다.
    }
}
