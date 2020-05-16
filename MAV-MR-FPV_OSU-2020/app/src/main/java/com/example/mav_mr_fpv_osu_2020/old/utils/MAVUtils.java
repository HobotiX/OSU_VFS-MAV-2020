package com.example.mav_mr_fpv_osu_2020.old.utils;

import com.example.vfsmav_osu20_fpv.mavdata.MAVRepo;
import com.google.gson.Gson;

public class MAVUtils {
    private final static String MAV_CONNECT = "http://192.192.192.192/";
    static class MAVTelemetryResults {
        MAVRepo item;
    }
    public static MAVRepo parseMAVTelemetryResults(String json) {
        Gson gson = new Gson();
        MAVTelemetryResults results = gson.fromJson(json, MAVTelemetryResults.class);
        if (results != null && results.item != null) {
            return results.item;
        } else {
            return null;
        }
    }
    public static String getMAVTelemetryURL() {
        return MAV_CONNECT;
    }
}
