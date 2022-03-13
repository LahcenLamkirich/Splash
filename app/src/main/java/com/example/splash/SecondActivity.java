package com.example.splash;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    Button btnSend ;
    EditText username, password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*The App Bar */
        ActionBar action = getSupportActionBar();
        action.hide();
        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
        );

        btnSend = findViewById(R.id.btnSend);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                Bundle b = new Bundle();
                b.putString("username", username.getText().toString());
                b.putString("password", password.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}
