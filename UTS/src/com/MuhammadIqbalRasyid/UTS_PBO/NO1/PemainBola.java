package com.MuhammadIqbalRasyid.UTS_PBO.NO1;

public class PemainBola {
    private String nama;
    private float tinggi = 0;
    private String posisi;

    public PemainBola(String nama, float tinggi, String posisi) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.posisi = posisi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public float getTinggi() {
        return tinggi;
    }

    public String getPosisi() {
        return posisi;
    }
}
