package com.toturial;

    // Subclass untuk Pegawai Tidak Tetap
class PegawaiTidakTetap extends Pegawai {
    private int durasiLembur;

    public PegawaiTidakTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    public int getDurasiLembur() {
        return durasiLembur;
    }

    public void hitungGajiBersih() {
        double lembur = durasiLembur * (0.05 * getGajiPokok());
        setGajiBersih(getGajiPokok() + lembur);
    }
}
