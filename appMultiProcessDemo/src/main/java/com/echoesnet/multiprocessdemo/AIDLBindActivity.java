package com.echoesnet.multiprocessdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AIDLBindActivity extends BaseActivity {
    private Button mBtnAidl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aidl_bind);
        mBtnAidl = (Button) findViewById(R.id.button2);

        bindService(new Intent(AIDLBindActivity.this, AIDLService.class), this, BIND_AUTO_CREATE);

        mBtnAidl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIMyAidlInterface != null){
                    try {
                        String name = mIMyAidlInterface.getVersionCode("I'm nick");
                        Toast.makeText(AIDLBindActivity.this, "name = " + name, Toast.LENGTH_SHORT).show();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        });




    }




}
