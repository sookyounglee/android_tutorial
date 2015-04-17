package com.example.a.t19_service3;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by a on 2015-04-17.
 */
public class MyIntentService extends IntentService{
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.d("MyIntentService", "onHandleIntent called");
    }
}
