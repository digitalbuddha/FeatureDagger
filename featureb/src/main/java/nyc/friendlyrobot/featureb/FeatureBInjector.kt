package nyc.friendlyrobot.featurea

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context

object FeatureBInjector {

    private val ACTIVIVTY_COMPONENT = "FeatureBActivityComponent"
    private val APP_COMPONENT = "FeatureBComponent"

    @SuppressLint("WrongConstant")
    fun obtainFeatureComponent(context: Context): FeatureBComponent =
            context.applicationContext.getSystemService(APP_COMPONENT) as FeatureBComponent

    @SuppressLint("WrongConstant")
    fun obtain(context: Context): FeatureBActivityComponent {
        return context.getSystemService(ACTIVIVTY_COMPONENT) as FeatureBActivityComponent
    }

    fun matchesService(name: String): Boolean {
        return ACTIVIVTY_COMPONENT == name
    }

    fun matchesAppService(name: String): Boolean {
        return APP_COMPONENT == name
    }

    fun create(activity: Activity): FeatureBActivityComponent {
        return FeatureBInjector.obtainFeatureComponent(activity)
                .plusFeatureBActivityComponent()
    }
}