package nyc.friendlyrobot.featuredagger

import android.app.Application
import nyc.friendlyrobot.featurea.FeatureAInjector
import nyc.friendlyrobot.featureb.FeatureBInjector

class MyApplication : Application() {


    private val appComponent by lazy { DaggerAppComponent.builder().application(this).build() }

    override fun getSystemService(name: String): Any {
        return if (Injector.matchesAppService(name) || FeatureAInjector.matchesAppService(name) || FeatureBInjector.matchesAppService(name)) {
            appComponent
        } else super.getSystemService(name)
    }
}