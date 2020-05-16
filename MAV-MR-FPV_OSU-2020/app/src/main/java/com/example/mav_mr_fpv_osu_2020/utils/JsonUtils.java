package com.example.mav_mr_fpv_osu_2020.utils;

import android.net.Uri;

import com.example.mav_mr_fpv_osu_2020.data.MAVTelemetryData;
import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JsonUtils {
    public static final String TELEMETRY_URL = "com.example.android.lifecycleweather.utils.ForecastItem";

    public static String getURL() {
        return TELEMETRY_URL;
    }
    static class MAVTelemetryResults {
        public MAVTelemetryPoint data;
    }

    static class MAVTelemetryPoint {
        public MAVProximity proximity;
        public MAVBattery battery;
        public MAVRotor rotor;
        public MAVimu imu;
        public boolean payload_sensor;
    }

    static class MAVProximity {
        public float port;
        public float starboard;
        public float stern;
    }

    static class MAVBattery {
        public float max;
        public float current;
    }

    static class MAVRotor {
        public float cw;
        public float ccw;
    }

    static class MAVimu {
        public float accel;
        public float gyro;
        public float mag;
        public float euler;
        public float temp;
    }

    public static MAVTelemetryData parseJson(String telemetryJSON) {
        Gson gson = new Gson();
        MAVTelemetryResults results = gson.fromJson(telemetryJSON, MAVTelemetryResults.class);
        if (results != null && results.data != null) {
            MAVTelemetryData telemetryData = new MAVTelemetryData();
            telemetryData.proximityStarboard = Math.round(results.data.proximity.starboard);
            telemetryData.proximityPort = Math.round(results.data.proximity.port);
            telemetryData.proximityStern = Math.round(results.data.proximity.stern);
            telemetryData.batteryMax = Math.round(results.data.battery.max);
            telemetryData.batteryCurrent = Math.round(results.data.battery.current);
            telemetryData.batteryPercent = batteryPercentageCalc(telemetryData.batteryMax, telemetryData.batteryCurrent);
            telemetryData.rotorRPMCCW = Math.round(results.data.rotor.ccw);
            telemetryData.rotorRPMCW = Math.round(results.data.rotor.cw);
            telemetryData.imuDataAccel = Math.round(results.data.imu.accel);
            telemetryData.imuDataEuler = Math.round(results.data.imu.euler);
            telemetryData.imuDataGyro = Math.round(results.data.imu.gyro);
            telemetryData.imuDataMag = Math.round(results.data.imu.mag);
            telemetryData.imuDataTemp = Math.round(results.data.imu.temp);
            telemetryData.payloadSensor = results.data.payload_sensor;
            /*for (MAVTelemetryPoint telemetry : results.data) {
                telemetryData.proximityStarboard = Math.round(telemetry.proximity.starboard);
                telemetryData.proximityPort = Math.round(telemetry.proximity.port);
                telemetryData.proximityStern = Math.round(telemetry.proximity.stern);
                telemetryData.batteryMax = Math.round(telemetry.battery.max);
                telemetryData.batteryCurrent = Math.round(telemetry.battery.current);
                telemetryData.rotorRPMCCW = Math.round(telemetry.rotor.ccw);
                telemetryData.rotorRPMCW = Math.round(telemetry.rotor.cw);
                telemetryData.imuDataAccel = Math.round(telemetry.imu.accel);
                telemetryData.imuDataEuler = Math.round(telemetry.imu.euler);
                telemetryData.imuDataGyro = Math.round(telemetry.imu.gyro);
                telemetryData.imuDataMag = Math.round(telemetry.imu.mag);
                telemetryData.imuDataTemp = Math.round(telemetry.imu.temp);
                telemetryData.payloadSensor = telemetry.payload_sensor;
            }*/
            return telemetryData;
        } else {
            return null;
        }
    }

    private static float batteryPercentageCalc (double max, double cur) {
        return (float) (cur/max);
    }


}
