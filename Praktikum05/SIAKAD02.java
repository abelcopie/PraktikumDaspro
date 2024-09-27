

import java.util.Scanner;

public class SIAKAD02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        char kelas = sc.next().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        int absen = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai ujian: ");
        int nilaiUjian = sc.nextInt();
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);

        double nilaiAkhir;
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nilai akhir: " + nilaiAkhir);

        String kategori;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            kategori = "A"; 
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            kategori = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            kategori = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            kategori = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            kategori = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            kategori = "D";
        } else {
            kategori = "E";
        }
        System.out.println("Nilai akhir huruf: " + kategori);

        String kualifikasi ;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            kualifikasi = "Sangat Baik"; 
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            kualifikasi = "Kurang";
        } else {
            kualifikasi = "Gagal";
        }
        System.out.println("Kualifikasi: " + kualifikasi);
        
        sc.close();
    }
}
