package com.example.sample;

import com.google.inject.AbstractModule;

public class SampleModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SampleController.class);
    }
}
