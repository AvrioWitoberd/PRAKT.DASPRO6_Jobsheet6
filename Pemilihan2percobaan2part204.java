import java.util.Scanner;

public class Pemilihan2percobaan2part204 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        int pilihan_menu;
        double total_bayar;
        double diskon, harga;
        String member;
        String jenis_pembayaran;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input04.nextInt();
        input04.nextLine(); 
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input04.nextLine();
        
        System.out.print("Jenis pembayaran (QRIS/Non QRIS) = ");
        jenis_pembayaran = input04.nextLine();
        System.out.println("--------------------------------------- ");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
            } else if (pilihan_menu == 2) {
                harga = 3000;
            } else if (pilihan_menu == 3) {
                harga = 15000;
            } else {
                System.out.println("Masukkan pilihan menu yang benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
            } else if (pilihan_menu == 2) {
                harga = 3000;
            } else if (pilihan_menu == 3) {
                harga = 15000;
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga;
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        if (jenis_pembayaran.equalsIgnoreCase("QRIS")) {
            total_bayar -= 1000;
            System.out.println("Potongan harga Rp.1.000 untuk pembayaran QRIS");
        }

        System.out.println("Total bayar = " + total_bayar);
        System.out.println("-------------------------------------");
    }
}
