package nyc.friendlyrobot.featuredagger

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import nyc.friendlyrobot.featurea.FeatureAFeatureAActivity
import nyc.friendlyrobot.featureb.FeatureBFeatureBActivity

class MainActivity:BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent.inject(this)

        setContentView(R.layout.activity_main)

        launchActivityA.setOnClickListener {
            val intent = Intent(this, FeatureAFeatureAActivity::class.java)
            startActivity(intent)
        }

        launchActivityB.setOnClickListener {
            val intent = Intent(this, FeatureBFeatureBActivity::class.java)
            startActivity(intent)
        }


    }
}