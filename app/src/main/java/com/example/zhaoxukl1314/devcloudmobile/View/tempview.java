package com.example.zhaoxukl1314.devcloudmobile.View;

import java.util.concurrent.Executors;

/**
 * Created by zhaoxukl1314 on 16/10/23.
 */

public class tempview {

    //    private final ExecutorService mTaskExecutor;
//    private Future<Boolean> mStopTask;
//    private Future<Boolean> mPauseTask;
//    mTaskExecutor = Executors.newSingleThreadExecutor();
//    mTaskExecutor.submit(new StartTask());
//    mTaskExecutor.execute(new ReleaseMediaPlayerTask(mMediaPlayer));

    //    private class StartTask implements Runnable {
//
//        @Override
//        public void run() {
//        }
//    }

//    mStopTask = mTaskExecutor.submit(new StopTask());

//    boolean success = mStopTask.get();

    //    private class StopTask implements Callable<Boolean> {
//
//        @Override
//        public Boolean call() throws Exception {
//
//        }
//    }



//    final PhotoSavingTask task = new PhotoSavingTask(request);
//    mPhotoSavingTaskQueue.add(task);
//    task.execute();

//    class PhotoSavingTask extends AsyncTask<Void, Void, Boolean> {
//        final PhotoSavingRequest mRequest;
//        public PhotoSavingTask(PhotoSavingRequest request) {
//            mRequest = request;
//        }
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        @Override
//        protected void onPostExecute(Boolean result) {
//            super.onPostExecute(result);
//            popPhotoSavingTask(this);
//        }
//
//        private static final long POLLING_WAIT = 50;
//
//        /**
//         * Store data.
//         *
//         * @param fullPath
//         *            path of photo
//         * @param image
//         *            image byte data
//         * @param info
//         *            exif header.
//         */
//        @Override
//        protected Boolean doInBackground(Void... params) {
//            if (CameraLogger.DEBUG) CameraLogger.d(TAG, "### doInBackground() start...");
//            return save(mRequest);
//        }
//
//        private boolean save(final PhotoSavingRequest request) {
//
//        }
//    }


//    List<Future<byte[]>> futures = new ArrayList<Future<byte[]>>();
//    ExecutorService mpoMakeTaskExecutor = Executors.newFixedThreadPool(
//            workBuffers.size());
//
//    // Combine preview frames.
//    int iCnt = 0; // For format debug.
//    for (NativeByteBufferHolder frame : previewFrames.images) {
//        futures.add(mpoMakeTaskExecutor.submit(new YuvToJpegTask(
//                iCnt++,
//                frame,
//                previewFrames,
//                imageRect,
//                exifByteOrder,
//                exifInfo,
//                workBuffers)));
//    }
//
//    for (Future<byte[]> future : futures) {
//        try {
//            byte[] jpegData = future.get();
//            if (jpegData != null) {
//                MpoWriter.addCombineJpegData(jpegData, jpegData.length);
//            }
//
//        } catch (InterruptedException e) {
//            if (CameraLogger.DEBUG) CameraLogger.e(TAG,
//                    "Exception occurs:" + e.getMessage());
//        } catch (ExecutionException e) {
//            if (CameraLogger.DEBUG) CameraLogger.e(TAG,
//                    "Exception occurs:" + e.getMessage());
//        }
//    }


