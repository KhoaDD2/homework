package com.khoadd2.unbindable_binder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final static String TAG="MOBISEC";
    Handler mHandler = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = (Button)findViewById(R.id.button);
        mHandler = new IncomingHandler();
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regist();
                get_flag();
            }
        });
    }
    /** Messenger for communicating with the service. */
    Messenger mService = null;

    /** Flag indicating whether we have called bind on the service. */
    boolean bound;

    /**
     * Class for interacting with the main interface of the service.
     */
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            // This is called when the connection with the service has been
            // established, giving us the object we can use to
            // interact with the service.  We are communicating with the
            // service using a Messenger, so here we get a client-side
            // representation of that from the raw IBinder object.
            Log.d(TAG,"onServiceConnected");
            mService = new Messenger(service);
            bound = true;

            regist();
            get_flag();
        }

        public void onServiceDisconnected(ComponentName className) {
            // This is called when the connection with the service has been
            // unexpectedly disconnected -- that is, its process crashed.
            Log.d(TAG,"onServiceDisconnected");
            mService = null;
            bound = false;
        }
    };

    public void regist() {
        if (!bound) return;
        // Create and send a message to the service, using a supported 'what' value
        Message msg = Message.obtain(null, 1, 0, 0);
        msg.replyTo= new Messenger(mHandler);
        try {
            Log.d(TAG,"Send msg");
            mService.send(msg);
        } catch (RemoteException e) {
            Log.e(TAG,"e:" + e);
            e.printStackTrace();
        }
    }
    class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            Log.d(TAG,"handleMessage, what " + msg.what);
            Bundle b = (Bundle) msg.obj;
            if(b!=null){
                Log.d(TAG,"Key_set size : " + b.keySet().size());
                for (String key : b.keySet()) {
                    Log.d(TAG, key + " : " + (b.get(key) != null ? b.get(key) : "NULL"));
                }
            } else {
                Log.e(TAG,"Bundle is null");
            }
        }
    }
    public void get_flag() {
        if (!bound) return;
        // Create and send a message to the service, using a supported 'what' value
        Message msg = Message.obtain(null, 4, 0, 0);

        try {
            mService.send(msg);
        } catch (RemoteException e) {
            Log.e(TAG,"e:" + e);
            e.printStackTrace();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Bind to the service
        Intent i = new Intent();
        i.setComponent(new ComponentName("com.mobisec.unbindable","com.mobisec.unbindable.UnbindableService"));
        bindService(i, mConnection,
                Context.BIND_AUTO_CREATE);

    }

    @Override
    protected void onStop() {
        super.onStop();
        // Unbind from the service
        if (bound) {
            unbindService(mConnection);
            bound = false;
        }
    }
}
