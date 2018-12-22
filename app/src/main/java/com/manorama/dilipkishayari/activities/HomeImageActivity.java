package com.manorama.dilipkishayari.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.manorama.dilipkishayari.R;
import com.manorama.dilipkishayari.adapter.HomeViewpagerAdapter;
import com.manorama.dilipkishayari.model.HomeImageModel;
import com.manorama.dilipkishayari.transformations.CubeInDepthTransformation;
import com.manorama.dilipkishayari.transformations.CubeInRotationTransformation;
import com.manorama.dilipkishayari.transformations.CubeInScalingTransformation;
import com.manorama.dilipkishayari.transformations.CubeOutScalingTransformation;
import com.manorama.dilipkishayari.transformations.DepthTransformation;
import com.manorama.dilipkishayari.transformations.FanTransformation;
import com.manorama.dilipkishayari.transformations.FidgetSpinTransformation;
import com.manorama.dilipkishayari.transformations.GateTransformation;
import com.manorama.dilipkishayari.transformations.PopTransformation;
import com.manorama.dilipkishayari.transformations.SimpleTransformation;
import com.manorama.dilipkishayari.transformations.TossTransformation;

import java.util.ArrayList;
import java.util.List;

public class HomeImageActivity extends AppCompatActivity {
    private List<HomeImageModel> homeImageModelList = new ArrayList<HomeImageModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_viewpager);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new HomeViewpagerAdapter(this, getHomeImageModelList()));
        viewPager.setPageTransformer(true, new FidgetSpinTransformation());
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
