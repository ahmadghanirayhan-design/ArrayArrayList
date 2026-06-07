/*
 * Nama : Rayhan Ahmad Ghani
 * NPM  : 2410010270
 */
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // Poin 4: Menyimpan daftar nama mata kuliah dalam array String fixed-size (min 3) dan menampilkannya
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        System.out.println("== DAFTAR MATA KULIAH ==");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Poin 3: Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Poin 3: Menambahkan minimal 5 objek Mahasiswa ke dalam KelasKuliah
        kelas.tambahMahasiswa(new Mahasiswa("Aldi", "2410010011", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Rezky", "2410010022", 55.5));
        kelas.tambahMahasiswa(new Mahasiswa("Nadia", "2410010033", 78.0));
        kelas.tambahMahasiswa(new Mahasiswa("Amelia", "2410010044", 92.5));
        kelas.tambahMahasiswa(new Mahasiswa("Bagas", "2410010055", 40.0));

        // Memanggil method untuk menampilkan semua data awal
        kelas.tampilkanSemua();
        System.out.println();

        // Poin 5: Menampilkan rata-rata nilai kelas dan jumlah mahasiswa yang lulus
        System.out.println("Rata-rata Nilai Kelas : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println();

        // Poin 6: Menambahkan SATU objek Mahasiswa BARU ke dalam koleksi
        System.out.println(">>> Menambahkan 1 Mahasiswa Baru ke Koleksi...");
        kelas.tambahMahasiswa(new Mahasiswa("Dara", "2410010066", 88.0));
        System.out.println();

        // Poin 6: Menampilkan kembali daftar data dan jumlah total data terbaru
        kelas.tampilkanSemua();
        System.out.println("Jumlah Total Data Mahasiswa Terbaru: " + kelas.getJumlahData() + " orang.");
    }
}
