package com.manorama.dilipkishayari.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.manorama.dilipkishayari.R;
import com.manorama.dilipkishayari.activities.HomeImageActivity;
import com.manorama.dilipkishayari.model.HomeImageModel;
import com.manorama.dilipkishayari.utilities.Utils;

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
        handleAdapterUI(layout, position);
        collection.addView(layout);
        return layout;
    }

    private void handleAdapterUI(final ViewGroup layout, int position){
        HomeImageModel homeImageModel = homeImageModelList.get(position);
        TextView messageTextView = layout.findViewById(R.id.shayari_message);
        if(Utils.isValidString(homeImageModel.getShayariMessage())){
            messageTextView.setText(homeImageModel.getShayariMessage());
        }

//        String pagination = (position)+" / "+homeImageModelList.size();
//        ((HomeImageActivity)mContext).setShayariPagination(pagination);

        ImageView shareImageView = layout.findViewById(R.id.share_imageview);
        shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView viewPagerCardView = layout.findViewById(R.id.viewpager_cardview);
                Bitmap mBitmap = Utils.getImageBitmap(mContext, viewPagerCardView);
                Utils.shareImage(mContext, mBitmap, "Dilip Ki Shayari");
            }
        });
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

    public int getListSize(){
        return homeImageModelList.size();
    }

}

