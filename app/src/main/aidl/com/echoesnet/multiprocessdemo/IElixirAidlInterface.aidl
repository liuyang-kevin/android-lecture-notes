// IElixirAidlInterface.aidl
package com.echoesnet.multiprocessdemo;

// Declare any non-default types here with import statements

import com.echoesnet.multiprocessdemo.IElixirListener;
interface IElixirAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString);


    String getVersionCode(String partOfName);

    String getCacheData(String cmd, int owner);

    String callback(String cmd, int owner);


    void registerListener(in IElixirListener listener);

}
