//girilen sayının fermat sayısı olup olmadığını bulan program
import java.util.Scanner;

public class odev15 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin.");
        int sayi = input.nextInt();
        boolean kontrol = true;
        int i = 0 ;
        while(i<=sayi){
            if(Math.pow(2,Math.pow(2,i))+1==sayi){
                System.out.println("Girilen sayı fermat sayısıdır.");
                kontrol = false;
                break;
            }
            i++;
        }  
        if(kontrol){
            System.out.println("Girilen sayı fermat sayısı değildir.");
        }
    }

}
