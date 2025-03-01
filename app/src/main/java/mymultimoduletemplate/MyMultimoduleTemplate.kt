package mymultimoduletemplate

import android.app.Application
import mymultimoduletemplate.core.injection.modules.core.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class MyMultimoduleTemplate : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyMultimoduleTemplate)
            modules(dataModule)
        }
    }
}
