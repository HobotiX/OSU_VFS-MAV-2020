package com.example.mav_mr_fpv_osu_2020.old.mavdata;

import android.text.TextUtils;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.vfsmav_osu20_fpv.utils.MAVUtils;

public class MAVTelemetryRepository implements MAVTelemetryAsyncTask.Callback {
    private static final String TAG = MAVTelemetryRepository.class.getSimpleName();
    private MutableLiveData<MAVRepo> mTelemetry;
    private MutableLiveData<Status> mStatus;
    private String mFPVView;
    private String mMAVPort;
    private boolean mGUIAttitude;
    private boolean mGUIBattery;
    private boolean mGUICompass;
    private boolean mGUIHorizon;
    private boolean mGUIDebug;

    public MAVTelemetryRepository() {
        mTelemetry = new MutableLiveData<>();
        mTelemetry.setValue(null);
        mStatus = new MutableLiveData<>();
        mStatus.setValue(Status.SUCCESS);
    }
    public LiveData<MAVRepo> getTelemetryItem() { return mTelemetry; }
    public LiveData<Status> getStatus() { return mStatus; }

    @Override
    public void onTelemetryFinished(MAVRepo telemetry) {
        mTelemetry.setValue(telemetry);
        if (telemetry != null) {
            mStatus.setValue(Status.SUCCESS);
        } else {
            mStatus.setValue(Status.ERROR);
        }
    }

    private boolean executeFetch(String v, String p, boolean a, boolean b, boolean c, boolean h, boolean d) {
        return !TextUtils.equals(v, mFPVView)
                || !TextUtils.equals(p, mMAVPort)
                || mGUIAttitude != a
                || mGUIBattery != b
                || mGUICompass != c
                || mGUIHorizon != h
                || mGUIDebug != d;
    }

    public void loadMAVTelemetry(String v, String p, boolean a, boolean b, boolean c, boolean h, boolean d) {
        if (executeFetch(v, p, a, b, c, h, d)) {
            mFPVView = v;
            mMAVPort = p;
            mGUIDebug = d;
            mGUIHorizon = h;
            mGUICompass = c;
            mGUIBattery = b;
            mGUIAttitude = a;
            String url = MAVUtils.getMAVTelemetryURL();
            mTelemetry.setValue(null);
            Log.d(TAG, "executing search with url: " + url);
            mStatus.setValue(Status.LOADING);
            new MAVTelemetryAsyncTask(this).execute(url);
        } else {
            Log.d(TAG, "Using cached results");
        }
    }
}
