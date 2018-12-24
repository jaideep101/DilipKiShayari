package com.manorama.dilipkishayari.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.manorama.dilipkishayari.R;
import com.manorama.dilipkishayari.adapter.HomeViewpagerAdapter;
import com.manorama.dilipkishayari.json.LoveShayariHandler;
import com.manorama.dilipkishayari.model.HomeImageModel;
import com.manorama.dilipkishayari.transformations.SimpleTransformation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HomeImageActivity extends AppCompatActivity {
    private List<HomeImageModel> homeImageModelList = new ArrayList<HomeImageModel>();
    LoveShayariHandler jsonLoveHandler = new LoveShayariHandler();
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
        initHomeImageScreen();
    }

    public void initHomeImageScreen(){
        viewPager = (ViewPager) findViewById(R.id.viewpager);

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
        setViewPagerAdapter();
    }

    private void setViewPagerAdapter(){
        jsonLoveHandler.createLoveJson();
        System.out.println("################################## createLoveJson : "+getHomeImageModelList(jsonLoveHandler.getLoveJsonArray()).size());
        HomeViewpagerAdapter viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(jsonLoveHandler.getLoveJsonArray()));
        viewPager.setAdapter(viewpagerAdapter);
        viewPager.setPageTransformer(true, new SimpleTransformation());
        viewPager.invalidate();
    }

    private List<HomeImageModel> getHomeImageModelList(JSONArray jsonArray) {
        HomeImageModel homeImageModel = null;
        try {
            for (int i = 0; i < jsonArray.length(); i++) {
                homeImageModel = new HomeImageModel();
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                if(jsonObject.has(LoveShayariHandler.JSON_ID)){
                    homeImageModel.setShayariId(jsonObject.getString(LoveShayariHandler.JSON_ID));
                }

                if(jsonObject.has(LoveShayariHandler.JSON_TITLE)){
                    homeImageModel.setShayariTitle(jsonObject.getString(LoveShayariHandler.JSON_TITLE));
                }

                if(jsonObject.has(LoveShayariHandler.JSON_MESSAGE)){
                    homeImageModel.setShayariMessage(jsonObject.getString(LoveShayariHandler.JSON_MESSAGE));
                }
                homeImageModelList.add(homeImageModel);
            }
        }catch (JSONException jex){
            jex.printStackTrace();
        }
        return homeImageModelList;
    }

}
