package com.manorama.dilipkishayari.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.manorama.dilipkishayari.R;
import com.squareup.picasso.Picasso;

public class DashboardActivity extends AppCompatActivity {

    private CardView cardViewOne;
    private CardView cardViewTwo;
    private CardView cardViewThree;
    private CardView cardViewFour;
    private CardView cardViewFive;
    private CardView cardViewSix;
    private CardView cardViewSeven;
    private CardView cardViewEight;

    private ImageView dashboareImageviewOne;
    private ImageView dashboareImageviewTwo;
    private ImageView dashboareImageviewThree;
    private ImageView dashboareImageviewFour;
    private ImageView dashboareImageviewFive;
    private ImageView dashboareImageviewSix;
    private ImageView dashboareImageviewSeven;
    private ImageView dashboareImageviewEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initDashboard();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void initDashboard(){
        dashboareImageviewOne = findViewById(R.id.dashboard_image_one);
        setPicassoImage(dashboareImageviewOne, R.drawable.dashboard_love);
        dashboareImageviewTwo = findViewById(R.id.dashboard_image_two);
        setPicassoImage(dashboareImageviewTwo, R.drawable.dashboard_sad);
        dashboareImageviewThree = findViewById(R.id.dashboard_image_three);
        setPicassoImage(dashboareImageviewThree, R.drawable.dashboard_missing);
        dashboareImageviewFour = findViewById(R.id.dashboard_image_four);
        setPicassoImage(dashboareImageviewFour, R.drawable.dashboard_friends);
        dashboareImageviewFive = findViewById(R.id.dashboard_image_five);
        setPicassoImage(dashboareImageviewFive, R.drawable.dashboard_funny);
        dashboareImageviewSix = findViewById(R.id.dashboard_image_six);
        setPicassoImage(dashboareImageviewSix, R.drawable.dashboard_inspire);
        dashboareImageviewSeven = findViewById(R.id.dashboard_image_seven);
        setPicassoImage(dashboareImageviewSeven, R.drawable.dashboard_morning);
        dashboareImageviewEight = findViewById(R.id.dashboard_image_eight);
        setPicassoImage(dashboareImageviewEight, R.drawable.dashboard_wishes);
        cardViewOne = (CardView)findViewById(R.id.card_home_1);
        cardViewOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity();
            }
        });
        cardViewTwo = (CardView)findViewById(R.id.card_home_2);
        cardViewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity();
            }
        });
        cardViewThree = (CardView)findViewById(R.id.card_home_3);
        cardViewThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity();
            }
        });
        cardViewFour = (CardView)findViewById(R.id.card_home_4);
        cardViewFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity();
            }
        });
        cardViewFive = (CardView)findViewById(R.id.card_home_5);
        cardViewFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity();
            }
        });
        cardViewSix = (CardView)findViewById(R.id.card_home_6);
        cardViewSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity();
            }
        });
        cardViewSeven = (CardView)findViewById(R.id.card_home_7);
        cardViewSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity();
            }
        });
        cardViewEight = (CardView)findViewById(R.id.card_home_8);
        cardViewEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity();
            }
        });
    }

    private void setPicassoImage(ImageView imageView, int imageResId){
        Glide.with(DashboardActivity.this).load(imageResId).into(imageView);
    }

    private void startHomePageActivity(){
        Intent intent = new Intent(DashboardActivity.this, HomeImageActivity.class);
        startActivity(intent);
    }
}
