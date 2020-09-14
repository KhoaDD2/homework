package com.khoadd2.unbindable;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;

public class UnbindableService extends Service {
    final static String TAG = "MOBISEC";
    ArrayList<Messenger> mClients = new ArrayList<Messenger>();

    int mValue = 0;

    static final int MSG_REGISTER_CLIENT = 1;

    static final int MSG_UNREGISTER_CLIENT = 2;

    static final int MSG_SET_VALUE = 3;

    static final int MSG_GET_FLAG = 4;

    class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            Log.d(TAG,"handleMessage, what " + msg.what);
            switch (msg.what) {
                case MSG_REGISTER_CLIENT:
                    Log.d(TAG,"MSG_REGISTER_CLIENT");
                    mClients.add(msg.replyTo);
                    break;
                case MSG_UNREGISTER_CLIENT:
                    Log.d(TAG,"MSG_UNREGISTER_CLIENT");
                    mClients.remove(msg.replyTo);
                    break;
                case MSG_SET_VALUE:
                    Log.d(TAG,"MSG_SET_VALUE");
                    mValue = msg.arg1;
                    for (int i=mClients.size()-1; i>=0; i--) {
                        try {
                            Messenger m = mClients.get(i);
                            if (m!=null){
                                Log.d(TAG,"Send msg back to binder");
                                m.send(Message.obtain(null,
                                        MSG_SET_VALUE, mValue, 0));
                            }

                        } catch (RemoteException e) {
                            // The client is dead.  Remove it from the list;
                            // we are going through the list from back to front
                            // so this is safe to do inside the loop.
                            Log.e(TAG,"e:"+e);
                            mClients.remove(i);
                        }
                    }
                    break;
                case MSG_GET_FLAG:
                    Log.d(TAG,"MSG_GET_FLAG");
                    for (int i=mClients.size()-1; i>=0; i--)
                        try {
                            Log.d(TAG,"Send to : " + i);
                            Bundle b = new Bundle();
                            b.putString("flag", "KhoaDD2");
                            Messenger m = mClients.get(i);
                            if (m!=null){
                                Log.d(TAG,"Send msg back to binder");
                                m.send(Message.obtain(null,
                                        MSG_GET_FLAG, b));
                            } else {
                                Log.d(TAG,"Null");
                            }

                        } catch (RemoteException e) {
                            // The client is dead.  Remove it from the list;
                            // we are going through the list from back to front
                            // so this is safe to do inside the loop.
                            mClients.remove(i);
                        }
                    break;


                default:
                    super.handleMessage(msg);
            }
        }
    }

    final Messenger mMessenger = new Messenger(new IncomingHandler());

    @Override
    public void onCreate() {
        Log.d(TAG,"UnbindableService onCreate");
    }
    @Override
    public void onDestroy() {
        Log.d(TAG,"UnbindableService onDestroy");
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG,"UnbindableService onBind");
        return mMessenger.getBinder();
    }
}
