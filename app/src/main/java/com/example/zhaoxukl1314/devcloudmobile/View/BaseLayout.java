package com.example.zhaoxukl1314.devcloudmobile.View;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.zhaoxukl1314.devcloudmobile.Animation.AnimationFactory;
import com.example.zhaoxukl1314.devcloudmobile.R;

/**
 * Created by zhaoxukl1314 on 16/10/23.
 */

public class BaseLayout {

    private Activity mActivity;
    private RootView mRootView;
    private Button button;

    public BaseLayout(Activity activity) {
        mActivity = activity;
        initRootView();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private void initRootView() {
        mRootView = new RootView(mActivity);
        RelativeLayout.LayoutParams rootLayoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        mRootView.setLayoutParams(rootLayoutParams);
    }

    private class RootView extends RelativeLayout {

        public RelativeLayout mHeaderContainer;
        public RelativeLayout mContentContainer;
        public RelativeLayout mFooterContainer;

        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
        public RootView(Context context) {
            super(context);
            mHeaderContainer = new RelativeLayout(context);
            addView(mHeaderContainer);
            RelativeLayout.LayoutParams headLayoutParams = new LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    (int) getResources().getDimension(R.dimen.devcloud_header_height));
            headLayoutParams.addRule(ALIGN_PARENT_TOP,RelativeLayout.TRUE);
            headLayoutParams.setMargins(0,0,0,0);
            mHeaderContainer.setLayoutParams(headLayoutParams);
            mHeaderContainer.setBackgroundColor(Color.BLUE);
            mHeaderContainer.setPadding(0,0,0,0);
            int headerId = View.generateViewId();
            mHeaderContainer.setId(headerId);

            mFooterContainer = new RelativeLayout(context);
            addView(mFooterContainer);
            RelativeLayout.LayoutParams footLayoutParams = new LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    (int) getResources().getDimension(R.dimen.devcloud_footer_height));
            footLayoutParams.addRule(ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
            footLayoutParams.setMargins(0,0,0,0);
            mFooterContainer.setLayoutParams(footLayoutParams);
            mFooterContainer.setBackgroundColor(Color.BLACK);
            mFooterContainer.setPadding(0,0,0,0);
            int footerId = View.generateViewId();
            mFooterContainer.setId(footerId);

            mContentContainer = new RelativeLayout(context);
            addView(mContentContainer);
            RelativeLayout.LayoutParams contentLayoutParams = new RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            contentLayoutParams.addRule(ABOVE,footerId);
            contentLayoutParams.addRule(BELOW,headerId);
            contentLayoutParams.setMargins(0,0,0,0);
            mContentContainer.setLayoutParams(contentLayoutParams);
            mContentContainer.setPadding(0,0,0,0);

            View view = View.inflate(context,R.layout.activity_dev_cloud_mobile_actvity, null);
            mContentContainer.addView(view);

            ViewGroup footView = (ViewGroup) View.inflate(context,R.layout.footer,null);
            mFooterContainer.addView(footView);
            RelativeLayout.LayoutParams footContentLayoutParams = new RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            footContentLayoutParams.addRule(CENTER_VERTICAL,RelativeLayout.TRUE);
            footView.setLayoutParams(footContentLayoutParams);

            ViewGroup headView = (ViewGroup) View.inflate(context,R.layout.header,null);
            mHeaderContainer.addView(headView);
            RelativeLayout.LayoutParams headContentLayoutParams = new RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            headContentLayoutParams.addRule(CENTER_VERTICAL,RelativeLayout.TRUE);
            headView.setLayoutParams(headContentLayoutParams);

            button = (Button) headView.findViewById(R.id.test);
//            final View slideMenu = View.inflate(context,R.layout.slide_menu,null);
//            addView(slideMenu);
//            RelativeLayout.LayoutParams menuParams = (LayoutParams) slideMenu.getLayoutParams();
//            slideMenu.setX(getResources().getDimension(R.dimen.slide_menu_left));

            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    AnimationFactory.slideAnimation(mRootView);
//                    AnimationFactory.slideInAnimation(slideMenu);
                }
            });
        }
    }

    public void attachToWindow() {
        mActivity.getWindow().addContentView(
                mRootView,
                new WindowManager.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
    }
}
