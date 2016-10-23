package com.example.zhaoxukl1314.devcloudmobile.Controller;

import android.app.Activity;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by zhaoxukl1314 on 16/10/23.
 */

public class StateMachineController implements StateMachine{

    private State mCurrentState;

    public StateMachineController(Activity activity) {

    }

    private Set<OnStateChangedListener> mOnStateChangedListenerSet
            = new CopyOnWriteArraySet<OnStateChangedListener>();

    @Override
    public void addOnStateChangedListener(OnStateChangedListener listener) {
        mOnStateChangedListenerSet.add(listener);
    }

    @Override
    public void removeOnStateChangedListener(OnStateChangedListener listener) {
        mOnStateChangedListenerSet.remove(listener);
    }

    @Override
    public void sendStaticEvent(StaticEvent staticEvent, Object... objects) {

    }

    @Override
    public CaptureState getCurrentCaptureState() {
        return null;
    }

    class State {


        // CONSTRUCTOR
        public State() {

        }

        // This is called after notified new state to lister.
        public void entry() {
        }

        // This is called before changed state.
        public void exit() {
        }

        public CaptureState getCaptureState() {
//            return mCaptureState;
            return null;
        }


        // Transitter event handlers, these events may be change the state.

        public void handleInitialize(Object... objects) {
            // NOP.
        }

        public void handleResume(Object... objects) {
            // NOP.
        }

        public void handleResumeTimeout(Object... objects) {
            // NOP.
        }

        public void handleFinalize(Object... objects) {
            // NOP.
        }

        public void handlePause(Object... objects) {
            changeTo(new State(), objects);
        }
    }

        public synchronized void sendEvent(TransitterEvent transitter, Object... objects) {

        switch (transitter) {
            case EVENT_RESUME:
                mCurrentState.handleInitialize(objects);
                break;

            default:
                // NOP, UnExpected Event.
                break;
        }
    }

    private synchronized void changeTo(State nextState, Object... objects) {

        // Exit from current state.
        mCurrentState.exit();

        // Change state.
        mCurrentState = nextState;

        // Notice listeners.
        for (OnStateChangedListener listener : mOnStateChangedListenerSet) {
            listener.onStateChanged(mCurrentState.getCaptureState(), objects);
        }

        // Entry to next state.
        mCurrentState.entry();
    }
}
