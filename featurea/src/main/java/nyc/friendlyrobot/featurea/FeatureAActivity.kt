package nyc.friendlyrobot.featurea

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nyc.friendlyrobot.base.Sheath

class FeatureAActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerActivityComponent
                .builder()
                .activity(this)
                .appComponent(Sheath.create(application))
    }
}
