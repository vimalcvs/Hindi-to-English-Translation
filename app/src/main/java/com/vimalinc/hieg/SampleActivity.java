package com.vimalinc.hieg;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.vimalinc.hieg.topic.ContinuousTensesRules;
import com.vimalinc.hieg.topic.DialoguesConversationsSimpleTranslation;
import com.vimalinc.hieg.topic.ExercisesforPracticeTest;
import com.vimalinc.hieg.topic.GrammerRules;
import com.vimalinc.hieg.topic.IndefiniteTensesRules;
import com.vimalinc.hieg.topic.LearnTranslation;
import com.vimalinc.hieg.topic.ModalsSimpleTranslation;
import com.vimalinc.hieg.topic.PerfectContinuousTensesRules;
import com.vimalinc.hieg.topic.PerfectTensesRules;
import com.vimalinc.hieg.topic.QuestionsMakingSimpleTranslation;
import com.vimalinc.hieg.topic.TensesSimpleTranslation;
import com.vimalinc.hieg.topic.VerbHelping;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import com.vimalinc.hieg.menu.DrawerAdapter;
import com.vimalinc.hieg.menu.DrawerItem;
import com.vimalinc.hieg.menu.GridAdapter;
import com.vimalinc.hieg.menu.SimpleItem;
import com.vimalinc.hieg.menu.SpaceItem;

import java.util.ArrayList;
import java.util.Arrays;

import cameo.code.imageslider.SliderFragment;

/**
 * Created by VIMALCVS on 29.04.2019.
 */
public class SampleActivity extends AppCompatActivity implements DrawerAdapter.OnItemSelectedListener {

    private LinearLayout  linear1,linear2,linear3,linear4,linear5,linear6,linear7,linear8,linear9,linear10,linear11,linear12;

    ImageView imgLogoSplash1,imgLogoSplash2,imgLogoSplash3,imgLogoSplash4,imgLogoSplash5,
            imgLogoSplash6,imgLogoSplash7,imgLogoSplash8,imgLogoSplash9,imgLogoSplash10,
            imgLogoSplash11, imgLogoSplash12;

    public static SampleActivity activity;


    private static final int POS_HOME = 0;
    private static final int POS_ABOUT = 1;
    private static final int POS_FEEDBACK = 2;
    private static final int POS_SHAREAPP = 3;
    private static final int POS_JOINCHAT = 4;
    private static final int POS_EXIT = 6;

