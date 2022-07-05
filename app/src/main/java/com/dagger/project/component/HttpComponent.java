package com.dagger.project.component;


import com.dagger.project.ProjectApplication;
import com.dagger.project.module.HttpModule;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {

    void inject(ProjectApplication application);
}
