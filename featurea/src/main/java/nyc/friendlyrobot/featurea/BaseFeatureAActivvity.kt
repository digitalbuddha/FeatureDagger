package nyc.friendlyrobot.featurea

import android.support.v7.app.AppCompatActivity

abstract class BaseFeatureAActivity : AppCompatActivity() {
    val activityComponent: FeatureAActivityComponent  by lazy {
        FeatureAInjector.create(this)
    }

    override fun getSystemService(name: String): Any? {
        return if (FeatureAInjector.matchesService(name)) {
            activityComponent
        } else super.getSystemService(name)
    }
}
