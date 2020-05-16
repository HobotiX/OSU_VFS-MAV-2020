package com.example.mav_mr_fpv_osu_2020.old;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.vfsmav_osu20_fpv.mavdata.MAVRepo;
import com.example.vfsmav_osu20_fpv.mavdata.MAVTelemetryRepository;
import com.example.vfsmav_osu20_fpv.mavdata.Status;

// FPV Mixed Reality View
public class FPVViewModel extends ViewModel {
    private MAVTelemetryRepository mRepository;
    private LiveData<MAVRepo> mTelemetry;
    private LiveData<Status> mStatus;

    public FPVViewModel() {
        mRepository = new MAVTelemetryRepository();
        mTelemetry = mRepository.getTelemetryItem();
        mStatus = mRepository.getStatus();
    }

    public void loadTelemetryData(String v, String p, boolean a, boolean b, boolean c, boolean h, boolean d) {
        mRepository.loadMAVTelemetry(v,p,a,b,c,h,d);
    }

    public LiveData<MAVRepo> getTelemetry() {
        return mTelemetry;
    }

    public LiveData<Status> getStatus() {
        return mStatus;
    }
}
