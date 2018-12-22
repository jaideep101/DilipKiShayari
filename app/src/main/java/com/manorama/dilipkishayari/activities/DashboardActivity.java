package com.manorama.dilipkishayari.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.manorama.dilipkishayari.R;

public class DashboardActivity extends AppCompatActivity {

    private CardView cardViewOne;
    private CardView cardViewTwo;
    private CardView cardViewThree;
    private CardView cardViewFour;
    private CardView cardViewFive;
    private CardView cardViewSix;
    private CardView cardViewSeven;
    private CardView cardViewEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initDashboard();
    }

    private void initDashboard(){
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

    private void startHomePageActivity(){
        Intent intent = new Intent(DashboardActivity.this, HomeImageActivity.class);
        startActivity(intent);
    }
}
