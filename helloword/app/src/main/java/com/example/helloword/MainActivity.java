package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MOBISEC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Hello");
        try{
            URL url = new URL("http://10.0.2.2:31337/flag");
            new httpTask().execute(url);
        } catch (Exception e){
            Log.e(TAG,"e1 : " + e);
        };
    }

    private class httpTask extends AsyncTask<URL, Integer, String> {
        protected String doInBackground(URL... urls) {
            try{
                HttpURLConnection urlConnection = (HttpURLConnection) urls[0].openConnection();

                try {
//                    InputStream in = new
//                            BufferedInputStream(urlConnection.getInputStream());
//                    String result = new BufferedReader(new InputStreamReader(in))
//                            .lines().collect(Collectors.joining("\n"));
//                    Log.i(TAG,"Data : " + result);
                    urlConnection.setRequestMethod("POST");
                    OutputStream out = new BufferedOutputStream(urlConnection.getOutputStream());

                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
                    writer.write("answer=9&val1=3&oper=%2B&val2=6");
                    writer.flush();
                    writer.close();
                    out.close();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    String data = "";
                    while (true) {
                        String readLine = reader.readLine();
                        String line = readLine;
                        if (readLine == null){
                            Log.i(TAG,"data : " + data);
                            break;
                        }
                        data = data + line + "\n";
                    }

                    urlConnection.connect();
                } finally {
                    urlConnection.disconnect();
                }

            }catch (Exception e){
                Log.e(TAG,"e2 : " + e);
            }
            return "";
        }

        protected void onProgressUpdate(Integer... progress) {
        }

        protected void onPostExecute(Long result) {
        }
    }
}


