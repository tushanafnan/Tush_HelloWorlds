package com.example.tush_helloworlds;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // to log life cycle callbacks messages
        Log.i("MainActivity","onCreate() is Running...");
        };

    public void openActivity (View v) {
        //current activity, target activity
        Intent intent = new Intent(MainActivity.this, SecondActivity.class );
        startActivity(intent);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart() is Running");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume() is Running...");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop() is Running");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart() is Running");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause() is Running");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy() is Running");
    }
    }
