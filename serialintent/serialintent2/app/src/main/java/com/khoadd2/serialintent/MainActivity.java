package com.khoadd2.serialintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import com.mobisec.serialintent.FlagContainer;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final static String TAG="MOBISEC";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent();
        i.setComponent(new ComponentName("com.mobisec.serialintent","com.mobisec.serialintent.SerialActivity"));
        startActivityForResult(i,0);
    }
    private com.mobisec.serialintent.FlagContainer en;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG,"onActivityResult");

        Bundle b = data.getExtras();
        FlagContainer f = (FlagContainer)b.getSerializable("flag");
        Log.d(TAG,"F:" + f);
        Log.d(TAG,"F:" + f.getFlag());
    }
}