//girilen sayının leyland sayısı olup olmadğını bulan program
import java.util.Scanner;

public class odev16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı girin.");
        int sayi = input.nextInt();
        boolean kontrol = true;
        boolean kontrol2 = false;

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi; j++) {
                if (Math.pow(i, j) + Math.pow(j, i) == sayi) {
                    System.out.println("Girilen sayı leyland sayısıdır.");
                    kontrol = false;
                    kontrol2 = true;
                    break;
                }
                if (kontrol2) {
                    break;
                }
            }
        }
        if (kontrol) {
            System.out.println("Girilen sayı leyland sayısı değildir");
        }

    }

}
