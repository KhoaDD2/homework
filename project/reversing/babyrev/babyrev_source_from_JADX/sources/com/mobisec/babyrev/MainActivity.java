package com.mobisec.babyrev;

import android.os.Bundle;
import android.support.p000v7.app.AppCompatActivity;
import android.support.p001v4.internal.view.SupportMenu;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mResultWidget = null;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0055R.layout.activity_main);
        final EditText flagWidget = (EditText) findViewById(C0055R.C0057id.flag);
        final TextView resultWidget = (TextView) findViewById(C0055R.C0057id.result);
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
        ((Button) findViewById(C0055R.C0057id.checkflag)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color;
                String msg;
                if (FlagChecker.checkFlag(MainActivity.this, flagWidget.getText().toString())) {
                    msg = "Valid flag!";
                    color = -16737536;
                } else {
                    msg = "Invalid flag";
                    color = SupportMenu.CATEGORY_MASK;
                }
                resultWidget.setText(msg);
                resultWidget.setTextColor(color);
            }
        });
    }
}