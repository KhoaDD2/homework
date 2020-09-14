package com.example.justask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final static String TAG = "MOBISEC";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Log.d(TAG,"Hello word");
        Intent i = null;

        Log.d(TAG,"Start 1");
        i = new Intent();
        i.setComponent(new ComponentName("com.mobisec.justask","com.mobisec.justask.PartOne"));
        startActivityForResult(i,1);

        Log.d(TAG,"Start 2");
        i = new Intent();
        i.setComponent(new ComponentName("com.mobisec.justask","com.mobisec.justask.PartTwo"));
        i.setAction("com.mobisec.intent.action.JUSTASK");
        startActivityForResult(i,2);

        Log.d(TAG,"Start 3");
        i = new Intent();
        i.setComponent(new ComponentName("com.mobisec.justask","com.mobisec.justask.PartThree"));
        startActivityForResult(i,3);

        Log.d(TAG,"Start 4");
        i = new Intent();
        i.setComponent(new ComponentName("com.mobisec.justask","com.mobisec.justask.PartFour"));
        i.setAction("com.mobisec.intent.action.JUSTASKBUTNOTSOSIMPLE");
        startActivityForResult(i,4);

        Bundle bundle;



    }

    void dumbBundle(Object a){
        if(a instanceof Bundle){
            Bundle bundle = (Bundle)a;
            for (String key : bundle.keySet()) {
                Log.e(TAG, key + " : " + (bundle.get(key) != null ? bundle.get(key) : "NULL"));
                dumbBundle(bundle.get(key));
            }
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG,"onActivityResult");

        Bundle bundle = data.getExtras();
        if (bundle != null) {
            dumbBundle(bundle);
//            for (String key : bundle.keySet()) {
//                Log.e(TAG, key + " : " + (bundle.get(key) != null ? bundle.get(key) : "NULL"));
//                Bundle b = (Bundle) bundle.get(key);
//                if(b != null){
//                    for (String k : b.keySet()) {
//                        Log.e(TAG, k + " : " + (b.get(k) != null ? b.get(k) : "NULL"));
//                    }
//                }
//            }
        }
    }//onActivityResult
}