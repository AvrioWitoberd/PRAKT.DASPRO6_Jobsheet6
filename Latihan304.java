import java.util.Scanner;

public class Latihan304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan merk (Converse, Skecher, Nike): ");
        String merk = sc.nextLine();
        
        System.out.print("Masukkan kategori (slipOn, highTop, woman, man, kids, adult): ");
        String kategori = sc.nextLine();
        
        System.out.print("Masukkan ukuran: ");
        int ukuran = sc.nextInt();
        
        int harga = 0;

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("slipOn")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800_000;
                }
            } else if (kategori.equalsIgnoreCase("highTop")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1_200_000;
                }
            }
        } else if (merk.equalsIgnoreCase("Skecher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1_000_000;
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1_800_000;
                }
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750_000;
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1_500_000;
                }
            }
        }

        if (harga > 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Data yang Anda masukkan tidak valid atau tidak ada harga yang sesuai.");
        }

        sc.close();


    }
}
