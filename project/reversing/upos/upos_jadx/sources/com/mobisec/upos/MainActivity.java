package com.mobisec.upos;

import android.os.Bundle;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static boolean g1 = false;
    public static boolean g2 = false;
    public static boolean g3 = false;
    public static boolean g4 = false;
    TextView mResultWidget = null;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        Activity.initActivity(this);
        final EditText flagWidget = (EditText) findViewById(R.id.flag);
        final TextView resultWidget = (TextView) findViewById(R.id.result);
        this.mResultWidget = resultWidget;
        flagWidget.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.this.mResultWidget.setText(BuildConfig.FLAVOR);
            }

            public void afterTextChanged(Editable s) {
            }
        });
        ((Button) findViewById(R.id.check)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String flag = flagWidget.getText().toString();
                resultWidget.setText("Checking flag....");
                resultWidget.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                boolean result = false;
                try {
                    result = FC.checkFlag(MainActivity.this, flag);
                    Log.e("MOBISEC", "Flag result: " + result);
                } catch (Exception e) {
                    Log.e("MOBISEC", "Exception while checking flags:" + Log.getStackTraceString(e));
                }
                if (MainActivity.g1) {
                    resultWidget.setText("Debugger detected. ;-) Goodbye.");
                    resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                    Log.e("MOBISEC", "1");
                } else if (MainActivity.g2) {
                    resultWidget.setText("Frida detected. ;-) Goodbye.");
                    resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                    Log.e("MOBISEC", "2");
                } else if (MainActivity.g3) {
                    resultWidget.setText("Could not find Google Play Store app. is this a rooted device? ;-) Goodbye.");
                    resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                    Log.e("MOBISEC", "3");
                } else if (MainActivity.g4) {
                    resultWidget.setText("The app appears to be modified. I do not run stuff I didn't sign. Goodbye.");
                    resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                    Log.e("MOBISEC", "4");
                } else if (result) {
                    resultWidget.setText("Flag is valid!");
                    resultWidget.setTextColor(-16737536);
                    Log.e("MOBISEC", "v");
                } else {
                    resultWidget.setText("Flag is not valid");
                    resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                    Log.e("MOBISEC", "nv");
                }
            }
        });
    }
}
