/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan21.programrata.ratanilai;

/**
 *
 * @author Risky Irfansyah
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Program : Program Rata-rata Nilai
 */
public class PBO210118085Latihan21ProgramRatarataNilai {
    public static int mahasiswa;
    public static double rata, nilai=0;
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa = scanner.nextInt();
        for (int i=1; i<=mahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke- " + i + ":");
            nilai = nilai + scanner.nextInt();
        }
        rata = nilai/mahasiswa;
        System.out.printf("Maka, Rata-rata Nilainya adalah %.1f", rata);
    }
}
