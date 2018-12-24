package com.manorama.dilipkishayari.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 * Created by jaideep on 14-09-2016.
 */
public class Utils {

    public static String RESPONSE = Utils.DEFAULT;
    public static String AMIT_BHADANA = "UC_vcKmg67vjMP7ciLnSxSHQ";
    public static String ASHISH_CHANCHALANI = "UC7eHZXheF8nVOfwB2PEslMw";
    public static String BOLLYWOOD_SONGS = "UC54cGGeCBYr-wxELJ9pHAJA";
    public static String BB_KI_VINES = "UCqwUrj10mAEsqezcItqvwEw";

    public final static String YOUTUBE_CHANNEL_ID = "UUrwE8kVqtIUVUzKui2WVpuQ";

    public final static String SPACE = " ";
    public final static String DEFAULT = "";
    public final static String NEW_LINE = "\n";
    public final static String STAR = "*";
    public final static String DEFAULT_NULL = "null";
    public final static String MODIFIED_NULL = "<null>";
    public static final String DEFAULT_NOT_APPLICABLE = "N/A";
    public static final String DEFAULT_NOT_SPECIFIED = "Not Specified";
    public static final String DEFAULT_NO_NAME = "No Name";
    public static final String COMMA_WITH_SPACE = ", ";
    public static final String NEXT_PAGE_TOKEN = "&pagetoken=";
    public static final String MAIL_DOT_COM = ".com";
    public static final String AT_THE_RATE = "@";
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final int REQUEST_CODE = 100;

    public static final String TIME_FORMAT_AM_PM = " h:mm a ";

    public static final String DIMENSION_WIDTH = "dimension_width";
    public static final String DIMENSION_HEIGHT = "dimension_height";

    public static int admobDisplayCount = 0;

