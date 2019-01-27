package com.example.android.sunshine.data.database;

import java.util.Date;

public class ListViewWeatherEntry {
    private int weatherIconId;
    private Date date;
    private double min;
    private double max;

    public ListViewWeatherEntry(int weatherIconId, Date date, double min, double max) {
        this.weatherIconId = weatherIconId;
        this.date = date;
        this.min = min;
        this.max = max;
    }

    public int getWeatherIconId() {
        return weatherIconId;
    }

    public void setWeatherIconId(int weatherIconId) {
        this.weatherIconId = weatherIconId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
