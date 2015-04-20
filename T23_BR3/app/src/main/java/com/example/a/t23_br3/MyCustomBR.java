package com.example.a.t23_br3;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by a on 2015-04-20.
 */
public class MyCustomBR extends BroadcastReceiver {
    NotificationManager manager;

    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(context, "BroadCast Receiver!!", Toast.LENGTH_LONG).show();
        manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }
}
