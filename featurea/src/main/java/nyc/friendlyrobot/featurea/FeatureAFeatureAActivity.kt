package nyc.friendlyrobot.featurea

import android.os.Bundle
import javax.inject.Inject

class FeatureAFeatureAActivity : BaseFeatureAActivity() {

    @Inject lateinit var flavor: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityComponent.inject(this)
    }
}
