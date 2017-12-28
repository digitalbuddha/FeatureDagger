package nyc.friendlyrobot.featurea

import android.os.Bundle
import nyc.friendlyrobot.featureb.R
import javax.inject.Inject

class FeatureBFeatureBActivity : BaseFeatureBActivity() {

    @Inject lateinit var flavor: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityComponent.inject(this)
    }
}
