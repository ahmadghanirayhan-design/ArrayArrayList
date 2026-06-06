package bagian1.array;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        
        // ==========================================
        // SOAL 1: Array 6 suhu harian (double)
        // Menampilkan suhu tertinggi dan terendah.
        // ==========================================
        System.out.println("=== Soal 1: Analisis Suhu Harian ===");
        double[] suhuHarian = {28.5, 31.2, 29.0, 34.1, 27.8, 30.5};
        
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];
        
        for (double suhu : suhuHarian) {
            if (suhu > suhuTertinggi) {
                suhuTertinggi = suhu;
            }
            if (suhu < suhuTerendah) {
                suhuTerendah = suhu;
            }
        }
        
        System.out.println("Suhu Tertinggi: " + suhuTertinggi + "°C");
        System.out.println("Suhu Terendah : " + suhuTerendah + "°C");
        System.out.println();


        // ==========================================
        // SOAL 2: Array String berisi 5 nama hari
        // Cetak hari yang memiliki lebih dari 5 huruf.
        // ==========================================
        System.out.println("=== Soal 2: Nama Hari Lebih Dari 5 Huruf ===");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari dengan panjang nama > 5 huruf:");
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println("- " + hari + " (" + hari.length() + " huruf)");
            }
        }
        System.out.println();


        // ==========================================
        // SOAL 3: Menghitung banyak angka genap
        // Diberikan int[] angka = {4, 8, 15, 16, 23, 42};
        // ==========================================
        System.out.println("=== Soal 3: Hitung Angka Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int n : angka) {
            if (n % 2 == 0) {
                jumlahGenap++;
            }
        }
        
        System.out.println("Banyaknya angka genap di dalam array: " + jumlahGenap);
    }
}