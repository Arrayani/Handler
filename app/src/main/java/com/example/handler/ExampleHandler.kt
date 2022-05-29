package com.example.handler

import android.os.Handler
import android.os.Message
import android.util.Log


class ExampleHandler : Handler() {
    override fun handleMessage(msg: Message) {
        when (msg.what) {
            TASK_A -> Log.d(TAG, "Task A executed")
            TASK_B -> Log.d(TAG, "Task B executed")
        }
    }

    companion object {
        private const val TAG = "ExampleHandler"
        const val TASK_A = 1
        const val TASK_B = 2
    }
}