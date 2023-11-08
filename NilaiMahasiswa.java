/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author Reynaldo
 */
public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INPUT NILAI MAHASISWA");
        System.out.print("NPM            : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        float hadir = input.nextFloat();
        System.out.print("Nilai Tugas    : ");
        float tugas = input.nextFloat();
        System.out.print("Nilai UTS      : ");
        float uts = input.nextFloat();
        System.out.print("Nilai UAS      : ");
        float uas = input.nextFloat();

        double nilaiAkhir = 0.1 * hadir + 0.2 * tugas + 0.3 * uts + 0.4 * uas;

        String nilai, ket;
        if (nilaiAkhir >= 76) {
            nilai = "A";
            ket = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            nilai = "B";
            ket = "BAIK";
        } else if (nilaiAkhir >= 56) {
            nilai = "C";
            ket = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            nilai = "D";
            ket = "KURANG";
        } else {
            nilai = "E";
            ket = "KURANG SEKALI";
        }
        
        System.out.println("\nNPM Mahasiswa     : " + npm);
        System.out.println("Nama Mahasiswa    : " + nama);
        System.out.println("Nilai Rata-Rata   : " + nilaiAkhir);
        System.out.println("Grade             : " + nilai);
        System.out.println("Keterangan        : " + ket);
    }

}
