package com.example.mav_mr_fpv_osu_2020.old.mavdata;
import android.os.AsyncTask;

import com.example.vfsmav_osu20_fpv.utils.MAVUtils;
import com.example.vfsmav_osu20_fpv.utils.NetworkUtils;

import java.io.IOException;

public class MAVTelemetryAsyncTask extends AsyncTask<String, Void, String> {
    private Callback mCallback;

    public interface Callback {
        void onTelemetryFinished(MAVRepo searchResults);
    }

    public MAVTelemetryAsyncTask(Callback callback) {
        mCallback = callback;
    }

    @Override
    protected String doInBackground(String... strings) {
        String url = strings[0];
        String searchResults = null;
        try {
            searchResults = NetworkUtils.doHttpGet(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchResults;
    }

    @Override
    protected void onPostExecute(String s) {
        MAVRepo searchResults = null;
        if (s != null) {
            searchResults = MAVUtils.parseMAVTelemetryResults(s);
        }
        mCallback.onTelemetryFinished(searchResults);
    }
}
