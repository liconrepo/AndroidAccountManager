package com.licon.accmanager.authentication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LiconAuthenticatorService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        LiconAuthenticator authenticator = new LiconAuthenticator(this);
        return authenticator.getIBinder();
    }
}