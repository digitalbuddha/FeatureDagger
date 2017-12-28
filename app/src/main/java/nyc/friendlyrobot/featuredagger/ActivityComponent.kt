package nyc.friendlyrobot.featuredagger

import dagger.Module
import dagger.Subcomponent
import nyc.friendlyrobot.base.ActivityScoped

@Subcomponent(modules = arrayOf(ActivityModule::class))
@ActivityScoped
interface ActivityComponent {
    fun inject(activity: BaseActivity)
}

@Module
class ActivityModule {

}
