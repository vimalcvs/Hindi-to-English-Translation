package com.vimalinc.hieg.topic;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import com.vimalinc.hieg.webview.Webview1;
import com.vimalinc.hieg.fragment.ListViewAdapter;

import java.util.ArrayList;

public class LearnTranslation extends AppCompatActivity {


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
        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.item_listview, stringArrayList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 40.html");
                    String message = "Articles-A, An or The";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 1) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 41.html");
                    String message = "Double Future";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 2) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 42.html");
                    String message = "Double Past";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 3) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 43.html");
                    String message = "Rule of 'ING'";
                    i.putExtra("key", message);
                    startActivity(i);


                }
                if (position == 4) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 44.html");
                    String message = "Use of It and There ";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 5) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 45.html");
                    String message = "Use of Keep on / Go on / Carry on ";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 6) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 46.html");
                    String message = "Use of Let ";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 7) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 47.html");
                    String message = "Use of Make ";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 8) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of Get/index.html");
                    String message = "Use of Get ";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 9) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 1/index.html");
                    String message = "Use of Is/Am/Are ";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 10) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 2/index.html");
                    String message = "Use of Was/Were ";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 11) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 3/index.html");
                    String message = "Use of This & That";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 12) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 4/index.html");
                    String message = "Use of These & Those";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 13) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 5/index.html");
                    String message = "Use of Shall be & Will be ";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 14) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 6/index.html");
                    String message = "Use of Has / Have / Had ";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 15) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 12/index.html");
                    String message = "Use of Will Have ";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 16) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 13/index.html");
                    String message = "Use of Had Better";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 17) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Use of 15/index.html");
                    String message = "Use of Dare ";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 18) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(3)");
                    String message = "Use of This, these, that, those ";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 19) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(4)");
                    String message = "Use Capital Letters? ";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 20) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(8)");
                    String message = "Use of Apostrophes ";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 21) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(1)");
                    String message = "Introductory There";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 22) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(2)");
                    String message = "Introductory it";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 23) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(5)");
                    String message = "Guidelines for Using Capital Letters ";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 24) {

                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(6)");
                    String message = "Omission of A/An/the ";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 25) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(7)");
                    String message = "Hindi-English Alphabet ";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 26) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(9)");
                    String message = "Imperative, Negative and Interrogative Sentences";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 27) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(10)");
                    String message = "Letters (A to Z) ";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 28) {
                    Intent i = new Intent(LearnTranslation.this, Webview1.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Introductory.html?id=(11)");
                    String message = "Writing Names in English ";
                    i.putExtra("key", message);
                    startActivity(i);
                }
            }
        });
    }

        private void setData() {
            stringArrayList = new ArrayList<>();
            stringArrayList.add("Articles-A, An or The");
            stringArrayList.add("Double Future");
            stringArrayList.add("Double Past");
            stringArrayList.add("Rule of 'ING'");
            stringArrayList.add("Use of It and There");
            stringArrayList.add("Use of Keep on / Go on / Carry on ");
            stringArrayList.add("Use of Let ");
            stringArrayList.add("Use of Make ");
            stringArrayList.add("Use of Get ");
            stringArrayList.add("Use of Is/Am/Are ");
            stringArrayList.add("Use of Was/Were ");
            stringArrayList.add("Use of This & That");
            stringArrayList.add("Use of These & Those");
            stringArrayList.add("Use of Shall be & Will be ");
            stringArrayList.add("Use of Has / Have / Had ");
            stringArrayList.add("Use of Will Have ");
            stringArrayList.add("Use of Had Better");
            stringArrayList.add("Use of Dare ");
            stringArrayList.add("Use of This, these, that, those ");
            stringArrayList.add("Use Capital Letters? ");
            stringArrayList.add("Use of Apostrophes ");
            stringArrayList.add("Introductory There");
            stringArrayList.add("Introductory it");
            stringArrayList.add("Guidelines for Using Capital Letters ");
            stringArrayList.add("Omission of A/An/the ");
            stringArrayList.add("Hindi-English Alphabet ");
            stringArrayList.add("Imperative, Negative and Interrogative Sentences");
            stringArrayList.add("Letters (A to Z) ");
            stringArrayList.add("Writing Names in English ");
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
                Intent i = new Intent(LearnTranslation.this, Aboutme.class);
                startActivity(i);

                return true;

            case R.id.notification:
                Intent i1 = new Intent(LearnTranslation.this, Notification.class);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(LearnTranslation.this);
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

