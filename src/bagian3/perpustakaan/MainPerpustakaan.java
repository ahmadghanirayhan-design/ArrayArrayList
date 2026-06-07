package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        // Pembuatan objek buku menggunakan 3 parameter sesuai constructor baru
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        perpus.tampilkanKoleksi();
        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); 
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // Menguji Method Tambahan Latihan Mandiri
        System.out.println("--- Menguji Fitur Kembalikan Buku ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        System.out.println("--- Menguji Fitur Cari Penulis ---");
        perpus.cariPenulis("Pramoedya");
    }
}