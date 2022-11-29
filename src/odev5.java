//girilen sayı kadar fibonacci dizisi içinde dönüp asal olan elemanları yazdırma.

import java.util.Scanner;

public class odev5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci dizisi olsun :");
        int miktar = input.nextInt();
        int a = 1;
        int b = 1;
        for (int i = 0; i < miktar - 2; i++) {
            boolean kontrol = true;
            int c = a + b;
            a = b;
            b = c;

            for (int j = 2; j < c; j++) {
                if (c % j == 0) {
                    kontrol = false;

                }
            }
            if (kontrol) {
                System.out.println(c + "sayısı asaldır.");
            }

        }

    }

}
