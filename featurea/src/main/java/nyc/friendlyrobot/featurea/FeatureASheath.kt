package nyc.friendlyrobot.featurea

import android.app.Application

object FeatureASheath {
    fun get(app: Application): FeatureAComponent {
       return app.getSystemService(featureA) as FeatureAComponent
    }
}