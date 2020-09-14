package com.khoadd2.filehasher;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileHasher extends AppCompatActivity {
    final static String TAG = "MOBISEC";
    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    public String sha256(String s) {
        try {
            // Create MD5 Hash
            Log.d(TAG,"s: " + s);
            Log.d(TAG,"s's length: " + s.getBytes().length);
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA256");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            return bytesToHex(messageDigest);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uri = getIntent().getData();
        Log.d(TAG,"uri : " + uri);
        File file = new File(uri.getPath());
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            line = br.readLine();
            br.close();
            Log.d(TAG,"Text : " + line);
            String hash = sha256(line);
            Log.d(TAG,"Hash : " + hash);
            Intent resultIntent = new Intent();
            resultIntent.putExtra("hash", hash);
            setResult(Activity.RESULT_OK, resultIntent);
            finish();
        }
        catch (IOException e) {
            Log.e(TAG,"E:"+e);
        }
    }
}