package com.mobisec.serialintent;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class SerialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("MOBISEC", "shuffling");
//        FlagShuffler fs = new FlagShuffler();
//        FlagContainer fc = fs.shuffleFlag(MainActivity.flag);
        String[] parts = {"123","KhoaDD2"};
        ArrayList<Integer> perm = new ArrayList<Integer>();
        perm.add(1);perm.add(2);perm.add(3);
        FlagContainer fc = new FlagContainer(parts,perm);
        Log.e("MOBISEC", "sending back intent");
        Intent resultIntent = new Intent();
        resultIntent.putExtra("flag", fc);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }

}
