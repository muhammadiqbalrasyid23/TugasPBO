package com.MuhammadIqbalRasyid.UTS_PBO.NO2;

public class Battery {
    private String type, charging;

    public Battery(String type, String charging) {
        this.type = type;
        this.charging = charging;
    }

    public String getType() {
        return type;
    }

    public String getCharging() {
        return charging;
    }

    public void getSpecs(){
        System.out.println("\t- Type      \t: " + getType());
        System.out.println("\t- Charging  \t: " + getCharging());
    }
}
