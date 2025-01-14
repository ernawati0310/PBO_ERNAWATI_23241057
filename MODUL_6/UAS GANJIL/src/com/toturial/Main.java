package com.toturial;

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        // Pegawai tetap
        PegawaiTetap pegawaiTetap = new PegawaiTetap("UJANG", 5000000);
        pegawaiTetap.setDurasiLembur(10);
        pegawaiTetap.hitungGajiBersih();

        // Pegawai tidak tetap
        PegawaiTidakTetap pegawaiTidakTetap = new PegawaiTidakTetap("UCUP", 3000000);
        pegawaiTidakTetap.setDurasiLembur(5);
        pegawaiTidakTetap.hitungGajiBersih();

        // Tampilkan hasil dari Pegawai Tetap
        System.out.println("Pegawai Tetap:");
        System.out.println("Nama: " + pegawaiTetap.getNama());
        System.out.println("Gaji Pokok: " + pegawaiTetap.getGajiPokok());
        System.out.println("Tunjangan: " + pegawaiTetap.getTunjangan());
        System.out.println("Durasi Lembur: " + pegawaiTetap.getDurasiLembur());
        System.out.println("Gaji Bersih: " + pegawaiTetap.getGajiBersih());

        // Tampilan hasil dari Pegawai Tidak Tetap
        System.out.println("Pegawai Tidak Tetap:");
        System.out.println("Nama: " + pegawaiTidakTetap.getNama());
        System.out.println("Gaji Pokok: " + pegawaiTidakTetap.getGajiPokok());
        System.out.println("Durasi Lembur: " + pegawaiTidakTetap.getDurasiLembur());
        System.out.println("Gaji Bersih: " + pegawaiTidakTetap.getGajiBersih());
    }
}

