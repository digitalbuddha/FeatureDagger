package nyc.friendlyrobot.featuredagger

import android.app.Application
import nyc.friendlyrobot.featurea.featureA

class MyApplication : Application() {


    val component by lazy { DaggerAppComponent.builder().application(this).build() }

    override fun getSystemService(name: String?): Any {
        if (name == featureA) return component
        return super.getSystemService(name)
    }
}