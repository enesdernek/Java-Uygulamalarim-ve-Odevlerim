// dellanoy sayıları = 1,3,13,63,321,1683,8989

import java.util.Scanner;

public class odev7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        int n = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int m = input.nextInt();

        int mislem = m + (m - 1) + (m - 1);
        int nislem = n + (n - 1) + (n - 1);
        int mntoplam = mislem + nislem;

        int[] dellanoy = {1, 3, 13, 63, 321, 1683, 8989};

        for (int deger : dellanoy) {
            if (deger == mntoplam) {
                System.out.println("Dellanoy sayısıdır !");
                break;
            } else {
                System.out.println("Dellanoy değildir.");
                break;
            }

        }

    }

}
