
import java.util.Scanner;

public class example43 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Payı giriniz : ");
        int pay = input.nextInt();
        System.out.print("Paydayı giriniz : ");
        int payda = input.nextInt();
        
        int a = pay/payda;
        int b = 0 ;
        System.out.print("Hangi basamağı öğrenmek istiyorsunuz  : ");
        int basamak = input.nextInt();
        for (int i = 1; i <= basamak; i++) {
            b = a%10;
            a = a/10;
            
        }
        System.out.println(b);

    }

}
