package com.manorama.dilipkishayari.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.manorama.dilipkishayari.R;
import com.manorama.dilipkishayari.utilities.Constants;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class DashboardActivity extends AppCompatActivity {
    private static final int PERMISSION_REQUEST_CODE = 200;

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
        requestPermission();
    }

    private void initDashboard() {
        setupDashboardImage();
        setupCardView();
    }

    private void setupDashboardImage(){
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
    }

    private void setupCardView(){
        cardViewOne = (CardView) findViewById(R.id.card_home_1);
        cardViewOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity(Constants.CONST_LOVE_SHAYARI);
            }
        });
        cardViewTwo = (CardView) findViewById(R.id.card_home_2);
        cardViewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity(Constants.CONST_SAD_SHAYARI);
            }
        });
        cardViewThree = (CardView) findViewById(R.id.card_home_3);
        cardViewThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity(Constants.CONST_MISSING_SHAYARI);
            }
        });
        cardViewFour = (CardView) findViewById(R.id.card_home_4);
        cardViewFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity(Constants.CONST_FRIENDS_SHAYARI);
            }
        });
        cardViewFive = (CardView) findViewById(R.id.card_home_5);
        cardViewFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity(Constants.CONST_FUNNY_SHAYARI);
            }
        });
        cardViewSix = (CardView) findViewById(R.id.card_home_6);
        cardViewSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity(Constants.CONST_INSPIRAL_SHAYARI);
            }
        });
        cardViewSeven = (CardView) findViewById(R.id.card_home_7);
        cardViewSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity(Constants.CONST_MORNING_SHAYARI);
            }
        });
        cardViewEight = (CardView) findViewById(R.id.card_home_8);
        cardViewEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomePageActivity(Constants.CONST_WISHES_SHAYARI);
            }
        });
    }

    private void setPicassoImage(ImageView imageView, int imageResId) {
        Glide.with(DashboardActivity.this).load(imageResId).into(imageView);
    }

    private void startHomePageActivity(String shayariType) {
        Intent intent = new Intent(DashboardActivity.this, HomeImageActivity.class);
        intent.putExtra(Constants.CONST_SHAYARI_TYPE, shayariType);
        startActivity(intent);
    }


    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (shouldShowRequestPermissionRationale(ACCESS_FINE_LOCATION)) {
                            showMessageOKCancel("You need to allow access to both the permissions",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                                requestPermissions(new String[]{WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE},
                                                        PERMISSION_REQUEST_CODE);
                                            }
                                        }
                                    });
                            return;
                        }
                    }

                }
                break;
        }
    }

    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {
        new AlertDialog.Builder(DashboardActivity.this)
                .setMessage(message)
                .setPositiveButton("OK", okListener)
                .setNegativeButton("Cancel", null)
                .create()
                .show();
    }
}
