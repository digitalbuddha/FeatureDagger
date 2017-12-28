package nyc.friendlyrobot.featurea

import dagger.Module
import dagger.Subcomponent
import nyc.friendlyrobot.base.ActivityScoped

val featureA="FeatureA"

interface FeatureAComponent {
    fun plusFeatureAActivityComponent(): FeatureAActivityComponent

}

@Module
class FeatureAActivityModule

@Subcomponent(modules = arrayOf(FeatureAActivityModule::class))
@ActivityScoped
interface FeatureAActivityComponent {
    fun inject(featureAActivity: FeatureAFeatureAActivity)
}
