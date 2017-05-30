package com.example.user.vrtest;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MediaActionBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("TreasureHuntActivity", "MediaActionBroadcastReceiver!!!! _ headphonesBR ");
        context.sendBroadcast(new Intent(TreasureHuntActivity.BROADCAST_MEDIA_ACTION));
    }
}
