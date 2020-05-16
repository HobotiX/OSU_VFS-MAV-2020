package com.example.mav_mr_fpv_osu_2020.data;

import com.example.mav_mr_fpv_osu_2020.utils.JsonUtils;
import com.example.mav_mr_fpv_osu_2020.utils.NetworkUtils;
import android.os.AsyncTask;
import java.io.IOException;

public class MAVTelemetryAsync extends AsyncTask <String, Void, String> {
    private Callback mCallback;

    public interface Callback {
        void onSearchFinished(MAVTelemetryData searchResults);
    }

    public MAVTelemetryAsync(Callback callback) {
        mCallback = callback;
    }

    @Override
    protected String doInBackground(String... strings) {
        String url = strings[0];
        String searchResults = null;
        try {
            searchResults = NetworkUtils.doHTTPGet(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchResults;
    }

    @Override
    protected void onPostExecute(String s) {
        MAVTelemetryData searchResults = null;
        if (s != null) {
            searchResults = JsonUtils.parseJson(s);
        }
        mCallback.onSearchFinished(searchResults);
    }
}
