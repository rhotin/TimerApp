package com.rhappdeveloper.timerapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.rhappdeveloper.timerapp.util.PrefUtil
import java.lang.UnsupportedOperationException

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        //Todo: show notification

        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}