    /*********************************************************************
     * @param testString
     * @return boolean
     * @function isValidString()
     * @description Check & return valid string
     *********************************************************************/
    public static boolean isValidString(String testString) {
        try {
            if (testString != null
                    && !testString.trim().equalsIgnoreCase(
                    DEFAULT_NOT_APPLICABLE)
                    && !testString.equalsIgnoreCase(DEFAULT_NOT_SPECIFIED)
                    && !testString.equalsIgnoreCase(DEFAULT_NULL)
                    && !testString.equalsIgnoreCase(MODIFIED_NULL)
                    && !testString.equalsIgnoreCase(DEFAULT)) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static void printText(String value) {
        System.out.println("###### " + value);
    }

    public static String getCurrentTime(String timeFormate) {
        long timeLong = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat(" hh:mma ");
        DateFormatSymbols symbols = new DateFormatSymbols();
        symbols.setAmPmStrings(new String[]{"AM", "PM"});
        dateFormat.setDateFormatSymbols(symbols);
        String systemTime = dateFormat.format(timeLong);

        return systemTime;
    }

    public static String millionString(String numberStr) {
        Long numberLong = new Long(numberStr);
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String numberAsString = decimalFormat.format(numberLong);
        return numberAsString;
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void hideSoftKeyboard(EditText editText, Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static String getResponseText(String stringUrl) {
        System.out.println("############# getResponseText : " + stringUrl);
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(stringUrl);
            HttpURLConnection httpconn = (HttpURLConnection) url.openConnection();
            if (httpconn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader input = new BufferedReader(new InputStreamReader(
                        httpconn.getInputStream()), 8192);
                String strLine = null;
                while ((strLine = input.readLine()) != null) {
                    response.append(strLine);
                }
                input.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return response.toString();
    }

    public static boolean validCellPhone(String number) {
        if (Utils.isValidString(number) && (number.length() != 10)) {
            return false;
        }
        return android.util.Patterns.PHONE.matcher(number).matches();
    }

    public static boolean setGlobalSharedPref(Context context, String key, String value) {
        if (context != null && isValidString(key) && isValidString(value)) {
            //SharedPreferences sharedpreferences = context.getSharedPreferences(Utils.FINDER_REGISTRATION_SHARED_PREF, MODE_PRIVATE);
            //SharedPreferences.Editor editor = sharedpreferences.edit();
            //editor.putString(key, value);
            //editor.commit();
            return true;
        } else {
            return false;
        }
    }

    public static String getGlobalSharedPref(Context context, String key) {
        String returnValue = null;
        if (context != null && isValidString(key)) {
//            SharedPreferences sharedpreferences = context.getSharedPreferences(Utils.FINDER_REGISTRATION_SHARED_PREF, MODE_PRIVATE);
//            returnValue = sharedpreferences.getString(key, null);
        }
        return returnValue;
    }


//    public static void rotateFabForward(final FloatingActionButton fab) {
//        Handler mhandler = new Handler();
//        if (fab != null) {
//            ViewCompat.animate(fab)
//                    .rotation(135.0F)
//                    .withLayer()
//                    .setDuration(300L)
//                    .setInterpolator(new OvershootInterpolator(2.0F))
//                    .start();
//            mhandler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    ViewCompat.animate(fab)
//                            .rotation(0.0F)
//                            .withLayer()
//                            .setDuration(300L)
//                            .setInterpolator(new OvershootInterpolator(2.0F))
//                            .start();
//                }
//            }, 500);
//        }
//    }

    public static JSONObject getActivityJson(Activity activity) {
        if (activity != null) {
            try {
                JSONObject object = new JSONObject();
                object.put("activity", activity);
                printText("############### hello before activity : " + activity);
                printText("############### hello set activity : " + object.toString());
                printText("############### hello get activity : " + object.get("activity"));
                // FinderBaseActivity baseActivity = (FinderBaseActivity) object.get("activity");
                //printText("############### hello after activity : " + baseActivity);
                return object;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getDimesionPixel(Context mContext, String dimension) {
        int pixelInDP = (dimension.equals(DIMENSION_WIDTH)) ? Utils.getScreenWidthDP(mContext) : Utils.getScreenHeightDP(mContext);
        int paddingDp = pixelInDP - 140;
        float density = mContext.getResources().getDisplayMetrics().density;
        int paddingPixel = (int) (paddingDp * density);
        return paddingPixel;
    }

    public static int getScreenWidthDP(Context mContext) {
        DisplayMetrics displayMetrics = mContext.getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        return Math.round(dpWidth);
    }

    public static int getScreenHeightDP(Context mContext) {
        DisplayMetrics displayMetrics = mContext.getResources().getDisplayMetrics();
        float dpHeight = displayMetrics.heightPixels / displayMetrics.density;
        return Math.round(dpHeight);
    }

    public static int getScreenWidth(Context mContext) {

        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static String parseDuration(String duration) {
        duration = duration.contains("PT") ? duration.replace("PT", "") : duration;
        duration = duration.contains("S") ? duration.replace("S", "") : duration;
        duration = duration.contains("H") ? duration.replace("H", ":") : duration;
        duration = duration.contains("M") ? duration.replace("M", ":") : duration;
        String[] split = duration.split(":");
        for (int i = 0; i < split.length; i++) {
            String item = split[i];
            split[i] = item.length() <= 1 ? "0" + item : item;
        }
        return TextUtils.join(":", split);
    }

    public static boolean isNetworkAvailable(Context context) {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }

    public static int getAdmobDisplayCount() {
        return admobDisplayCount;
    }

    public static void setAdmobDisplayCount(int admobDisplayCount) {
        Utils.admobDisplayCount = admobDisplayCount;
    }

    public static boolean isAdmobDisplay() {
        if (admobDisplayCount < 5) {
            admobDisplayCount = admobDisplayCount + 1;
            return false;
        } else {
            admobDisplayCount = 0;
            return true;
        }

    }

    public static String getBuildVersion(Context mContext) {
        String versionName = Utils.DEFAULT;
        try {
            versionName = mContext.getPackageManager()
                    .getPackageInfo(mContext.getPackageName(), 0).versionName;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return versionName;
    }

    public static String capitalize(@NonNull String input) {

        String[] words = input.toLowerCase().split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (i > 0 && word.length() > 0) {
                builder.append(" ");
            }

            String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
            builder.append(cap);
        }
        return builder.toString();
    }

    public static Bitmap getImageBitmap(Context mContext, View v) {
        DisplayMetrics dm = mContext.getResources().getDisplayMetrics();
        v.measure(View.MeasureSpec.makeMeasureSpec(dm.widthPixels, View.MeasureSpec.EXACTLY),
                View.MeasureSpec.makeMeasureSpec(dm.heightPixels, View.MeasureSpec.EXACTLY));
        v.layout(0, 0, v.getMeasuredWidth(), v.getMeasuredHeight());
        Bitmap returnedBitmap = Bitmap.createBitmap(v.getMeasuredWidth(),
                v.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(returnedBitmap);
        v.draw(c);

        return returnedBitmap;
    }

    public static void shareImage(Context context, Bitmap bitmap,String text){
        //bitmap is ur image and text is which is written in edtitext
        //you will get the image from the path
        String pathofBmp=
                MediaStore.Images.Media.insertImage(context.getContentResolver(),
                        bitmap,"title", null);
        Uri uri = Uri.parse(pathofBmp);
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Star App");
        shareIntent.putExtra(Intent.EXTRA_TEXT, text);
        shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
        context.startActivity(Intent.createChooser(shareIntent, "Share with"));
    }
}
