import java.util.Scanner;

public class Pemilihian2Percobaan104 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner (System.in);
        int tahun;
        System.out.println("Masukkkan tahun :");
        tahun = input04.nextInt(); 
    if ((tahun % 4) == 0) {
        if ((tahun % 100) !=0) 
             System.out.println("Tahun Kabiset");
    } else
        System.out.println("Bukan Tahun kabisat");   
        {
        }
    } 
}