    private String[] screenTitles;
    private Drawable[] screenIcons;
    private static final String download_link = "https://chat.whatsapp.com/3WJbPRQyy89AKlltS56lYy";

    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4,
            linearLayout5,linearLayout6,linearLayout7,linearLayout8,linearLayout9,linearLayout10,linearLayout11,linearLayout12;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in_zoom_out_infinite);
        imgLogoSplash1.startAnimation(animation);
        imgLogoSplash2.startAnimation(animation);
        imgLogoSplash3.startAnimation(animation);
        imgLogoSplash4.startAnimation(animation);
        imgLogoSplash5.startAnimation(animation);
        imgLogoSplash6.startAnimation(animation);
        imgLogoSplash7.startAnimation(animation);
        imgLogoSplash8.startAnimation(animation);
        imgLogoSplash9.startAnimation(animation);
        imgLogoSplash10.startAnimation(animation);
        imgLogoSplash11.startAnimation(animation);
        imgLogoSplash12.startAnimation(animation);


        animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in_overshoot_2);
        linear1.startAnimation(animation);
        linear2.startAnimation(animation);
        linear3.startAnimation(animation);
        linear4.startAnimation(animation);
        linear5.startAnimation(animation);
        linear6.startAnimation(animation);
        linear7.startAnimation(animation);
        linear8.startAnimation(animation);
        linear9.startAnimation(animation);
        linear10.startAnimation(animation);
        linear11.startAnimation(animation);
        linear12.startAnimation(animation);



        linearLayout1 = (LinearLayout) findViewById(R.id.line1);
        linearLayout2 = (LinearLayout) findViewById(R.id.line2);
        linearLayout3 = (LinearLayout) findViewById(R.id.line3);
        linearLayout4 = (LinearLayout) findViewById(R.id.line4);
        linearLayout5 = (LinearLayout) findViewById(R.id.line5);
        linearLayout6 = (LinearLayout) findViewById(R.id.line6);
        linearLayout7 = (LinearLayout) findViewById(R.id.line7);
        linearLayout8 = (LinearLayout) findViewById(R.id.line8);
        linearLayout9 = (LinearLayout) findViewById(R.id.line9);
        linearLayout10 = (LinearLayout) findViewById(R.id.line10);
        linearLayout11 = (LinearLayout) findViewById(R.id.line11);
        linearLayout12 = (LinearLayout) findViewById(R.id.line12);


        linearLayout1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, LearnTranslation.class);
                startActivity(intent);
            }
        });

        linearLayout2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, GrammerRules.class);
                startActivity(intent);
            }
        });

        linearLayout3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, IndefiniteTensesRules.class);
                startActivity(intent);
            }
        });

        linearLayout4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, ContinuousTensesRules.class);
                startActivity(intent);
            }
        });


        linearLayout5 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, PerfectTensesRules.class);
                startActivity(intent);
            }
        });

        linearLayout6 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, PerfectContinuousTensesRules.class);
                startActivity(intent);
            }
        });


        linearLayout7 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, VerbHelping.class);
                startActivity(intent);
            }
        });

        linearLayout8 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, TensesSimpleTranslation.class);
                startActivity(intent);
            }
        });

        linearLayout9 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, ModalsSimpleTranslation.class);
                startActivity(intent);
            }
        });

        linearLayout10 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, QuestionsMakingSimpleTranslation.class);
                startActivity(intent);
            }
        });
        linearLayout11 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, DialoguesConversationsSimpleTranslation.class);
                startActivity(intent);
            }
        });

        linearLayout12 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SampleActivity.this, ExercisesforPracticeTest.class);
                startActivity(intent);
            }
        });


        AdView mAdView = findViewById(R.id.ad_view);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest1);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        SlidingRootNav slidingRootNav = new SlidingRootNavBuilder(this)
                .withToolbarMenuToggle(toolbar)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(false)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.menu_left_drawer)
                .inject();

        screenIcons = loadScreenIcons();
        screenTitles = loadScreenTitles();

        DrawerAdapter adapter = new DrawerAdapter(Arrays.asList(
                createItemFor(POS_HOME).setChecked(true),
                createItemFor(POS_ABOUT),
                createItemFor(POS_FEEDBACK),
                createItemFor(POS_SHAREAPP),
                createItemFor(POS_JOINCHAT),
                new SpaceItem(48),
                createItemFor(POS_EXIT)));
        adapter.setListener(this);

        RecyclerView list = findViewById(R.id.list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);
        adapter.setSelected(POS_HOME);

    }

    public void init() {
        imgLogoSplash1 = (ImageView) findViewById(R.id.imgLeft1);
        imgLogoSplash2 = (ImageView) findViewById(R.id.imgRight2);
        imgLogoSplash3 = (ImageView) findViewById(R.id.imgLeft3);
        imgLogoSplash4 = (ImageView) findViewById(R.id.imgRight4);
        imgLogoSplash5 = (ImageView) findViewById(R.id.imgLeft5);
        imgLogoSplash6 = (ImageView) findViewById(R.id.imgRight6);
        imgLogoSplash7 = (ImageView) findViewById(R.id.imgLeft7);
        imgLogoSplash8 = (ImageView) findViewById(R.id.imgRight8);
        imgLogoSplash9 = (ImageView) findViewById(R.id.imgLeft9);
        imgLogoSplash10 = (ImageView) findViewById(R.id.imgRight10);
        imgLogoSplash11 = (ImageView) findViewById(R.id.imgLeft11);
        imgLogoSplash12 = (ImageView) findViewById(R.id.imgRight12);

        linear1 = (LinearLayout) findViewById(R.id.line1);
        linear2 = (LinearLayout) findViewById(R.id.line2);
        linear3 = (LinearLayout) findViewById(R.id.line3);
        linear4 = (LinearLayout) findViewById(R.id.line4);
        linear5 = (LinearLayout) findViewById(R.id.line5);
        linear6 = (LinearLayout) findViewById(R.id.line6);
        linear7 = (LinearLayout) findViewById(R.id.line7);
        linear8 = (LinearLayout) findViewById(R.id.line8);
        linear9 = (LinearLayout) findViewById(R.id.line9);
        linear10 = (LinearLayout) findViewById(R.id.line10);
        linear11 = (LinearLayout) findViewById(R.id.line11);
        linear12 = (LinearLayout) findViewById(R.id.line12);


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
                Intent i = new Intent(SampleActivity.this, Aboutme.class);
                startActivity(i);
                return true;


            case R.id.notification:
                Intent i1 = new Intent(SampleActivity.this, Notification.class);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(SampleActivity.this);
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
    public void onItemSelected(int position) {
        if (position == POS_HOME) {

        }
        if (position == POS_ABOUT) {
            Intent i = new Intent(SampleActivity.this, Aboutme.class);
            startActivity(i);

        }
        if (position == POS_FEEDBACK) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + this.getPackageName())));
            } catch (android.content.ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=" + this.getPackageName())));
            }
        }


        if (position == POS_SHAREAPP) {
            String msg = "हिंदी से English में translate करना सीखें";
                String appUrl = "https://play.google.com/store/apps/details?id=" + getPackageName();
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, msg + "\n\nDownload the app now\n" + appUrl);
            startActivity(intent);

        }

        if (position == POS_JOINCHAT) {
            try {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_link));
                startActivity(myIntent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, "No application can handle this request."
                        + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }

        }
        if (position == POS_EXIT) {
            AlertDialog.Builder builder = new AlertDialog.Builder(SampleActivity.this);
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
        }
    }

    private DrawerItem createItemFor(int position) {
        return new SimpleItem(screenIcons[position], screenTitles[position])
                .withIconTint(color(R.color.textColorSecondary))
                .withTextTint(color(R.color.textColorPrimary))
                .withSelectedIconTint(color(R.color.colorAccent))
                .withSelectedTextTint(color(R.color.colorAccent));
    }

    private String[] loadScreenTitles() {
        return getResources().getStringArray(R.array.ld_activityScreenTitles);
    }

    private Drawable[] loadScreenIcons() {
        TypedArray ta = getResources().obtainTypedArray(R.array.ld_activityScreenIcons);
        Drawable[] icons = new Drawable[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            int id = ta.getResourceId(i, 0);
            if (id != 0) {
                icons[i] = ContextCompat.getDrawable(this, id);
            }
        }
        ta.recycle();
        return icons;
    }

    @ColorInt
    private int color(@ColorRes int res) {
        return ContextCompat.getColor(this, res);
    }



}