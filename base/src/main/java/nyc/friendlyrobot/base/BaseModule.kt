package nyc.friendlyrobot.base

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseModule {

    @Module
    companion object {
        @Provides
        @Singleton
        @JvmStatic
        fun provideBuildType(): String = BuildConfig.BUILD_TYPE
    }
}
