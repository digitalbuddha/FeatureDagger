package nyc.friendlyrobot.featuredagger

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context

object Injector {

    private val ACTIVIVTY_COMPONENT = "ACTIVITY_COMPONENT"
    private val APP_COMPONENT = "APP_COMPONENT"

    @SuppressLint("WrongConstant")
    fun obtainAppComponent(context: Context): AppComponent =
            context.applicationContext.getSystemService(APP_COMPONENT) as AppComponent

    @SuppressLint("WrongConstant")
    fun obtain(context: Context): ActivityComponent {
        return context.getSystemService(ACTIVIVTY_COMPONENT) as ActivityComponent
    }

    fun matchesService(name: String): Boolean {
        return ACTIVIVTY_COMPONENT == name
    }

    fun matchesAppService(name: String): Boolean {
        return APP_COMPONENT == name
    }

    fun create(activity: Activity): ActivityComponent {
        return Injector.obtainAppComponent(activity)
                .plusActivityComponent()
    }

    fun applicationInjector(application: Application): AppComponent = DaggerAppComponent.builder().application(application).build()
}
