package com.example.mav_mr_fpv_osu_2020.data;

import android.text.TextUtils;
import android.util.Log;
import com.example.mav_mr_fpv_osu_2020.utils.JsonUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MAVTelemetryDataFetch implements MAVTelemetryAsync.Callback {
    private static final String TAG = MAVTelemetryDataFetch.class.getSimpleName();
    private MutableLiveData<MAVTelemetryData> mTelemetryData;
    private MutableLiveData<Status> mLoadingStatus;

    public MAVTelemetryDataFetch() {
        mTelemetryData = new MutableLiveData<>();
        mTelemetryData.setValue(null);

        mLoadingStatus = new MutableLiveData<>();
        mLoadingStatus.setValue(Status.SUCCESS);
    }

    public LiveData<MAVTelemetryData> getTelemetryData() {
        return mTelemetryData;
    }

    public LiveData<Status> getLoadingStatus() {
        return mLoadingStatus;
    }

    @Override
    public void onSearchFinished(MAVTelemetryData searchResults) {
        mTelemetryData.setValue(searchResults);
        if (searchResults != null) {
            mLoadingStatus.setValue(Status.SUCCESS);
        } else {
            mLoadingStatus.setValue(Status.ERROR);
        }
    }

    public void loadTelemetryData() {

        String url = JsonUtils.getURL();
        mTelemetryData.setValue(null);
        Log.d(TAG, "executing search with url: " + url);
        mLoadingStatus.setValue(Status.LOADING);
        new MAVTelemetryAsync(this).execute(url);

    }
}
