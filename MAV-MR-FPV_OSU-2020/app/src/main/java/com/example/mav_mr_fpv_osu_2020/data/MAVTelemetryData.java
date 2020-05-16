package com.example.mav_mr_fpv_osu_2020.data;

public class MAVTelemetryData {
    public float proximityPort, proximityStarboard, proximityStern;
    public float batteryMax, batteryCurrent, batteryPercent;
    public float rotorRPMCW, rotorRPMCCW;
    public float imuDataAccel, imuDataGyro, imuDataMag, imuDataEuler, imuDataTemp;
    public boolean payloadSensor;
}
