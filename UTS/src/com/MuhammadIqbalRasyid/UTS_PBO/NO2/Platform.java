package com.MuhammadIqbalRasyid.UTS_PBO.NO2;

public class Platform {
    private String os, chipset, cpu, gpu;

    public Platform(String os, String chipset, String cpu, String gpu) {
        this.os = os;
        this.chipset = chipset;
        this.cpu = cpu;
        this.gpu = gpu;

    }

    public String getOs() {
        return os;
    }

    public String getChipset() {
        return chipset;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }
    public void getSpecs(){
        System.out.println("\t- OS       \t: " + getOs());
        System.out.println("\t- CHIPSET  \t: " + getChipset());
        System.out.println("\t- CPU      \t: " + getCpu());
        System.out.println("\t- GPU      \t: " + getGpu());
    }
}
