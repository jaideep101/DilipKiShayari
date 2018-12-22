package com.manorama.dilipkishayari.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manorama.dilipkishayari.R;
import com.manorama.dilipkishayari.model.HomeImageModel;

import java.util.List;

public class HomeViewpagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<HomeImageModel> homeImageModelList = null;

    public HomeViewpagerAdapter(Context context, List<HomeImageModel> homeImageModelList) {
        this.homeImageModelList = homeImageModelList;
        this.mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        HomeImageModel modelObject = homeImageModelList.get(position);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.item_home_viewpager, collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return homeImageModelList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public String getPageTitle(int position) {
        HomeImageModel homeImageModel = homeImageModelList.get(position);
        return homeImageModel.getShayariTitle();
    }

}

