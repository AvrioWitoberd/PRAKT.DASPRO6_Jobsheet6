import java.util.Scanner;

public class Latihan204 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double hargaKamus = 15000;
        double hargaNovel = 10000;
        double hargaBukuLain = 5000;

        System.out.print("Masukkan jenis buku (kamus/novel/lain): ");
        String jenisBuku = sc.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        double totalHarga = 0;
        double totalDiskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            double diskon = 0;
            if (jumlahBuku > 2) {
                diskon = 0.10 + 0.02;
            } else {
                diskon = 0.10; 
            }
            totalDiskon = hargaKamus * jumlahBuku * diskon;
            totalHarga = hargaKamus * jumlahBuku - totalDiskon;
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            double diskon = 0;
            if (jumlahBuku > 3) {
                diskon = 0.07 + 0.02; 
            } else {
                diskon = 0.07 + 0.01; 
            }
            totalDiskon = hargaNovel * jumlahBuku * diskon;
            totalHarga = hargaNovel * jumlahBuku - totalDiskon;
        } else {
            double diskon = 0;
            if (jumlahBuku > 3) {
                diskon = 0.05; 
            } else {
                diskon = 0; 
            }
            totalDiskon = hargaBukuLain * jumlahBuku * diskon;
            totalHarga = hargaBukuLain * jumlahBuku - totalDiskon;
        }

        System.out.println("Total diskon yang diterima: " + totalDiskon);
        System.out.println("Total harga untuk " + jumlahBuku + " buku " + jenisBuku + ": " + totalHarga);
        

        sc.close();
    }
}
