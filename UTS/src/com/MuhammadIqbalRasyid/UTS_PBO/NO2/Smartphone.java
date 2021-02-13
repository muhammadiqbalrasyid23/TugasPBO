package com.MuhammadIqbalRasyid.UTS_PBO.NO2;

public class Smartphone {
    private String merk;
    private String series;
    private Platform platform;
    private String sensors;
    private Battery battery;
    private String nfc;

    public Smartphone(String merk, String series, Platform platform, String sensors, Battery battery, String nfc) {
        this.merk = merk;
        this.series = series;
        this.platform = platform;
        this.sensors = sensors;
        this.battery = battery;
        this.nfc = nfc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public String getMerk() {
        return merk;
    }

    public String getSeries() {
        return series;
    }

    public Platform getPlatform() {
        return platform;
    }

    public String getSensors() {
        return sensors;
    }

    public Battery getBattery() {
        return battery;
    }

    public String getNfc() {
        return nfc;
    }

    public void getSpecs(){
        System.out.println(getMerk() + " " + getSeries() +" Specs");
        System.out.println("# Platform Specification");
        platform.getSpecs();
        System.out.println("# Sensors\t\t: "+ getSensors());
        System.out.println("# Battery Specification");
        battery.getSpecs();
        System.out.println("# NFC\t\t\t\t: " + getNfc());
        System.out.println();
    }
}
