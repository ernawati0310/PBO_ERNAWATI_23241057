package com.toturial;

    // Subclass untuk Pegawai Tetap
class PegawaiTetap extends Pegawai {
    private double tunjangan;
    private int durasiLembur;

    public PegawaiTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = 0.7 * gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    public int getDurasiLembur() {
        return durasiLembur;
    }

    public void hitungGajiBersih() {
        double lembur = durasiLembur * (0.01 * getGajiPokok());
        setGajiBersih(getGajiPokok() + tunjangan + lembur);
    }

}