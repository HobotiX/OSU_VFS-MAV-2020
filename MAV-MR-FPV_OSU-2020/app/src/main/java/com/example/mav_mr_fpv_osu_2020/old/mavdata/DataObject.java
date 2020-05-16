package com.example.mav_mr_fpv_osu_2020.old.mavdata;

public class DataObject {
    private float distSensorLeft;
    private float distSensorRight;
    private float distSensorDown;
    private float voltSensorTime;
    private boolean sensorPayload;
    private float roterCCwRPM;
    private float roterCwRPM;
    private float imuDataAccel;
    private float imuDataGyro;
    private float imuDataMag;
    private float imuDataEuler;
    private float imuDataTemp;

    public DataObject(float sensLeft, float sensRight, float sensDown, float sensTime, boolean payload, float ccwRPM, float cwRPM, float imuAccel, float imuGyro, float imuMag, float imuEuler, float temp){
        this.distSensorLeft = sensLeft;
        this.distSensorRight = sensRight;
        this.distSensorDown = sensDown;
        this.voltSensorTime = sensTime;
        this.sensorPayload = payload;
        this.roterCCwRPM = ccwRPM;
        this.roterCwRPM = cwRPM;
        this.imuDataAccel = imuAccel;
        this.imuDataGyro = imuGyro;
        this.imuDataMag = imuMag;
        this.imuDataEuler = imuEuler;
        this.imuDataTemp = temp;
    }

    public void setDistSensorDown(float distSensorDown) {
        this.distSensorDown = distSensorDown;
    }

    public float getDistSensorDown() {
        return distSensorDown;
    }

    public void setDistSensorLeft(float distSensorLeft) {
        this.distSensorLeft = distSensorLeft;
    }

    public float getDistSensorLeft() {
        return distSensorLeft;
    }

    public void setDistSensorRight(float distSensorRight) {
        this.distSensorRight = distSensorRight;
    }

    public float getDistSensorRight() {
        return distSensorRight;
    }

    public void setImuDataAccel(float imuDataAccel) {
        this.imuDataAccel = imuDataAccel;
    }

    public float getImuDataAccel() {
        return imuDataAccel;
    }

    public void setRoterCCwRPM(float roterCCwRPM) {
        this.roterCCwRPM = roterCCwRPM;
    }

    public float getRoterCCwRPM() {
        return roterCCwRPM;
    }

    public void setRoterCwRPM(float roterCwRPM) {
        this.roterCwRPM = roterCwRPM;
    }

    public float getRoterCwRPM() { return roterCwRPM; }

    public void setImuDataGyro(float imuDataGyro) { this.imuDataGyro = imuDataGyro; }

    public float getImuDataGyro() { return imuDataGyro; }

    public void setSensorPayload(boolean sensorPayload) { this.sensorPayload = sensorPayload; }

    public float getImuDataEuler() { return imuDataEuler; }

    public void setImuDataEuler(float imuDataEuler) { this.imuDataEuler = imuDataEuler; }

    public float getImuDataMag() { return imuDataMag; }

    public float getVoltSensorTime() { return voltSensorTime; }

    public float getImuDataTemp() { return imuDataTemp; }

    public void setImuDataMag(float imuDataMag) { this.imuDataMag = imuDataMag; }

    public void setVoltSensorTime(float voltSensorTime) { this.voltSensorTime = voltSensorTime; }

    public void setImuDataTemp(float imuDataTemp) { this.imuDataTemp = imuDataTemp; }
}
