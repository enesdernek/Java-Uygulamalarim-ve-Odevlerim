//Klavyeden girilen sayının heterometrik sayı olup olmadığını bulan program
import java.util.Scanner;


public class odev10 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int sayi = input.nextInt();
        boolean kontrol = true;
        for (int i = 0; i < sayi; i++) {
            if (sayi==i*(i+1)) {
                System.out.println("Heterometrik sayıdır.");
                kontrol = false;
                break;
            }
        }
        if (kontrol) {
            System.out.println("Heterometrik sayı değildir.");
        }
    }

}
