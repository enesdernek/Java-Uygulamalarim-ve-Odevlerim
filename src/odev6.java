//Fibonacci dizisi yazdırma

import java.util.Scanner;

public class odev6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci dizisi olsun :");
        int miktar = input.nextInt();
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < miktar - 2; i++) {

            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

}
