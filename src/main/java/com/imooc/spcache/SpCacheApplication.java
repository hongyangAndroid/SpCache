package com.imooc.spcache;

import android.app.Application;
import android.util.Log;

import com.zhy.cache.SpCache;

/**
 * Created by zhy on 15/5/19.
 */
public class SpCacheApplication extends Application
{
    @Override
    public void onCreate()
    {

        super.onCreate();
        SpCache.init(this);
        Log.e("TAG", "SpCacheApplication oncreate");
    }
}
