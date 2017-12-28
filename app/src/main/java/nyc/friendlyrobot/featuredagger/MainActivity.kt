package nyc.friendlyrobot.featuredagger

import android.os.Bundle

class MainActivity:BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent.inject(this)

    }
}