    //public class BaseLayoutPatternApplier implements LayoutPatternApplier {
//
//    private final Map<LayoutPattern, Visibilities> mMap =
//            new HashMap<LayoutPattern, Visibilities>();
//
//    private BaseLayout mLayout;
//
//    @Override
//    public void setup(BaseLayout baseLayout, boolean isOneshot) {
//        mLayout = baseLayout;
//        setupVisibilities(isOneshot);
//    }
//
//    @Override
//    public void apply(LayoutPattern pattern) {
//
//        Visibilities visiblities = mMap.get(pattern);
//
//        switch (visiblities.captureButton) {
//            case S:
//                mLayout.getOnScreenButtonGroup().setVisibility(View.VISIBLE);
//                break;
//            case H:
//                mLayout.getOnScreenButtonGroup().setVisibility(View.INVISIBLE);
//                break;
//            default:
//                // Control visibility in capturing by CaptureButton
//                if (mLayout.getOnScreenButtonGroup().isTouched()) {
//                    mLayout.getOnScreenButtonGroup().setVisibility(View.VISIBLE);
//                } else {
//                    mLayout.getOnScreenButtonGroup().setVisibility(View.INVISIBLE);
//                }
//                break;
//        }
//
//        switch (visiblities.contentView) {
//            case S:
//                mLayout.showContentsViewController();
//                break;
//            case H:
//                mLayout.hideContentsViewController();
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.contextualShortcut) {
//            case S:
//                mLayout.getContextualSettingShortcut().show();
//                break;
//            case H:
//                mLayout.getContextualSettingShortcut().hide();
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.captureMethodIndicator) {
//            case S:
//                mLayout.getCaptureMethodIndicatorContainer().setVisibility(View.VISIBLE);
//                break;
//            case H:
//                mLayout.getCaptureMethodIndicatorContainer().setVisibility(View.INVISIBLE);
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.sceneIndicator) {
//            case S:
//                mLayout.getSceneIndicator().show();
//                mLayout.getConditionIndicator().show();
//                break;
//            case H:
//                mLayout.getSceneIndicator().hide();
//                mLayout.getConditionIndicator().hide();
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.geotagIndicator) {
//            case S:
//                mLayout.getGeoTagIndicator().show();
//                break;
//            case H:
//                mLayout.getGeoTagIndicator().hide();
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.storageIndicator) {
//            case S:
//                mLayout.getLowMemoryIndicator().show();
//                break;
//            case H:
//                mLayout.getLowMemoryIndicator().hide();
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.zoombar) {
//            case S:
//                mLayout.getZoomBar().show();
//                break;
//            case H:
//                mLayout.getZoomBar().hideImmediately();
//                break;
//            case D:
//                mLayout.getZoomBar().hideDelayed();
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.recordingProgress) {
//            case S:
//                mLayout.getRecordingIndicator().setVisibility(View.VISIBLE);
//                break;
//            case H:
//                mLayout.getRecordingIndicator().setVisibility(View.INVISIBLE);
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.thermalIndicator) {
//            case S:
//                mLayout.getThermalIndicator().show();
//                break;
//            case H:
//                mLayout.getThermalIndicator().hide();
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.primarySettingShortcut) {
//            case S:
//                mLayout.getFacingShortcut().show();
//                mLayout.getFlashShortcut().show();
//                break;
//            case H:
//                mLayout.getFacingShortcut().hide();
//                mLayout.getFlashShortcut().hide();
//                break;
//            default:
//                break;
//        }
//
//        switch (visiblities.mTutorial) {
//            case S:
//                mLayout.getTutorial().setVisibility(View.VISIBLE);
//
//                break;
//            case H:
//                mLayout.getTutorial().setVisibility(View.INVISIBLE);
//
//                break;
//            default:
//                break;
//        }
//
//        mLayout.refresh();
//    }
//
//    // NONE: Not specified status of visibility. Visibility is not changed if it this is set.
//    public static final int N = 0;
//    // SHOW: View is visible if this is set.
//    public static final int S = 1;
//    // HIDE: View is invisible if this is set.
//    public static final int H = 2;
//    // DELAY: View will be invisible if this is set.
//    public static final int D = 3;
//
//    private static class Visibilities {
//        public final int captureButton;
//        public final int captureMethodIndicator;
//        public final int sceneIndicator;
//        public final int geotagIndicator;
//        public final int storageIndicator;
//        public final int zoombar;
//        public final int contentView;
//        public final int contextualShortcut;
//        public final int recordingProgress;
//        public final int thermalIndicator;
//        public final int primarySettingShortcut;
//        public final int mTutorial;
//
//        public Visibilities(int[] visibilities) {
//            this.captureButton = visibilities[0];
//            this.captureMethodIndicator = visibilities[1];
//            this.sceneIndicator = visibilities[2];
//            this.geotagIndicator = visibilities[3];
//            this.storageIndicator = visibilities[4];
//            this.zoombar = visibilities[5];
//            this.contentView = visibilities[6];
//            this.contextualShortcut = visibilities[7];
//            this.recordingProgress = visibilities[8];
//            this.thermalIndicator = visibilities[9];
//            this.primarySettingShortcut = visibilities[10];
//            this.mTutorial = visibilities[11];
//        }
//    }
//
//    /**
//     * Functions for changing mode of ViewFinder visual.
//     */
//    private void setupVisibilities(boolean oneshot) {
//        mMap.clear();
//
//        if (oneshot) {
//            // 1) captureButton
//            // 2) captureMethodIndicators
//            // 3) modeIndicators
//            // 4) geotagIndicator
//            // 5) storageIndicator
//            // 6) zoombar
//            // 7) contentView
//            // 8) contextual setting shortcut
//            // 9) recordingProgress
//            // a) thermalIndicator
//            // b) primaryShortcut
//            // c) tutorial
//            //                                      1) 2) 3) 4) 5) 6) 7) 8) 9) a) b) c)
//            set(BaseLayoutPattern.PREVIEW,          S, S, H, S, S, D, H, S, H, S, S, N);
//            set(BaseLayoutPattern.CLEAR,            H, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.PAUSE,            H, H, H, H, H, H, S, H, H, H, H, H);
//            set(BaseLayoutPattern.ZOOMING,          H, H, H, H, H, S, H, H, H, H, H, H);
//            set(BaseLayoutPattern.FOCUS_SEARCHING,  N, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.FOCUS_DONE,       N, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.CAPTURE,          N, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.RECORDING,        S, S, H, H, S, D, H, H, S, S, H, H);
//            set(BaseLayoutPattern.BURST_SHOOTING,   N, H, H, H, S, H, H, H, H, S, H, H);
//            set(BaseLayoutPattern.APPS_UI,          H, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.SETTING,          S, H, H, H, H, H, H, S, H, H, S, H);
//            set(BaseLayoutPattern.SELFTIMER,        S, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.PAUSE_RECORDING,  S, S, H, H, S, D, H, H, S, S, H, H);
//            set(BaseLayoutPattern.SEMIAUTO_SEEKING, S, S, H, S, S, H, H, S, H, S, S, H);
//        } else {
//            //                                      1) 2) 3) 4) 5) 6) 7) 8) 9) a) b) c)
//            set(BaseLayoutPattern.PREVIEW,          S, S, S, S, S, D, S, S, H, S, S, N);
//            set(BaseLayoutPattern.CLEAR,            H, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.PAUSE,            H, H, H, H, H, H, S, H, H, H, H, H);
//            set(BaseLayoutPattern.ZOOMING,          H, H, H, H, H, S, H, H, H, H, H, H);
//            set(BaseLayoutPattern.FOCUS_SEARCHING,  N, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.FOCUS_DONE,       N, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.CAPTURE,          N, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.RECORDING,        S, S, S, H, S, D, S, H, S, S, H, H);
//            set(BaseLayoutPattern.BURST_SHOOTING,   N, H, H, H, S, H, H, H, H, S, H, H);
//            set(BaseLayoutPattern.APPS_UI,          H, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.SETTING,          S, H, H, H, H, H, S, S, H, H, S, H);
//            set(BaseLayoutPattern.SELFTIMER,        S, H, H, H, H, H, H, H, H, H, H, H);
//            set(BaseLayoutPattern.PAUSE_RECORDING,  S, S, S, H, S, D, H, H, S, S, H, H);
//            set(BaseLayoutPattern.SEMIAUTO_SEEKING, S, S, S, S, S, H, S, S, H, S, S, H);
//        }
//    }
//
//    /***
//     * Set component visibility to layout pattern.
//     *
//     * @param pattern
//     * @param visibility
//     */
//    private void set(LayoutPattern pattern, int... visibilities) {
//        mMap.put(pattern, new Visibilities(visibilities));
//    }
//}


    //public interface LayoutPatternApplier {
//    void setup(BaseLayout baseLayout, boolean isOneshot);
//    void apply(LayoutPattern pattern);
//}




    //public enum BaseLayoutPattern implements LayoutPattern {
//    /**
//     * This pattern means the viewfinder when camera is previewing.
//     * This supports a capturing, a recording, and shows all indicators.
//     */
//    PREVIEW,
//    /**
//     * This pattern means the viewfinder when application pauses.
//     * All UI components disappears in this.
//     */
//    CLEAR,
//    /**
//     * This pattern means the viewfinder when application pauses.
//     */
//    PAUSE,
//    /**
//     * This pattern means the viewfinder when camera is zooming.
//     */
//    ZOOMING,
//    /**
//     * This pattern means the viewfinder when camera is searching focus.
//     */
//    FOCUS_SEARCHING,
//    /**
//     * This pattern means the viewfinder after camera fixes a focus position.
//     */
//    FOCUS_DONE,
//    /**
//     * This pattern means the viewfinder after camera captures.
//     */
//    CAPTURE,
//    /**
//     * This pattern means the viewfinder when camera is bursting.
//     * The only difference between this pattern and CAPTURE is low memory
//     * indicator should be shown during burst shot according to UI spec.
//     */
//    BURST_SHOOTING,
//    /**
//     * This pattern means the viewfinder when camera is recording.
//     */
//    RECORDING,
//    /**
//     * This pattern means the viewfinder when mode selector is opened.
//     */
//    APPS_UI,
//    /**
//     * This pattern means the viewfinder when setting dialog is opened.
//     */
//    SETTING,
//    /**
//     * This pattern means the viewfinder when counting self timer.
//     */
//    SELFTIMER,
//    /**
//     * This pattern means the viewfinder during video recording is paused.
//     */
//    PAUSE_RECORDING,
//    /**
//     * This pattern means the viewfinder when semi auto is seeking.
//     */
//    SEMIAUTO_SEEKING,
//}

    //public interface LayoutPattern {
//}



//    public SettingAdapter generateItemAdapter() {
//        SettingAdapter adapter = new SettingAdapter(mContext, mDialogItemFactory);
//        mSettingChangeExecutor =
//                new SettingChangeExecutor(mActivity, mStateMachine, mMenuDialog);
//        ArrayList<TimeShiftViewerMenuItem> visibleItems =
//                new ArrayList<TimeShiftViewerMenuItem>();
//        for (TimeShiftViewerMenuItem key : COMMON_ITEMS) {
//            if (isVisible(key)) visibleItems.add(key);
//        }
//        for (TimeShiftViewerMenuItem key : visibleItems) {
//            SettingItemBuilder<TimeShiftViewerMenuItem> builder = SettingItemBuilder.build(key)
//                    .iconId(key.getIconId())
//                    .textId(key.getTitleId())
//                    .executor(mSettingChangeExecutor.getExecutor(key))
//                    .selectable(isSelectable(key))
//                    .dialogItemType(SettingDialogItemFactory.VALUE_BUTTON);
//
//            adapter.add(builder.commit());
//        }
//        adapter.setItemHeight(SettingDialogBasicParams
//                .SECOND_LAYER_DIALOG_SINGLE_ITEM_PARAMS
//                .getItemHeight(mActivity));
//        return adapter;
//    }
//}

}


