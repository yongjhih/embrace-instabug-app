package com.github.yongjhih.embrace.instabug

import androidx.multidex.MultiDexApplication
import com.instabug.library.Instabug
import com.instabug.library.invocation.InstabugInvocationEvent
import io.embrace.android.embracesdk.Embrace

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        //Embrace.getInstance().start(this)
        Instabug.Builder(this, "5f22ae9a98bd5e8e8e35cde6d0f8bb83")
            .setInvocationEvents(InstabugInvocationEvent.SHAKE, InstabugInvocationEvent.SCREENSHOT)
            .build()
    }
}