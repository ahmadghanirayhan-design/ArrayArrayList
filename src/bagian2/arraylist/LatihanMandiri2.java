package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {

        // Soal 1: Daftar Belanja
        System.out.println("--- Soal 1 ---");
        ArrayList<String> listBelanja = new ArrayList<>();
        listBelanja.add("Beras");
        listBelanja.add("Minyak"); 
        listBelanja.add("Telur");
        listBelanja.add("Gula");

        // hapus item kedua (indeks 1)
        listBelanja.remove(1);

        System.out.println("Isi list belanja: " + listBelanja);
        System.out.println("Jumlah item: " + listBelanja.size());
        System.out.println();


        // Soal 2: Cari Nilai Terbesar
        System.out.println("--- Soal 2 ---");
        ArrayList<Integer> listAngka = new ArrayList<>();
        listAngka.add(25);
        listAngka.add(45);
        listAngka.add(12);
        listAngka.add(89);
        listAngka.add(34);

        int palingBesar = listAngka.get(0);
        for (int angka : listAngka) {
            if (angka > palingBesar) {
                palingBesar = angka;
            }
        }
        System.out.println("Data angka: " + listAngka);
        System.out.println("Nilai paling besar: " + palingBesar);
        System.out.println();


        // Soal 3: Filter Huruf A
        System.out.println("--- Soal 3 ---");
        ArrayList<String> listNama = new ArrayList<>();
        listNama.add("Andi");
        listNama.add("Budi");
        listNama.add("Anisa");
        listNama.add("Citra");
        listNama.add("Aris");
        listNama.add("Dewi");

        System.out.println("Nama yang diawali huruf A:");
        for (String nama : listNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}