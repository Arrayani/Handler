package com.example.handler

import android.os.Handler
import android.os.Looper
import android.util.Log


class ExampleLooperThread : Thread() {
    var looper: Looper? = null
    var handler: Handler? = null
    override fun run() {
        Looper.prepare()
        looper = Looper.myLooper()
        handler = ExampleHandler()
        Looper.loop()
        Log.d(TAG, "End of run()")
    }

    companion object {
        private const val TAG = "ExampleLooperThread"
    }
}