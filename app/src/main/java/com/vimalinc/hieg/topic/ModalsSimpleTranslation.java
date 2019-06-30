package com.vimalinc.hieg.topic;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.vimalinc.hieg.Aboutme;
import com.vimalinc.hieg.Notification;
import com.vimalinc.hieg.R;
import com.vimalinc.hieg.webview.Webview9;
import com.vimalinc.hieg.fragment.ModalsSimpleTranslationAdapter;

import java.util.ArrayList;

public class ModalsSimpleTranslation extends AppCompatActivity {
    private InterstitialAd mInterstitialAd = null;
    private ArrayList<String> stringArrayList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_listview);
        init();
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in_overshoot_2);
        listView.startAnimation(animation);


        mInterstitialAd= new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest2);




        AdView mAdView = findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ListView mListView = (ListView) findViewById(R.id.list_item);
        setData();
        ModalsSimpleTranslationAdapter adapter = new ModalsSimpleTranslationAdapter(this, R.layout.item_listview, stringArrayList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 18.html");
                    String message = "May (सकता है)";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 1) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 19.html");
                    String message = "Might (सकता है/सकता था)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 2) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 21.html");
                    String message = "May have / Might have";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 3) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 22.html");
                    String message = "Can (सकता है)";
                    i.putExtra("key", message);
                    startActivity(i);


                }
                if (position == 4) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 23.html");
                    String message = "Could (सकता है/सकता था)";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 5) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 24.html");
                    String message = "Will be able to";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 6) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 25.html");
                    String message = "Shall/Will";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 7) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 26.html");
                    String message = "Should And Ought To";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 8) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 27.html");
                    String message = "Would";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 9) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 28.html");
                    String message = "Must (जरूर चाहिए,अवश्य चाहिए)";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 10) {
                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 29.html");
                    String message = "Need (ज़रूरत,आवश्यकता)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 11) {
                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 30.html");
                    String message = "Dare (हिम्मत,साहस)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 12) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 31.html");
                    String message = "Used To";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 13) {

                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 1.html");
                    String message = "Have/Has (पास है/रखता है)";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 14) {
                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 2.html");
                    String message = "Polite Words (विनम्र शब्द)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 15) {
                    Intent i = new Intent(ModalsSimpleTranslation.this, Webview9.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 17.html");
                    String message = "Compulsion Sentenes (मजबूरी वाले वाक्य)";
                    i.putExtra("key", message);
                    startActivity(i);
                }

            }
        });
    }

    private void setData() {
        stringArrayList = new ArrayList<>();
        stringArrayList.add("May (सकता है)");
        stringArrayList.add("Might (सकता है/सकता था)");
        stringArrayList.add("May have / Might have");

        stringArrayList.add("Can (सकता है)");
        stringArrayList.add("Could (सकता है/सकता था)");
        stringArrayList.add("Will be able to");



        stringArrayList.add("Shall/Will");
        stringArrayList.add("Should And Ought To");
        stringArrayList.add("Would");



        stringArrayList.add("Must (जरूर चाहिए,अवश्य चाहिए)");
        stringArrayList.add("Need (ज़रूरत,आवश्यकता)");
        stringArrayList.add("Dare (हिम्मत,साहस)");


        stringArrayList.add("Used To");
        stringArrayList.add("Have/Has (पास है/रखता है)");
        stringArrayList.add("Polite Words (विनम्र शब्द)");



        stringArrayList.add("Compulsion Sentenes (मजबूरी वाले वाक्य)");



    }


    public void init() {
        listView=(ListView)findViewById(R.id.list_item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.homemain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.action_about:
                Intent i = new Intent(ModalsSimpleTranslation.this, Aboutme.class);
                startActivity(i);

                return true;

            case R.id.notification:
                Intent i1 = new Intent(ModalsSimpleTranslation.this, Notification.class);
                startActivity(i1);
                return true;


            case R.id.action_share:
                String msg = "हिंदी से English में translate करना सीखें";
                String appUrl = "https://play.google.com/store/apps/details?id=" + getPackageName();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, msg + "\n\nDownload the app now\n" + appUrl);
                startActivity(intent);
                return true;


            case R.id.action_exit:
                AlertDialog.Builder builder = new AlertDialog.Builder(ModalsSimpleTranslation.this);
                builder.setTitle(R.string.app_name);
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setMessage("Do you want to exit?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {

                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        }
        else{
            super.onBackPressed();
        }
    }

}

