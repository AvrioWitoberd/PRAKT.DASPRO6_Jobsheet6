import java.util.Scanner;

public class Pemilihan2percobaan1part304 {
    public static void main(String[] args) {
        Scanner  input04 = new Scanner(System.in); 
        
        int tahun;
        System.out.println("Masukkkan tahun :");
        tahun = input04.nextInt();

        if ((tahun % 4) != 0) {
            System.out.println("Bukan Tahun kabisat");
        } else {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun kabisat");
                }
            }
        }
    }
}
