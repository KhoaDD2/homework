package com.mobisec.pincode;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.p000v4.internal.view.SupportMenu;
import android.support.p000v4.view.ViewCompat;
import android.support.p003v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    TextView mResultWidget = null;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0267R.layout.activity_main);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        final EditText pinWidget = (EditText) findViewById(C0267R.C0269id.pincode);
        final TextView resultWidget = (TextView) findViewById(C0267R.C0269id.result);
        this.mResultWidget = resultWidget;
        pinWidget.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.this.mResultWidget.setText(BuildConfig.FLAVOR);
            }

            public void afterTextChanged(Editable s) {
            }
        });
        ((Button) findViewById(C0267R.C0269id.checkpin)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String pin = pinWidget.getText().toString();
                resultWidget.setText("Checking PIN....");
                resultWidget.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                String flag = null;
                String exception = null;
                if (!PinChecker.checkPin(MainActivity.this, pin)) {
                    resultWidget.setText("PIN is not valid.");
                    resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                    return;
                }
                try {
                    flag = MainActivity.this.getFlag(pin);
                } catch (Exception e) {
                    exception = e.getMessage();
                }
                if (exception != null) {
                    resultWidget.setText("PIN was valid, but there was an exception getting the flag...");
                    resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                } else if (flag != null) {
                    TextView textView = resultWidget;
                    textView.setText("PIN was valid! Here is the message from the server: " + flag);
                    if (flag.startsWith("FLAG")) {
                        resultWidget.setTextColor(-16737536);
                    } else {
                        resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                    }
                } else {
                    TextView textView2 = resultWidget;
                    textView2.setText("PIN was valid, but something went wrong. Exception: " + exception);
                    resultWidget.setTextColor(SupportMenu.CATEGORY_MASK);
                }
            }
        });
    }

    public String getFlag(String pin) {
        try {
            return getUrlContent("https://challs.reyammer.io/pincode/" + pin);
        } catch (FileNotFoundException e) {
            return "Too many requests, slow down. You can do at most 10 requests per minute.";
        } catch (Exception e2) {
            String ans = "Exception: " + Log.getStackTraceString(e2);
            Log.e("MOBISEC", "Exception: " + Log.getStackTraceString(e2));
            return ans;
        }
    }

    public static String getUrlContent(String sUrl) throws Exception {
        HttpURLConnection connection = (HttpURLConnection) new URL(sUrl).openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String content = BuildConfig.FLAVOR;
        while (true) {
            String readLine = rd.readLine();
            String line = readLine;
            if (readLine == null) {
                return content;
            }
            content = content + line + "\n";
        }
    }
}
