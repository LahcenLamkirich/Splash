package com.example.splash;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView usernamePlace, passwordPlace, txt1, txt2;
    Button btnBack ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ActionBar action = getSupportActionBar();
        action.hide();

        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
        );

        usernamePlace = findViewById(R.id.userPlace);
        passwordPlace = findViewById(R.id.passwPlace);
        txt1 = findViewById(R.id.txt1);
        txt2= findViewById(R.id.txt2);
        txt1.setPaintFlags(txt1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txt2.setPaintFlags(txt2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        Bundle b = getIntent().getExtras();
        String username = b.getString("username");
        String password = b.getString("password");

        usernamePlace.setText(username);
        passwordPlace.setText(password);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
