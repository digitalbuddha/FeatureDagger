package nyc.friendlyrobot.featuredagger

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val activityComponent: ActivityComponent  by lazy {
        Injector.create(this)
    }

    override fun getSystemService(name: String): Any? {
        return if (Injector.matchesService(name)) {
            activityComponent
        } else super.getSystemService(name)
    }
}
