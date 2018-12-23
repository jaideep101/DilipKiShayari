package com.manorama.dilipkishayari.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.manorama.dilipkishayari.R;
import com.manorama.dilipkishayari.adapter.HomeViewpagerAdapter;
import com.manorama.dilipkishayari.model.HomeImageModel;
import com.manorama.dilipkishayari.transformations.SimpleTransformation;

import java.util.ArrayList;
import java.util.List;

public class HomeImageActivity extends AppCompatActivity {
    private List<HomeImageModel> homeImageModelList = new ArrayList<HomeImageModel>();
    private ImageView leftImageView;
    private ImageView rightImageView;
    private ImageView refreshImageView;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_viewpager);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setViewPagerAdapter();

        leftImageView = (ImageView)findViewById(R.id.left_item_imageview);
        leftImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            }
        });
        rightImageView = (ImageView)findViewById(R.id.right_item_imageview);
        rightImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(viewPager.getCurrentItem()+ 1);
            }
        });
        refreshImageView = (ImageView)findViewById(R.id.refresh_item_imageview);
        refreshImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setViewPagerAdapter();
            }
        });
    }

    private void setViewPagerAdapter(){
        HomeViewpagerAdapter viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList());
        viewPager.setAdapter(viewpagerAdapter);
        viewPager.setPageTransformer(true, new SimpleTransformation());
        viewPager.invalidate();
    }

    private List<HomeImageModel> getHomeImageModelList() {
        HomeImageModel homeImageModel = null;
        for (int i = 0; i < 10; i++) {
            homeImageModel = new HomeImageModel();
            homeImageModel.setShayariTitle("Page One");
            homeImageModel.setShayariMessage("Page One Message");
            homeImageModelList.add(homeImageModel);
        }
        return homeImageModelList;
    }
}
