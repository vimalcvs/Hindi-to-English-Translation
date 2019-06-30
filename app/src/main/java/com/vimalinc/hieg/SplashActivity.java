package com.vimalinc.hieg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.vimalinc.hieg.utils.GetSetSharedPrefs;


public class SplashActivity extends AppCompatActivity {

    TextView txtDigital, txtSplashTitle;
    LinearLayout linMain;

    ImageView imgLogoSplash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_splash);
        init();

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in_overshoot);
        imgLogoSplash.startAnimation(animation);

        animation = AnimationUtils.loadAnimation(this, R.anim.fade_in_slow);
        txtSplashTitle.startAnimation(animation);

        GetSetSharedPrefs prefs = new GetSetSharedPrefs(this, "Device");
        Log.v("DeviceId", prefs.getData("DeviceId"));
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                synchronized (this) {
                    try {
                        wait(3200);
                        Intent intent = new Intent(SplashActivity.this, SampleActivity.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }

                }
            }
        };
        thread.start();

    }

    public void init() {
        txtSplashTitle = (TextView) findViewById(R.id.txtSplashTitle);
        imgLogoSplash = (ImageView) findViewById(R.id.imgLogoSplash);
        linMain = (LinearLayout) findViewById(R.id.linMain);

    }


}