//public class SettingItemBuilder<T> {
//    public static final String TAG = "SettingItemBuilder";
//
//    private final T mData;
//
//    private int mIconId = ResourceUtil.INVALID_RESOURCE_ID;
//    private int mTextId = ResourceUtil.INVALID_RESOURCE_ID;
//    private int mSubTextId = ResourceUtil.INVALID_RESOURCE_ID;
//    private int mLongTextId = ResourceUtil.INVALID_RESOURCE_ID;
//    private String mAdditionalTextForAccessibility = "";
//    private String mText = "";
//    private int mDialogItemType = ResourceUtil.INVALID_RESOURCE_ID;
//    private SettingExecutorInterface<T> mExecutor = null;
//    private List<SettingItem> mItems = null;
//
//    private boolean mIsSelectable = true;
//    private boolean mSelected = false;
//    private boolean mIsSoundEnabled = true;
//
//    private SettingItemBuilder(T data) {
//        mData = data;
//    }
//
//    public static <T> SettingItemBuilder<T> build(T data) {
//        return new SettingItemBuilder<T>(data);
//    }
//
//    public SettingItem commit() {
//        final SettingItem item;
//
//        if (mTextId == ResourceUtil.INVALID_RESOURCE_ID) {
//            item = new TypedSettingItem<T>(
//                    mData,
//                    mIconId,
//                    mText,
//                    mSubTextId,
//                    mLongTextId,
//                    mAdditionalTextForAccessibility,
//                    mDialogItemType,
//                    mExecutor,
//                    mIsSoundEnabled);
//
//        } else {
//            item = new TypedSettingItem<T>(
//                    mData,
//                    mIconId,
//                    mTextId,
//                    mSubTextId,
//                    mLongTextId,
//                    mAdditionalTextForAccessibility,
//                    mDialogItemType,
//                    mExecutor,
//                    mIsSoundEnabled);
//        }
//
//        if (mItems != null) {
//            for (SettingItem child : mItems) {
//                item.getChildren().add(child);
//            }
//        }
//
//        item.setSelectable(mIsSelectable);
//        item.setSelected(mSelected);
//
//        return item;
//    }
//
//    public SettingItemBuilder<T> iconId(int id) {
//        mIconId = id;
//        return this;
//    }
//
//    public SettingItemBuilder<T> textId(int id) {
//        mTextId = id;
//        return this;
//    }
//
//    public SettingItemBuilder<T> subTextId(int id) {
//        mSubTextId = id;
//        return this;
//    }
//
//    public SettingItemBuilder<T> longTextId(int id) {
//        mLongTextId = id;
//        return this;
//    }
//
//    public SettingItemBuilder<T> text(String text) {
//        mText = text;
//        return this;
//    }
//
//    public SettingItemBuilder<T> additionalTextForAccessibility(String text) {
//        mAdditionalTextForAccessibility = text;
//        return this;
//    }
//
//    public SettingItemBuilder<T> dialogItemType(int type) {
//        mDialogItemType = type;
//        return this;
//    }
//
//    public SettingItemBuilder<T> executor(SettingExecutorInterface<T> executor) {
//        mExecutor = executor;
//        return this;
//    }
//
//    public SettingItemBuilder<T> item(SettingItem item) {
//        if (mItems == null) {
//            mItems = new ArrayList<SettingItem>();
//        }
//        mItems.add(item);
//        return this;
//    }
//
//    public SettingItemBuilder<T> selected(boolean value) {
//        mSelected = value;
//        return this;
//    }
//
//    public SettingItemBuilder<T> selectable(boolean value) {
//        mIsSelectable = value;
//        return this;
//    }
//
//    public SettingItemBuilder<T> enableSound(boolean value) {
//        mIsSoundEnabled = value;
//        return this;
//    }

