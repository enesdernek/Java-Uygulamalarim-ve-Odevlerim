// Girilen sayının asal olup olmadığını bulan program
import java.util.Scanner;

public class odev18 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi = input.nextInt();
        boolean kontrol = true;
        
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                kontrol = false;
                break;
            }
        }
        
        if (kontrol) {
            System.out.println("Girilen sayı asaldır.");
        }
        else{
            System.out.println("Girilen sayı asal değidlir.");
        }
        
        
        
        
    }
    }
    