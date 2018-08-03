package com.echoesnet.demoviewslibrary;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.util.LruCache;


/**
 * @author kevin
 */
public class LruCacheBitmapLoader {
	private static LruCacheBitmapLoader lruCacheBitmapLoader;

	/**
	 * 缓存Image的类，当存储Image的大小大于LruCache设定的值，系统自动释放内存
	 */
	private LruCache<String, Bitmap> mMemoryCache;
//    private LruCache<String, BitmapDrawable> mDrawableCache;

    public static LruCacheBitmapLoader getInstance() {
        if(lruCacheBitmapLoader == null){
            lruCacheBitmapLoader = new LruCacheBitmapLoader();
        }
        return lruCacheBitmapLoader;
    }

	public LruCacheBitmapLoader(){
		//获取系统分配给每个应用程序的最大内存，每个应用系统分配32M
		int maxMemory = (int) Runtime.getRuntime().maxMemory();
        int mCacheSize = maxMemory / 4;
        //给LruCache分配1/8 4M
		mMemoryCache = new LruCache<String, Bitmap>(mCacheSize){
            //必须重写此方法，来测量Bitmap的大小
			@Override
			protected int sizeOf(String key, Bitmap value) {
				return value.getRowBytes() * value.getHeight();
			}
		};

//        mDrawableCache = new LruCache<String, BitmapDrawable>(mCacheSize){
//            //必须重写此方法，来测量Bitmap的大小
//            @Override
//            protected int sizeOf(String key, BitmapDrawable value) {
//                return value.getBitmap().getRowBytes() * value.getBitmap().getHeight();
//            }
//        };

	}

    public void recycle(){
        mMemoryCache.evictAll();
    }

	/**
	 * 添加Bitmap到内存缓存
	 * @param key
	 * @param bitmap
	 */
	public void addBitmapToMemoryCache(String key, Bitmap bitmap) {
	    if (getBitmapFromMemCache(key) == null && bitmap != null) {  
	        mMemoryCache.put(key, bitmap);  
	    }  
	}  
	 
	/**
	 * 从内存缓存中获取一个Bitmap
	 * @param key
	 * @return
	 */
	public Bitmap getBitmapFromMemCache(String key) {
	    return mMemoryCache.get(key);  
	}





    public Bitmap getResBitmap(Context ctx , int id) {
        String key = id+"";
        Bitmap bm = getBitmapFromMemCache(key);
        if(bm == null ){
            bm=BitmapFactory.decodeResource(ctx.getResources(),id);
            addBitmapToMemoryCache(key,bm);
        }
        return bm;
    }









    private int frameDuration = 200;


    private FrameAnimCallBack callBack;

//    public void setCallBack(FrameAnimCallBack callBack) {
//        this.callBack = callBack;
//    }

    public interface FrameAnimCallBack{
        void onAnimFinished();
    }

}
