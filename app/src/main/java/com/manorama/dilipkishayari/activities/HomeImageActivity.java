package com.manorama.dilipkishayari.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.manorama.dilipkishayari.R;
import com.manorama.dilipkishayari.adapter.HomeViewpagerAdapter;
import com.manorama.dilipkishayari.json.FriendsShayariHandler;
import com.manorama.dilipkishayari.json.FunnyShayariHandler;
import com.manorama.dilipkishayari.json.InspiralShayariHandler;
import com.manorama.dilipkishayari.json.LoveShayariHandler;
import com.manorama.dilipkishayari.json.MissingShayariHandler;
import com.manorama.dilipkishayari.json.MorningShayariHandler;
import com.manorama.dilipkishayari.json.SadShayariHandler;
import com.manorama.dilipkishayari.json.WishesShayariHandler;
import com.manorama.dilipkishayari.model.HomeImageModel;
import com.manorama.dilipkishayari.transformations.SimpleTransformation;
import com.manorama.dilipkishayari.utilities.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HomeImageActivity extends AppCompatActivity {
    private List<HomeImageModel> homeImageModelList = new ArrayList<HomeImageModel>();
    private ImageView leftImageView;
    private ImageView rightImageView;
    private ImageView refreshImageView;
    private ViewPager viewPager;
    private String intentType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_viewpager);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if(getIntent() != null && getIntent().hasExtra(Constants.CONST_SHAYARI_TYPE)){
            intentType = getIntent().getStringExtra(Constants.CONST_SHAYARI_TYPE);
        }
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
        HomeViewpagerAdapter viewpagerAdapter = getViewPagerAdapter();
        viewPager.setAdapter(viewpagerAdapter);
        viewPager.setPageTransformer(true, new SimpleTransformation());
        viewPager.invalidate();
    }

    private HomeViewpagerAdapter getViewPagerAdapter(){
        HomeViewpagerAdapter viewpagerAdapter = null;

        switch (intentType){
            case Constants.CONST_LOVE_SHAYARI:
                LoveShayariHandler loveShayariHandler = new LoveShayariHandler();
                loveShayariHandler.createLoveJson();
                viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(loveShayariHandler.getLoveJsonArray()));
                break;
            case Constants.CONST_SAD_SHAYARI:
                SadShayariHandler sadShayariHandler = new SadShayariHandler();
                sadShayariHandler.createSadJson();
                viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(sadShayariHandler.getSadJsonArray()));
                break;
            case Constants.CONST_MISSING_SHAYARI:
                MissingShayariHandler missingShayariHandler = new MissingShayariHandler();
                missingShayariHandler.createMissingJson();
                viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(missingShayariHandler.getMissingJsonArray()));
                break;
            case Constants.CONST_FRIENDS_SHAYARI:
                FriendsShayariHandler friendsShayariHandler = new FriendsShayariHandler();
                friendsShayariHandler.createFriendsJson();
                viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(friendsShayariHandler.getFriendsJsonArray()));
                break;
            case Constants.CONST_FUNNY_SHAYARI:
                FunnyShayariHandler funnyShayariHandler = new FunnyShayariHandler();
                funnyShayariHandler.createFunnyJson();
                viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(funnyShayariHandler.getFunnyJsonArray()));
                break;
            case Constants.CONST_INSPIRAL_SHAYARI:
                InspiralShayariHandler inspiralShayariHandler = new InspiralShayariHandler();
                inspiralShayariHandler.createInspiralJson();
                viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(inspiralShayariHandler.getInspiralJsonArray()));
                break;
            case Constants.CONST_MORNING_SHAYARI:
                MorningShayariHandler morningShayariHandler = new MorningShayariHandler();
                morningShayariHandler.createMorningJson();
                viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(morningShayariHandler.getMorningJsonArray()));
                break;
            case Constants.CONST_WISHES_SHAYARI:
                WishesShayariHandler wishesShayariHandler = new WishesShayariHandler();
                wishesShayariHandler.createWishesJson();
                viewpagerAdapter = new HomeViewpagerAdapter(this, getHomeImageModelList(wishesShayariHandler.getWishesJsonArray()));
                break;
        }
        return viewpagerAdapter;
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
