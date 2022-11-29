//girilen iki sayının dost sayı olup olmadığını bulan program
import java.util.Scanner;

public class odev13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı girin :");
        int m = input.nextInt();
        System.out.print("ikinci sayıyı girin :");
        int n = input.nextInt();

        int mtambolen = 0;
        int ntambolen = 0;

        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                mtambolen +=i;
            }
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                ntambolen += i;
            }
        }

        if (ntambolen == m && mtambolen == n) {
            System.out.println("Girilen iki sayı dost sayıdır.");
        } else {
            System.out.println("Girilen iki sayı dost sayı değildir.");
        }

    }

}
