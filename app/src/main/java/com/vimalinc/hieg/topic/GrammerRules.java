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
import com.vimalinc.hieg.webview.Webview2;
import com.vimalinc.hieg.fragment.GrammerAdapter;

import java.util.ArrayList;

public class GrammerRules extends AppCompatActivity {
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
        GrammerAdapter adapter = new GrammerAdapter(this, R.layout.item_listview, stringArrayList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(1)");
                    String message = "Noun - संज्ञा";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 1) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(2)");
                    String message = "Pronoun - सर्वनाम";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 2) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(3)");
                    String message = "Verb - क्रिया";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 3) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(4)");
                    String message = "Adjective - विशेषण";
                    i.putExtra("key", message);
                    startActivity(i);


                }
                if (position == 4) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(5)");
                    String message = "Adverb - क्रिया-विशेषण";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 5) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(6)");
                    String message = "Preposition - पूर्वसर्ग";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 6) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(7)");
                    String message = "Preposition List - पूर्वसर्ग सुची";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 7) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(8)");
                    String message = "Conjunctions - समुच्चयबोधक";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 8) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Rules/English.html?id=(9)");
                    String message = "Interjection - विस्मयादिबोधक ";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 9) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 3.html");
                    String message = "Is/Am/Are (है/हूँ/हो) Rules";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 10) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 4.html");
                    String message = "Was/Were (था/थी/थे) Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 11) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 56.html");
                    String message = "Persent Tense Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 12) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 57.html");
                    String message = "Past Tense Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 13) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi English 58.html");
                    String message = "Future Tense Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 14) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(1)");
                    String message = "May Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }























                if (position == 15) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(2)");
                    String message = "Might Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 16) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(3)");
                    String message = "May have / Might have Rules";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 17) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(4)");
                    String message = "Can Rules";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 18) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(5)");
                    String message = "Could Rules";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 19) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(6)");
                    String message = "Will be able to Rules";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 20) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(7)");
                    String message = "Shall/Will Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 21) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(8)");
                    String message = "Should And Ought To Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 22) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(9)");
                    String message = "Would Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 23) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(10)");
                    String message = "Must Rules";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 24) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(11)");
                    String message = "Need Rules";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 25) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(12)");
                    String message = "Dare Rules";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 26) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/modals rules/English.html?id=(13)");
                    String message = "Have/Has Rules";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 27) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(1)");
                    String message = "Passive Voice of Present Indefinite Tense Rule";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 28) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(2)");
                    String message = "Passive Voice of Present Continuous Tense Rule";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 29) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(3)");
                    String message = "Passive Voice of Present Perfect Tense Rule";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 30) {
                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(4)");
                    String message = "Passive Voice of Past Indefinite Tense Rule";
                    i.putExtra("key", message);
                    startActivity(i);
                }if (position == 31) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(5)");
                    String message = "Passive Voice of Past Continuous Tense Rule";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 32) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(6)");
                    String message = "Passive Voice of Past Perfect Tense Rule";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 33) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(7)");
                    String message = "Passive Voice of Future Indefinite Tense Rule";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 34) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(8)");
                    String message = "Passive Voice of Future Perfect Tense Rule";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 35) {

                    Intent i = new Intent(GrammerRules.this, Webview2.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/active Passive/English.html?id=(9)");
                    String message = "Passive Voice of W-Family Sentence";
                    i.putExtra("key", message);
                    startActivity(i);

                }


            }
        });
    }

        private void setData() {
            stringArrayList = new ArrayList<>();
            stringArrayList.add("Noun - संज्ञा");
            stringArrayList.add("Pronoun - सर्वनाम");
            stringArrayList.add("Verb - क्रिया");
            stringArrayList.add("Adjective - विशेषण");
            stringArrayList.add("Adverb - क्रिया-विशेषण");
            stringArrayList.add("Preposition - पूर्वसर्ग");
            stringArrayList.add("Preposition List - पूर्वसर्ग सुची");
            stringArrayList.add("Conjunctions - समुच्चयबोधक");
            stringArrayList.add("Interjection - विस्मयादिबोधक ");
            stringArrayList.add("Is/Am/Are (है/हूँ/हो) Rules");
            stringArrayList.add("Was/Were (था/थी/थे) Rules");
            stringArrayList.add("Persent Tense Rules");
            stringArrayList.add("Past Tense Rules");
            stringArrayList.add("Future Tense Rules");
            stringArrayList.add("May Rules");



            stringArrayList.add("Might Rules");
            stringArrayList.add("May have / Might have Rules");
            stringArrayList.add("Can Rules");
            stringArrayList.add("Could Rules");
            stringArrayList.add("Will be able to Rules");
            stringArrayList.add("Shall/Will Rules");
            stringArrayList.add("Should And Ought To Rules");
            stringArrayList.add("Would Rules");
            stringArrayList.add("Must Rules");
            stringArrayList.add("Need Rules");
            stringArrayList.add("Dare Rules");
            stringArrayList.add("Have/Has Rules");
            stringArrayList.add("Passive Voice of Present Indefinite Tense Rule");
            stringArrayList.add("Passive Voice of Present Continuous Tense Rule");
            stringArrayList.add("Passive Voice of Present Perfect Tense Rule");
            stringArrayList.add("Passive Voice of Past Indefinite Tense Rule");
            stringArrayList.add("Passive Voice of Past Continuous Tense Rule");
            stringArrayList.add("Passive Voice of Past Perfect Tense Rule");
            stringArrayList.add("Passive Voice of Future Indefinite Tense Rule");
            stringArrayList.add("Passive Voice of Future Perfect Tense Rule");
            stringArrayList.add("Passive Voice of W-Family Sentence");

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
                Intent i = new Intent(GrammerRules.this, Aboutme.class);
                startActivity(i);

                return true;

            case R.id.notification:
                Intent i1 = new Intent(GrammerRules.this, Notification.class);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(GrammerRules.this);
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

