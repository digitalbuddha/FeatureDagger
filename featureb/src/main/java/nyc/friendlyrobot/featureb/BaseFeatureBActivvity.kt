package nyc.friendlyrobot.featureb

import android.support.v7.app.AppCompatActivity

abstract class BaseFeatureBActivity : AppCompatActivity() {
    val activityComponent: FeatureBActivityComponent  by lazy {
        FeatureBInjector.create(this)
    }

    override fun getSystemService(name: String): Any? {
        return if (FeatureBInjector.matchesService(name)) {
            activityComponent
        } else super.getSystemService(name)
    }
}
