package com.echoesnet.multiprocessdemo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BaseActivity extends Activity implements ServiceConnection {
    protected IElixirAidlInterface mIMyAidlInterface;
    private IElixirListener mElixirListener = new IElixirListener.Stub() {
        @Override
        public void onChange(int x) throws RemoteException {
            Log.i(BaseActivity.this.getClass().getName(),"msg:"+x);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindService(new Intent(BaseActivity.this, AIDLService.class), this, BIND_AUTO_CREATE);
    }


    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {

        mIMyAidlInterface = IElixirAidlInterface.Stub.asInterface(service);

        try {
            mIMyAidlInterface.registerListener(mElixirListener);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {

    }



}
