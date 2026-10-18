package com.khushal.SpringAiDemo;

public class RiderLocation {
    private String riderId;
    private double latitude;
    private double longitude;

    public RiderLocation() {
    }

    public String getRiderId() {
        return riderId;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public RiderLocation(String riderId, double longitude, double latitude) {
        this.riderId = riderId;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
