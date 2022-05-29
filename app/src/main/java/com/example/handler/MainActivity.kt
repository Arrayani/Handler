package com.example.handler

//import com.example.handler.ExampleHandler.TASK_A
//import com.example.handler.ExampleHandler.TASK_B
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
   // private val looperThread: ExampleLooperThread = ExampleLooperThread()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




mainHandler


       Handler(Looper.getMainLooper()).postDelayed({
           // Your Code
       }, 3000)

//       Handler(Looper.getMainLooper()).postDelayed({
//           // Your Code
//           //TODO 6
//           p2()
//           printstat = 1
//       }, 10000)

//       val mainHandler = Handler(Looper.getMainLooper()).post {
//           stat = findViewById(R.id.bpstatus)
//           mBluetoothConnectProgressDialog!!.dismiss()
//           stat.text = ""
//           stat!!.text = "Connected"
//           stat.setTextColor(Color.rgb(97, 170, 74))
//           mPrint.isEnabled = true
//           mScan.text = "Disconnect"
//       }

   }

    val mainHandler = Handler(Looper.getMainLooper()).post {
        println("Thread : uraaaa" + Thread.currentThread().name)
        val btnkoneksi = findViewById<Button>(R.id.statusBtn)
        btnkoneksi.text="connected"
    }






//    fun startThread(view: View?) {
//        looperThread.start()
//    }
//
//    fun stopThread(view: View?) {
//        looperThread.looper?.quit()
//    }
//
//    fun taskA(view: View?) {
//        val msg = Message.obtain()
//        msg.what = TASK_A
//        looperThread.handler!!.sendMessage(msg)
//
//        /*Handler threadHandler = new Handler(looperThread.looper);
//        threadHandler.post(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    Log.d(TAG, "run: " + i);
//                    SystemClock.sleep(1000);
//                }
//            }
//        });*/
//    }
//
//    fun taskB(view: View?) {
//        val msg = Message.obtain()
//        msg.what = TASK_B
//        looperThread.handler!!.sendMessage(msg)
//    }
//
//    companion object {
//        private const val TAG = "MainActivity"
//    }


}