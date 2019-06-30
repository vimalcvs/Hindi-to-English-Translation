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
import com.vimalinc.hieg.webview.Webview3;
import com.vimalinc.hieg.fragment.IndefiniteTensesRulesAdapter;

import java.util.ArrayList;

public class IndefiniteTensesRules extends AppCompatActivity {
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
        IndefiniteTensesRulesAdapter adapter = new IndefiniteTensesRulesAdapter(this, R.layout.item_listview, stringArrayList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent i = new Intent(IndefiniteTensesRules.this, Webview3.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 59.html");
                    String message = "Present Indefinite Tense";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 1) {

                    Intent i = new Intent(IndefiniteTensesRules.this, Webview3.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 60.html");
                    String message = "Past Indefinite Tense";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 2) {

                    Intent i = new Intent(IndefiniteTensesRules.this, Webview3.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 61.html");
                    String message = "Future Indefinite Tense";
                    i.putExtra("key", message);
                    startActivity(i);
                }

            }
        });
    }

    private void setData() {
        stringArrayList = new ArrayList<>();
        stringArrayList.add("Present Indefinite Tense");
        stringArrayList.add("Past Indefinite Tense");
        stringArrayList.add("Future Indefinite Tense");


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
                Intent i = new Intent(IndefiniteTensesRules.this, Aboutme.class);
                startActivity(i);

                return true;

            case R.id.notification:
                Intent i1 = new Intent(IndefiniteTensesRules.this, Notification.class);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(IndefiniteTensesRules.this);
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

