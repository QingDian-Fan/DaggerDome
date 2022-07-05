package com.dagger.project.component;


import com.dagger.project.container.UserActivity;
import com.dagger.project.module.HttpModule;
import com.dagger.project.module.UserModule;

import dagger.Component;

@Component(modules = {UserModule.class,HttpModule.class}/*,dependencies = HttpComponent.class*/)
public interface UserComponent {
    void inject(UserActivity activity);
}
