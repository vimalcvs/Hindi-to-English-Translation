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
import com.vimalinc.hieg.webview.Webview11;
import com.vimalinc.hieg.fragment.DialoguesConversationsSimpleTranslationAdapter;

import java.util.ArrayList;

public class DialoguesConversationsSimpleTranslation extends AppCompatActivity {
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
        DialoguesConversationsSimpleTranslationAdapter adapter = new DialoguesConversationsSimpleTranslationAdapter(this, R.layout.item_listview, stringArrayList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Translate 1.html");
                    String message = "Greetings and Introductions";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 1) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 7.html");
                    String message = "Do You Speak English ? (क्या आप अंग्रेजी बोलते/बोलती है? कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 2) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 6.html");
                    String message = "Ask Directions (दिशाएँ पूछना कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 3) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 2.html");
                    String message = "A New Student And The Teacher (एक नए छात्र और शिक्षक कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 4) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 3.html");
                    String message = "An Uncle And A Boy (पुरुषों और लड़के कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 5) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 4.html");
                    String message = "Conversation At A Clinic (एक क्लीनिक में वार्तालाप कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 6) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 8.html");
                    String message = "Do You Want Something to Drink? (क्या आप कुछ पीना चाहते ? कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 7) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 9.html");
                    String message = "Choosing a time to meet (मिलने के लिए समय चुनना कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }





                if (position == 8) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 10.html");
                    String message = "When do you want to go ? (आप कब जाना चाहते/चाहती है? कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 9) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 11.html");
                    String message = "Ordering food (खाना माँगना बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 10) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 12.html");
                    String message = "Do you have enough money? (क्या आप के पास काफ़ी पैसे हैं? कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 11) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 13.html");
                    String message = "How are you ? (आप कैसे/कैसी है? कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 12) {
                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 14.html");
                    String message = "Introducing a friend (एक दोस्त का परिचय करना  कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 13) {
                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 15.html");
                    String message = "Buying a shirt (कमीज़ खरीदना  कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 14) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 16.html");
                    String message = "Ask about the place (जगह के बारें में पूछना कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }

                if (position == 15) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 17.html");
                    String message = "Who is that woman? (वह औरत कौन है? कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }


                if (position == 16) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 18.html");
                    String message = "Market is Close (बाज़ार बंद है कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 17) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 19.html");
                    String message = "General Questions (सामान्य सवाल कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 18) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 20.html");
                    String message = "I lost my wallet (मैंने अपना बटुआ खो दिया कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);

                }
                if (position == 19) {

                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 21.html");
                    String message = "Phone in the office (दफ़्तर में फ़ोन कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);

                }

                if (position == 20) {
                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 22.html");
                    String message = "Family trip (परिवार के साथ सफ़र कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }
                if (position == 21) {
                    Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Webview11.class);
                    i.putExtra("keyHTML", "file:///android_asset/www/Hindi 23.html");
                    String message = "I went shopping (मैंने खरीददारी की कि बातचीत)";
                    i.putExtra("key", message);
                    startActivity(i);
                }



            }
        });
    }

    private void setData() {
        stringArrayList = new ArrayList<>();
        stringArrayList.add("Greetings and Introductions");
        stringArrayList.add("Do You Speak English ? (क्या आप अंग्रेजी बोलते/बोलती है? कि बातचीत)");
        stringArrayList.add("Ask Directions (दिशाएँ पूछना कि बातचीत)");
        stringArrayList.add("A New Student And The Teacher (एक नए छात्र और शिक्षक कि बातचीत)");
        stringArrayList.add("An Uncle And A Boy (पुरुषों और लड़के कि बातचीत)");
        stringArrayList.add("Conversation At A Clinic (एक क्लीनिक में वार्तालाप कि बातचीत)");
        stringArrayList.add("Do You Want Something to Drink? (क्या आप कुछ पीना चाहते ? कि बातचीत)");
        stringArrayList.add("Choosing a time to meet (मिलने के लिए समय चुनना कि बातचीत)");
        stringArrayList.add("When do you want to go ? (आप कब जाना चाहते/चाहती है? कि बातचीत)");
        stringArrayList.add("Ordering food (खाना माँगना बातचीत)");
        stringArrayList.add("Do you have enough money? (क्या आप के पास काफ़ी पैसे हैं? कि बातचीत)");
        stringArrayList.add("How are you ? (आप कैसे/कैसी है? कि बातचीत)");
        stringArrayList.add("Introducing a friend (एक दोस्त का परिचय करना  कि बातचीत)");
        stringArrayList.add("Buying a shirt (कमीज़ खरीदना  कि बातचीत)");
        stringArrayList.add("Ask about the place (जगह के बारें में पूछना कि बातचीत)");
        stringArrayList.add("Who is that woman? (वह औरत कौन है? कि बातचीत)");
        stringArrayList.add("Market is Close (बाज़ार बंद है कि बातचीत)");
        stringArrayList.add("General Questions (सामान्य सवाल कि बातचीत)");
        stringArrayList.add("I lost my wallet (मैंने अपना बटुआ खो दिया कि बातचीत)");
        stringArrayList.add("Phone in the office (दफ़्तर में फ़ोन कि बातचीत)");
        stringArrayList.add("Family trip (परिवार के साथ सफ़र कि बातचीत)");
        stringArrayList.add("I went shopping (मैंने खरीददारी की कि बातचीत)");
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
                Intent i = new Intent(DialoguesConversationsSimpleTranslation.this, Aboutme.class);
                startActivity(i);

                return true;

            case R.id.notification:
                Intent i1 = new Intent(DialoguesConversationsSimpleTranslation.this, Notification.class);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(DialoguesConversationsSimpleTranslation.this);
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

