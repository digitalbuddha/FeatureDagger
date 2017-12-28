package nyc.friendlyrobot.featurea

import dagger.Module
import dagger.Subcomponent
import nyc.friendlyrobot.base.ActivityScoped

val featureA="FeatureA"

interface FeatureAComponent {
    fun plusActivityComponent(): ActivityComponent

}

@Module
class ActivityModule {

}

@Subcomponent(modules = arrayOf(ActivityModule::class))
@ActivityScoped
interface ActivityComponent {
    fun inject(featureAActivity: FeatureAActivity)
}
