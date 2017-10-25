package com.example.benjaminkiene.dijoncenterbk;

import android.os.BatteryManager;
import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;


/**
 * Created by Benjamin KIENE on 25/10/2017.
 */

public class BroadcastActivity extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast toast = Toast.makeText(context, "Batterie faible", Toast.LENGTH_SHORT);
        toast.show();
    }
}
