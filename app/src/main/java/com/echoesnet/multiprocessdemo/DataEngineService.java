package com.echoesnet.multiprocessdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DataEngineService extends Service {
    public DataEngineService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
