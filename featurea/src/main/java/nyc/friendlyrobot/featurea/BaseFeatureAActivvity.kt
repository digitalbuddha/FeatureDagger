package nyc.friendlyrobot.featurea

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val activityComponent: FeatureAActivityComponent  by lazy {
        FeatureInjector.create(this)
    }

    override fun getSystemService(name: String): Any? {
        return if (FeatureInjector.matchesService(name)) {
            activityComponent
        } else super.getSystemService(name)
    }
}
