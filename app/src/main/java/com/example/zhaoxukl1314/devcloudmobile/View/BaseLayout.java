package com.example.zhaoxukl1314.devcloudmobile.View;

import android.content.Context;
import android.widget.RelativeLayout;

/**
 * Created by zhaoxukl1314 on 16/10/23.
 */

public class BaseLayout {

    public BaseLayout() {
        initRootView();
    }

    private void initRootView() {
    }

    private class RootView extends RelativeLayout {

        public RootView(Context context) {
            super(context);
        }
    }
}
