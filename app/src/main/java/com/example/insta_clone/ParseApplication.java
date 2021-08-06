package com.example.insta_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("qu88uvnpVixTfDui8CUtBgbD6U1F5P5JN8O1jkB5")
                .clientKey("JYVzwSaYMgoVkaWxfaH2dnVcPuuFh7eZRMtzmroJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
