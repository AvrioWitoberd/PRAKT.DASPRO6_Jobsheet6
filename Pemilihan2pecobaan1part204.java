import java.util.Scanner;

public class Pemilihan2pecobaan1part204 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        int tahun;
        System.out.println("Masukkkan tahun :");
        tahun = input04.nextInt();
        
        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun kabisat");
        }
    }
}
