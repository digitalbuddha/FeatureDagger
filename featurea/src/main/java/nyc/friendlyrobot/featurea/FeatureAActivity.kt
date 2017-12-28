package nyc.friendlyrobot.featurea

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

class FeatureAActivity : AppCompatActivity() {
    @Inject lateinit var flavor: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application.getSystemService(featureA) as FeatureAComponent).plusActivityComponent().inject(this)
    }
}
