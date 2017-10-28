package com.yang.icbm.application.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long locationKey;
	
	private Long icbmCode;
	private String icbmId;
    private double longitude;
    private double latitude;
    private long timestamp;
	
	public long getLocationKey() {
		return locationKey;
	}
	public void setLocationKey(long locationKey) {
		this.locationKey = locationKey;
	}
	
	public String getIcbmId() {
		return icbmId;
	}
	public void setIcbmId(String icbmId) {
		this.icbmId = icbmId;
	}
	public Long getIcbmCode() {
		return icbmCode;
	}
	public void setIcbmCode(Long icbmCode) {
		this.icbmCode = icbmCode;
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
