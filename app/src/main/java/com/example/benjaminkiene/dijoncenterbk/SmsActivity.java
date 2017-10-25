package com.example.benjaminkiene.dijoncenterbk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Benjamin KIENE on 25/10/2017.
 */
public class SmsActivity extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "SMS !!", Toast.LENGTH_SHORT).show();
    }
}