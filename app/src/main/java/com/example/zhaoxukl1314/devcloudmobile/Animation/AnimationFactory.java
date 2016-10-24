package com.example.zhaoxukl1314.devcloudmobile.Animation;

import android.view.View;
import android.view.animation.TranslateAnimation;

/**
 * Created by zhaoxukl1314 on 16/10/24.
 */

public class AnimationFactory {

    public static void slideAnimation(View view) {
        TranslateAnimation slideAnimation = new TranslateAnimation(0.0f,100.0f,0.0f,0.0f);
        slideAnimation.setDuration(1000);
        slideAnimation.setFillAfter(false);
        view.startAnimation(slideAnimation);
    }

    public static void slideInAnimation(View view) {
        TranslateAnimation slideAnimation = new TranslateAnimation(-100f,0.0f,0.0f,0.0f);
        slideAnimation.setDuration(1000);
        slideAnimation.setFillAfter(false);
        view.startAnimation(slideAnimation);
    }
}
