package com.yang.icbm.application.controller;

import java.io.Serializable;

public class IcbmLocation implements Serializable {

	private static final long serialVersionUID = 1L;

    private long icbmCode;  // use this to compare with its initial setup security code to authorize control of movement to zoom new target
    private String icbmId;  // uniquely identify an ICBM

    private double longitude;
    private double latitude;
    private long timestamp;  // moment when this object is retrieved from ICBM to calculate offset

    public long getIcbmCode() {
        return icbmCode;
    }

    public void setIcbmCode(long icbmCode) {
        this.icbmCode = icbmCode;
    }

    public String getIcbmId() {
        return icbmId;
    }

    public void setIcbmId(String icbmId) {
        this.icbmId = icbmId;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

}
