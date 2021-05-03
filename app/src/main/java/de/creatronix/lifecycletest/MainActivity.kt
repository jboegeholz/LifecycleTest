package de.creatronix.lifecycletest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LifecycleTest", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifecycleTest", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifecycleTest", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifecycleTest", "onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LifecycleTest", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d("LifecycleTest", "onSaveInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifecycleTest", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifecycleTest", "onDestroy")
    }
}