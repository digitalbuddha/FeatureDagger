package nyc.friendlyrobot.base

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(BaseModule::class) )

interface BaseComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): BaseComponent.Builder

        fun build(): BaseComponent
    }
}

@Module
abstract class BaseModule {

    @Module
    companion object {
        @Provides
        @Singleton
        fun provideBuildType():String=BuildConfig.BUILD_TYPE
    }
}
