package com.example.gaseema.camerpro;

/**
 * Created by Kinuthia on 21/03/2016.
 */
import android.app.Application;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Don't do this! This is just so cold launches take some time
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(6));
    }
}
