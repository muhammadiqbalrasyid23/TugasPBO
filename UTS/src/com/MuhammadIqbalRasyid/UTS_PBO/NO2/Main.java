package com.MuhammadIqbalRasyid.UTS_PBO.NO2;

public class Main {
    public static void main(String[] args) {
        Smartphone hp1 = new Smartphone(
                "Samsung",
                "Galaxy A11",
                new Platform(
                        "Android 10",
                        "Qualcomm SM4250 Snapdragon 450 (11 nm)",
                        "Octa-core 1.8 GHz Cortex-A53",
                        "Adreno 506"
                ),
                "Fingerprint (rear-mounted), accelerometer, proximity",
                new Battery(
                        "Li-Po 4000 mAh, non-removable",
                        "fast Charging 15W"
                ),
                "No"
        );
        hp1.getSpecs();
        System.out.println();

        Smartphone hp2 = new Smartphone(
                "Xioami",
                "Mi 10T pro 5G",
                new Platform(
                        "Android 10, MIUI 12",
                        "Qualcomm SM8250 Snapdragon 865 (7 nm+)",
                        "Octa-core (1x2.84 GHz Kryo 585 & 3x2.42 GHz Kryo 585 & 4x1.80 GHz Kryo 585)",
                        "Adreno 650"
                ),
                "Fingerprint (side-mounted), accelerometer, gyro, proximity, compass, barometer",
                new Battery(
                        "Li-Po 5000 mAh, non-removable",
                        "Fast charging 33W"
                ),
                "Yes"
        );
        hp2.getSpecs();
        System.out.println();
    }
}
