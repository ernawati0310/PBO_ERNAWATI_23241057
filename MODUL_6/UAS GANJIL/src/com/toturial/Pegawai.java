package com.toturial;

public class Pegawai {
        // Superclass
    private String nama;
    private double gajiPokok;
    private double gajiBersih;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    protected void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }
}