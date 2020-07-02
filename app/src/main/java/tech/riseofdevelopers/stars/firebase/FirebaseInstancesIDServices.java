package tech.riseofdevelopers.stars.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

/*
 * Created by Mochammad Tedy Fazrin on 4/2/20 4:54 PM
 * Copyright (c) 2020. All rights reserved.
 */

public class FirebaseInstancesIDServices extends FirebaseMessagingService {
    private static final String TAG = "MyFirebaseIIDService";

    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
    }
}