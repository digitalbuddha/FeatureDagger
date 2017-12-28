package nyc.friendlyrobot.featuredagger

import android.app.Application
import nyc.friendlyrobot.featurea.FeatureAComponent
import nyc.friendlyrobot.featurea.featureA

class MyApplication: Application() {


    private fun getAppComponent()=DaggerAppComponent.builder().application(this).build()

    override fun getSystemService(name: String?): Any {
        if(name==featureA) return getAppComponent()
        return super.getSystemService(name)
    }
}