package com.example.zhaoxukl1314.devcloudmobile.Controller;

import android.app.Activity;

/**
 * Created by zhaoxukl1314 on 16/10/23.
 */

public interface StateMachine {

    public static class Factory {
        public static StateMachineController newInstance(Activity activity) {
            return new StateMachineController(activity);
        }
    }

    public enum TransitterEvent {
        EVENT_RESUME,
    }

    public enum StaticEvent {
        EVENT_RESUME,
    }

    public enum CaptureState {

        STATE_NONE,
        STATE_INITIALIZE
    }

    public interface OnStateChangedListener {
        abstract void onStateChanged(Object... objects);
    }

    void addOnStateChangedListener(OnStateChangedListener listener);

    void removeOnStateChangedListener(OnStateChangedListener listener);

    void sendEvent(TransitterEvent transitter, Object... objects);

    void sendStaticEvent(StaticEvent staticEvent, Object... objects);

    CaptureState getCurrentCaptureState();
}
