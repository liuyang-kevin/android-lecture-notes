package com.echoesnet.multiprocessdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AIDLService extends Service {
    private IElixirListener mElixirListener;


    IElixirAidlInterface.Stub mStub = new IElixirAidlInterface.Stub() {


        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String getVersionCode(String partOfName) throws RemoteException {
            if(mElixirListener!=null){
                mElixirListener.onChange(3389);
            }
            return "getVersionCode";
        }

        @Override
        public String getCacheData(String cmd, int owner) throws RemoteException {

            return "getCacheData";
        }

        @Override
        public String callback(String cmd, int owner) throws RemoteException {
//            if(null!=cb){
//                cb.callback("callback!!!!!");
//            }
            return "callback";
        }

        @Override
        public void registerListener(IElixirListener listener) throws RemoteException {
            mElixirListener = listener;

            mElixirListener.onChange(123);
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return mStub;
    }
}