//public enum TimeShiftViewerMenuItem implements SettingKey {
//    SAVE_SEPERATELY(
//            R.string.cam_strings_timeshift_save_selection_txt),
//    SHARE(
//            R.string.cam_strings_timeshift_share_txt),
//    SELECT_PHOTOS(
//            R.string.cam_strings_timeshift_select_images_txt),
//    CANCLE_SELECTION(
//            R.string.cam_strings_timeshift_cancel_selection_txt),
//    ;
//
//    /** Other applications may refer to the title id. */
//    private int mTitleTextId;
//
//    private TimeShiftViewerMenuItem(int titleTextId) {
//        mTitleTextId = titleTextId;
//    }
//
//    /**
//     * Get Title Id for the value.
//     *
//     * @return Title Id.
//     */
//    public int getTitleId() {
//        return mTitleTextId;
//    }
//
//    /**
//     * Get Icon Id for the value.
//     */
//    @Override
//    public int getIconId() {
//        // This function is never used.
//        return 0;
//    }
//
//    /**
//     * Get Text Id for the value.
//     */
//    @Override
//    public int getTextId() {
//        // This function is never used.
//        return 0;
//    }
//}

//public class SettingChangeExecutor {
//
//    private static final String TAG = SettingChangeExecutor.class.getSimpleName();
//    private StateMachine mStateMachine;
//    private SettingDialogStack mSettingDialogStack;
//    private TimeShiftViewerShare mTimeShiftViewerShare;
//    private ArrayList<Uri> mUriList;
//    private List<TimeShiftImage> mOriginalUriList;
//
//    public SettingChangeExecutor(
//            Activity activity, StateMachine stateMachine, SettingDialogStack settingDialogStack) {
//        mStateMachine = stateMachine;
//        mSettingDialogStack = settingDialogStack;
//        mTimeShiftViewerShare = new TimeShiftViewerShare(activity);
//    }
//
//    private class SaveSeperatelySettingExecutor implements
//            SettingExecutorInterface<TimeShiftViewerMenuItem> {
//        @Override
//        public void onExecute(TypedSettingItem<TimeShiftViewerMenuItem> item) {
//            mSettingDialogStack.closeDialogs(false);
//            mStateMachine.sendEvent(Event.EVENT_ON_SAVE_REQUEST);
//        }
//    }
//
//    private class ShareSettingExecutor implements
//            SettingExecutorInterface<TimeShiftViewerMenuItem> {
//        @Override
//        public void onExecute(TypedSettingItem<TimeShiftViewerMenuItem> item) {
//            mSettingDialogStack.closeDialogs(false);
//            getUriList();
//            if (mUriList.size() != 0) {
//                mTimeShiftViewerShare.select(mUriList);
//            }
//        }
//    }
//
//    private class SelectPhotoSettingExecutor implements
//            SettingExecutorInterface<TimeShiftViewerMenuItem> {
//        @Override
//        public void onExecute(TypedSettingItem<TimeShiftViewerMenuItem> item) {
//            mSettingDialogStack.closeDialogs(false);
//            if(!mTimeShiftViewerShare.isShareDialogAreadyExist()) {
//                mStateMachine.sendEvent(Event.EVENT_ON_MULTIPLE_SELECT);
//            }
//        }
//    }
//
//    private class CancelSelectionSettingExecutor implements
//            SettingExecutorInterface<TimeShiftViewerMenuItem> {
//        @Override
//        public void onExecute(TypedSettingItem<TimeShiftViewerMenuItem> item) {
//            mSettingDialogStack.closeDialogs(false);
//            mStateMachine.sendEvent(Event.EVENT_ON_MULTIPLE_CANCEL);
//        }
//    }
//
//    public SettingExecutorInterface<TimeShiftViewerMenuItem> getExecutor(
//            final TimeShiftViewerMenuItem key) {
//        switch (key) {
//            case SAVE_SEPERATELY:
//                return new SaveSeperatelySettingExecutor();
//
//            case SHARE:
//                return new ShareSettingExecutor();
//
//            case SELECT_PHOTOS:
//                return new SelectPhotoSettingExecutor();
//
//            case CANCLE_SELECTION:
//                return new CancelSelectionSettingExecutor();
//
//            default:
//                return new SettingExecutorInterface<TimeShiftViewerMenuItem>() {
//                    @Override
//                    public void onExecute(TypedSettingItem<TimeShiftViewerMenuItem> item) {
//                        // NOP
//                    }
//                };
//        }
//    }
//
//    public void getUriList() {
//        mUriList = new ArrayList<Uri>();
//        mOriginalUriList = mStateMachine.getSelectedImageList();
//        for(int index = 0; index < mOriginalUriList.size(); index++) {
//            Uri mUri = Uri.fromFile(
//                    new File(((TimeShiftImage) mOriginalUriList.get(index)).path));
//            mUriList.add(mUri);
//        }
//        mOriginalUriList.clear();
//    }
//}

