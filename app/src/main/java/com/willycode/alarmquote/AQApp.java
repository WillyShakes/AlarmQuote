package com.willycode.alarmquote;

import android.app.Application;

import com.firebase.client.Firebase;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;
import com.willycode.alarmquote.ui.quote.QuoteListActivity;

/**
 * Created by Manuel ELO'O on 14/01/2016.
 */
public class AQApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
        Firebase quotesRef = new Firebase(QuoteListActivity.FIREBASE_URL+"/quotes");
        quotesRef.keepSynced(true);
    }
    public static Bus bus = new Bus(ThreadEnforcer.ANY);
}
