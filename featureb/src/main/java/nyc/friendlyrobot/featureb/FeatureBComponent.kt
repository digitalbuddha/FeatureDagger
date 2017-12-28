package nyc.friendlyrobot.featurea

import dagger.Module
import dagger.Subcomponent
import nyc.friendlyrobot.base.ActivityScoped

val featureB="FeatureB"

interface FeatureBComponent {
    fun plusFeatureBActivityComponent(): FeatureBActivityComponent

}

@Module
class FeatureBActivityModule

@Subcomponent(modules = arrayOf(FeatureBActivityModule::class))
@ActivityScoped
interface FeatureBActivityComponent {
    fun inject(featureBActivity: FeatureBFeatureBActivity)
}
