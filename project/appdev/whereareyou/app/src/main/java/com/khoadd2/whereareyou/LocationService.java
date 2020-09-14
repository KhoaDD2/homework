package com.khoadd2.whereareyou;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

public class LocationService extends Service implements LocationListener {
    final static String TAG = "MOBISEC";
    private static Location loc;
    private FusedLocationProviderClient fusedLocationClient;

    void __dumbBundle(Object a){
        if(a instanceof Bundle){
            Bundle bundle = (Bundle)a;
            for (String key : bundle.keySet()) {
                Log.e(TAG, key + " : " + (bundle.get(key) != null ? bundle.get(key) : "NULL"));
                __dumbBundle(bundle.get(key));
            }
        } else {
        }
    }
    @Override
    public void onLocationChanged(Location location) {
        Log.d(TAG,"Location :" + location);
        loc = location;
    }

    @Override
    public void onProviderDisabled(String provider) {
        Log.d("Latitude","disable");
    }

    @Override
    public void onProviderEnabled(String provider) {
        Log.d("Latitude","enable");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Log.d("Latitude","status");
    }

    private final class ServiceHandler extends Handler {
        public ServiceHandler(Looper looper) {
            super(looper);
        }
        @Override
        public void handleMessage(Message msg) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            stopSelf(msg.arg1);
        }
    }

    @Override
    public void onCreate() {
        Log.d(TAG,"LocationService onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"LocationService onStartCommand");
        Log.d(TAG,"flags : " + flags);
        Log.d(TAG,"startId : " + startId);
        __dumbBundle(intent.getExtras());

//        Location currLoc = getCurrentLocation(); // put your magic here
        if ( ContextCompat.checkSelfPermission( this, android.Manifest.permission.ACCESS_COARSE_LOCATION ) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission( this, android.Manifest.permission.ACCESS_FINE_LOCATION ) == PackageManager.PERMISSION_GRANTED) {
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
            Intent i = new Intent();
            i.setAction("com.mobisec.intent.action.LOCATION_ANNOUNCEMENT");
            Log.i(TAG,"loc :" + loc);
            i.putExtra("location", loc);
            sendBroadcast(i);
        }
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG,"LocationService onBind");
        __dumbBundle(intent.getExtras());
        return null;
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,"LocationService onDestroy");
    }

}