//public interface SettingExecutorInterface<T> {
//    void onExecute(TypedSettingItem<T> item);
//}


//public class TypedSettingItem<T> implements SettingItem {
//    public static final String TAG = "TypedSettingItem";
//
//    private final T mData;
//
//    //Only one of mTxtId or mTxtStr is set in constructor.
//    private final int mTextId;
//    private final String mText;
//
//    private final int mSubTextId;
//    private final int mLongTextId;
//
//
//    private final int mIconId;
//    private final int mDialogItemType;
//    private final String mAdditionalTextForAccessibility;
//
//    private final SettingExecutorInterface<T> mExecutor;
//    private final List<SettingItem> mChildren;
//
//
//    private boolean mIsSelected;
//    private boolean mIsSelectable;
//    private final boolean mIsSoundEnabled;
//
//    private OnItemSelectedListener mOnSettingItemSelectedListener;
//
//
//    public TypedSettingItem(
//            T data,
//            int iconId,
//            int labelId,
//            int subTextId,
//            int longTextId,
//            String additionalTextForAccessibility,
//            int dialogItemType,
//            SettingExecutorInterface<T> executor,
//            boolean isSoundEnable) {
//        mData = data;
//        mTextId = labelId;
//        mText = "";
//        mIconId = iconId;
//        mDialogItemType = dialogItemType;
//        mExecutor = executor;
//        mIsSoundEnabled = isSoundEnable;
//
//        mChildren = new ArrayList<SettingItem>();
//
//        mSubTextId = subTextId;
//        mLongTextId = longTextId;
//        mAdditionalTextForAccessibility = additionalTextForAccessibility;
//        mIsSelected = false;
//        mIsSelectable = false;
//
//        mOnSettingItemSelectedListener = null;
//    }
//
//    public TypedSettingItem(
//            T data,
//            int iconId,
//            String text,
//            int subTextId,
//            int longTextId,
//            String additionalTextForAccessibility,
//            int dialogItemType,
//            SettingExecutorInterface<T> executor,
//            boolean isSoundEnable) {
//        mData = data;
//        mTextId = ResourceUtil.INVALID_RESOURCE_ID;
//        mText = text;
//        mSubTextId = subTextId;
//        mLongTextId = longTextId;
//        mIconId = iconId;
//        mDialogItemType = dialogItemType;
//        mAdditionalTextForAccessibility = additionalTextForAccessibility;
//        mExecutor = executor;
//        mIsSoundEnabled = isSoundEnable;
//
//        mChildren = new ArrayList<SettingItem>();
//
//        mIsSelected = false;
//        mIsSelectable = false;
//
//        mOnSettingItemSelectedListener = null;
//    }
//
//    @Override
//    public String getText(Resources resources) {
//        if (mTextId == ResourceUtil.INVALID_RESOURCE_ID) {
//            return mText;
//        } else {
//            return resources.getString(mTextId);
//        }
//    }
//
//    /**
//     * Return null if the sub text is not set.
//     */
//    @Override
//    public String getSubText(Resources resources) {
//        if (mSubTextId == ResourceUtil.INVALID_RESOURCE_ID) {
//            return null;
//        } else {
//            return resources.getString(mSubTextId);
//        }
//    }
//
//    /**
//     * Return null if the long text is not set.
//     */
//    @Override
//    public String getLongText(Resources resources) {
//        if (mLongTextId == ResourceUtil.INVALID_RESOURCE_ID) {
//            return null;
//        } else {
//            return resources.getString(mLongTextId);
//        }
//    }
//
//    @Override
//    public String getContentDescription(Resources resources) {
//
//        StringBuilder description = new StringBuilder();
//
//        if (mTextId != ResourceUtil.INVALID_RESOURCE_ID) {
//            description.append(resources.getString(mTextId));
//        } else {
//            description.append(mText);
//        }
//
//        if ((mAdditionalTextForAccessibility != null) &&
//                (!mAdditionalTextForAccessibility.isEmpty())) {
//            description.append(' ');
//            description.append(mAdditionalTextForAccessibility);
//        }
//
//        if (!isSelectable()) {
//            description.append(' ');
//            description.append(resources.getString(
//                    R.string.cam_strings_accessibility_not_configurable_txt));
//        }
//
//        return description.toString();
//    }
//
//    @Override
//    public int getIconId() {
//        return mIconId;
//    }
//
//    @Override
//    public boolean isSelected() {
//        return mIsSelected;
//    }
//
//    @Override
//    public boolean isSelectable() {
//        return mIsSelectable;
//    }
//
//    @Override
//    public void setSelected(boolean value) {
//        mIsSelected = value;
//    }
//
//    @Override
//    public void setSelectable(boolean value) {
//        mIsSelectable = value;
//    }
//
//    @Override
//    public int getDialogItemType() {
//        return mDialogItemType;
//    }
//
//    @Override
//    public List<SettingItem> getChildren() {
//        return mChildren;
//    }
//
//    public T getData() {
//        return mData;
//    }
//
//    /**
//     * Select the item
//     *
//     * SettingExecutorInterface.onExecute() is called.
//     */
//    @Override
//    public void select() {
//        mIsSelected = true;
//
//        if (mOnSettingItemSelectedListener != null) {
//            mOnSettingItemSelectedListener.onItemSelected(this);
//        }
//
//        if (mExecutor == null) {
//            return;
//        }
//
//        mExecutor.onExecute(this);
//    }
//
//    @Override
//    public void setOnSelectedListener(OnItemSelectedListener listener) {
//        mOnSettingItemSelectedListener = listener;
//    }
//
//    @Override
//    public boolean compareData(SettingItem item) {
//        if (item instanceof TypedSettingItem) {
//            TypedSettingItem<?> other = (TypedSettingItem<?>)item;
//            return (mData == other.mData);
//        }
//        return false;
//    }
//
//    @Override
//    public boolean compareData(Object data) {
//        return (mData == data);
//    }
//
//    public String getValueText() {
//        return mAdditionalTextForAccessibility;
//    }
//
//    @Override
//    public boolean isSoundEnabled() {
//        return mIsSoundEnabled;
//    }
//}


//public interface SettingItem {
//
//
//    /**
//     *  Reader of resource id.
//     */
//    int getIconId();
//    String getText(Resources resources);
//    String getSubText(Resources resources);
//    String getLongText(Resources resources);
//    String getContentDescription(Resources resources);
//
//    /**
//     * Select this setting item and run the specified SettingExecutor.
//     */
//    void select();
//
//    /**
//     * Return true and this item is highlighted in setting dialog if this item is selected.
//     */
//    boolean isSelected();
//
//    /**
//     * Return true and this item is visible in setting dialog if this item is selected.
//     */
//    boolean isSelectable();
//
//    void setSelected(boolean value);
//
//    void setSelectable(boolean value);
//
//    int getDialogItemType();
//
//    List<SettingItem> getChildren();
//
//    void setOnSelectedListener(OnItemSelectedListener listener);
//
//    boolean compareData(SettingItem item);
//
//    boolean compareData(Object data);
//
//    boolean isSoundEnabled();
//}


//public interface SettingKey extends SettingItemData {
//
//}

//public interface SettingItemData {
//
//    public int getIconId();
//
//    public int getTextId();
//}

