package nyc.friendlyrobot.featuredagger

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import nyc.friendlyrobot.base.BaseModule
import nyc.friendlyrobot.featurea.FeatureAComponent
import nyc.friendlyrobot.featureb.FeatureBComponent
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(BaseModule::class, FlavorModule::class, TypeModule::class))
interface AppComponent : FeatureAComponent, FeatureBComponent {
    fun plusActivityComponent(): ActivityComponent

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }

}