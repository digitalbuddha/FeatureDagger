package nyc.friendlyrobot.featuredagger

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import nyc.friendlyrobot.base.BaseModule
import nyc.friendlyrobot.featurea.FeatureAComponent
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(BaseModule::class))
interface AppComponent : FeatureAComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }

}