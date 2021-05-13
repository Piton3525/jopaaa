package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.graphics.Typeface;
import android.widget.TextView;

public class SplashScreen extends Activity {
    TextView customFontText;
    Typeface typeFace;

    private final int SPLASH_DISPLAY_LENGHT = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        typeFace = Typeface.createFromAsset(getAssets(), "fonts/AeroviasBrasilNF.ttf");
        customFontText=(TextView) findViewById(R.id.textView);
        customFontText.setTypeface(typeFace);

        customFontText=(TextView) findViewById(R.id.textView2);
        customFontText.setTypeface(typeFace);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        },SPLASH_DISPLAY_LENGHT);
        }

        @Override
    public  void onBackPressed(){
        super.onBackPressed();
        }
    }

