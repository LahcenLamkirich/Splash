package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Animation first, seconde ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LottieAnimationView lottieAnimationView;
        TextView enset, glsid ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*The App bar issus */
        ActionBar action = getSupportActionBar();
        action.hide();

        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
        );

        first = AnimationUtils.loadAnimation(this, R.anim.animation);
        seconde = AnimationUtils.loadAnimation(this, R.anim.secondanimation);
        lottieAnimationView = findViewById(R.id.lottie_layer_name);
        enset = findViewById(R.id.enset);
        glsid = findViewById(R.id.glsid);
        lottieAnimationView.setAnimation(first);
        enset.setAnimation(seconde);
        glsid.setAnimation(seconde);
        new Timer().schedule(new TimerTask(){
            public void run() {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        }, 4005);

    }


}
