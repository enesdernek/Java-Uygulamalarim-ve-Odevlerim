//Girilen sayının tau sayısı olup olmadığını bildiren program

import java.util.Scanner;

public class odev9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin :");
        int sayi = input.nextInt();
        int tambolen = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tambolen++;
            }
        }
        if (sayi % tambolen == 0) {
            System.out.println("Girilen sayı tau sayısıdır.");
        } else {
            System.out.println("Girilen sayı tau sayısı değildir.");
        }
    }

}
