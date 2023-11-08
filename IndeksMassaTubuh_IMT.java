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
public class IndeksMassaTubuh_IMT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Memeriksa Indeks Massa Tubuh untuk Mengetahui Kriteria");
        System.out.print("Masukkan Berat Badan Anda (kg): ");
        float BB = input.nextFloat();
       

        System.out.print("Masukkan Tinggi Badan Anda (cm): ");
        float TB = input.nextFloat();
        
        float TBM = TB * 1/100;   //konversi tinggi badan CM ke M
        float IMT = BB / (TBM * TBM);

        String kriteria;
        if (IMT < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (IMT >= 18.5 && IMT < 25) {
            kriteria = "Berat Badan Ideal";
        } else if (IMT >= 25 && IMT < 30) {
            kriteria = "Berat Badan Lebih";
        } else if (IMT >= 30 && IMT < 40) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        System.out.println("Anda Memiliki Berat Badan "+BB+" kg"+" Dan Tinggi Badan "+TB+" cm");
        System.out.println("Indeks Massa Tubuh Anda adalah: " + IMT);
        System.out.println("Anda Termasuk kedalam Kriteria: " + kriteria);
    }

}
