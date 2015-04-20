package com.example.a.t23_br3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by a on 2015-04-20.
 */
public class MyCustomBR extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "BroadCast Receiver!!", Toast.LENGTH_LONG).show();
    }
}
