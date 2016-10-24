package com.example.zhaoxukl1314.devcloudmobile.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.zhaoxukl1314.devcloudmobile.Controller.StateMachine;
import com.example.zhaoxukl1314.devcloudmobile.R;
import com.example.zhaoxukl1314.devcloudmobile.View.BaseLayout;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class DevCloudMobileActvity extends Activity implements StateMachine.OnStateChangedListener{

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    private BaseLayout mBaseLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBaseLayout = new BaseLayout(this);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mBaseLayout.attachToWindow();
        SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);

        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setShadowWidth(R.dimen.shadow_width);
        menu.setShadowDrawable(R.drawable.shadow);

        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        menu.setFadeDegree(0.35f);

        menu.attachToActivity(this,SlidingMenu.SLIDING_CONTENT);
        menu.setMenu(R.layout.slide_menu);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    @Override
    public void onStateChanged(Object... objects) {
//        changeLayoutTo(LayoutPattern pattern);
//        mBasePatter.apply(pattern);
    }
}
