package com.example.hp.sharedprefrances;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    private static final String PREFS_FILE = "com.example.hp.SharedPrefrances";

    private static final String email = "keyE_mail";

    private static final String password = "key";


    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sharedPreferences =getSharedPreferences("PREFS_FILE", Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
        String sharedEmail=sharedPreferences.getString("keyE_mail",null);
        String sharedPass=sharedPreferences.getString("key",null);
        TextView txtpass =(TextView) findViewById(R.id.pass);
        TextView txtmail =(TextView) findViewById(R.id.email);
       txtpass.setText(sharedPass);
        txtmail.setText(sharedEmail);
    }
}
