package nyc.friendlyrobot.featurea

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context

object FeatureInjector {

    private val ACTIVIVTY_COMPONENT = "FeatureAActivityComponent"
    private val APP_COMPONENT = "FeatureAComponent"

    @SuppressLint("WrongConstant")
    fun obtainFeatureComponent(context: Context): FeatureAComponent =
            context.applicationContext.getSystemService(APP_COMPONENT) as FeatureAComponent

    @SuppressLint("WrongConstant")
    fun obtain(context: Context): FeatureAActivityComponent {
        return context.getSystemService(ACTIVIVTY_COMPONENT) as FeatureAActivityComponent
    }

    fun matchesService(name: String): Boolean {
        return ACTIVIVTY_COMPONENT == name
    }

    fun matchesAppService(name: String): Boolean {
        return APP_COMPONENT == name
    }

    fun create(activity: Activity): FeatureAActivityComponent {
        return FeatureInjector.obtainFeatureComponent(activity)
                .plusFeatureAActivityComponent()
    }
}