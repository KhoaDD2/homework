package com.example.helloword;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class PartOne extends AppCompatActivity {
    private static String TAG = "MOBISEC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"PartOne is on create");
    }
}