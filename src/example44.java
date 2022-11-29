
import java.util.Scanner;

public class example44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı girin");
        int sayi = input.nextInt();
        int a = 0;
            for (int i = 1; sayi!=0; i++) {
                
            a = a+1;
            sayi = sayi/10;
        }
        System.out.println(a);

    }

}
