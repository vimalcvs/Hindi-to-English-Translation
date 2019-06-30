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
import com.vimalinc.hieg.webview.Webview10;
import com.vimalinc.hieg.fragment.QuestionsMakingSimpleTranslationAdapter;

import java.util.ArrayList;

public class QuestionsMakingSimpleTranslation extends AppCompatActivity {
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
        QuestionsMakingSimpleTranslationAdapter adapter = new QuestionsMakingSimpleTranslationAdapter(this, R.layout.item_listview, stringArrayList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Webview10.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 32.html");
                    String message = "Yes/No Type Questions";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 1) {

                    Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Webview10.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 33.html");
                    String message = "Tag Type Questions";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 2) {

                    Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Webview10.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 34.html");
                    String message = "W-family words - What & Which";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 3) {

                    Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Webview10.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 35.html");
                    String message = "W-family words - Who, Whom";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 4) {

                    Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Webview10.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 36.html");
                    String message = "W-family words - Who, Whose";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 5) {

                    Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Webview10.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 37.html");
                    String message = "W-family words - Where & When";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 6) {

                    Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Webview10.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 38.html");
                    String message = "W-family words - Why & How ";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 7) {

                    Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Webview10.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 39.html");
                    String message = "Other Types of Questions";
                    i.putExtra("key", message);
                    startActivity(i);
                }
            }
        });
    }

    private void setData() {
        stringArrayList = new ArrayList<>();
        stringArrayList.add("Yes/No Type Questions");
        stringArrayList.add("Tag Type Questions");
        stringArrayList.add("W-family words - What & Which");


        stringArrayList.add("W-family words - Who, Whom");
        stringArrayList.add("W-family words - Who, Whose");
        stringArrayList.add("W-family words - Where & When");

        stringArrayList.add("W-family words - Why & How ");
        stringArrayList.add("Other Types of Questions");



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
                Intent i = new Intent(QuestionsMakingSimpleTranslation.this, Aboutme.class);
                startActivity(i);

                return true;

            case R.id.notification:
                Intent i1 = new Intent(QuestionsMakingSimpleTranslation.this, Notification.class);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(QuestionsMakingSimpleTranslation.this);
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

