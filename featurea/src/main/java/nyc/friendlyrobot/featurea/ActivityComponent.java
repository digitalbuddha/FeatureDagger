package nyc.friendlyrobot.featurea;

import android.app.Activity;

import dagger.BindsInstance;
import dagger.Component;
import nyc.friendlyrobot.base.ActivityScoped;
import nyc.friendlyrobot.base.BaseComponent;

@ActivityScoped
@Component(dependencies = BaseComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(FeatureAActivity mainActivity);

    @Component.Builder
    interface Builder {
        ActivityComponent build();
        Builder appComponent(BaseComponent baseComponent);

        @BindsInstance
        Builder activity(Activity activity);
    }

}