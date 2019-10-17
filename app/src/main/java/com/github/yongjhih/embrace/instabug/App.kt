package com.github.yongjhih.embrace.instabug

import android.app.Application
import io.embrace.android.embracesdk.Embrace

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Embrace.getInstance().start(this)
    }
}