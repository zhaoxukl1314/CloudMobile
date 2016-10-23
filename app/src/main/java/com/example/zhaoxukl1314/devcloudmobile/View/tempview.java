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
}
