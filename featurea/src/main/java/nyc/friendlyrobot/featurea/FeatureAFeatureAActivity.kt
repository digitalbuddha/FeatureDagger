package nyc.friendlyrobot.featurea

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_feature_b.*
import javax.inject.Inject

class FeatureAFeatureAActivity : BaseFeatureAActivity() {

    @Inject lateinit var flavor: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_b)
        activityComponent.inject(this)

        textView.text = "A: flavor is $flavor"
    }
}
