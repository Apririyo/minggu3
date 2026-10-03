package kalkulator;

import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Pangkat");

        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasil;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case 4:
                hasil = angka1 / angka2;
                System.out.println("Hasil = " + hasil);
                break;
                
            case 5:
                hasil = 1;

                for (int i = 1; i <= angka2; i++) {
                    hasil = hasil * angka1;
                }

                System.out.println("Hasil = " + hasil);
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }
        input.close();
    }
}
