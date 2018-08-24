package com.example;

import com.example.sample.SampleModule;
import com.google.common.collect.Lists;
import com.google.inject.Module;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import javax.servlet.ServletContext;
import java.util.List;

public class ModuleContextListener extends GuiceResteasyBootstrapServletContextListener {
    @Override
    protected List<? extends Module> getModules(ServletContext context) {
        return Lists.newArrayList(
                new SampleModule()
        );
    }
}
