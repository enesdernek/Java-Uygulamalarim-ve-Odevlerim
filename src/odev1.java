//Random sayıyı 10 hak verilerek tahmin etme uygulaması

import java.util.Random;
import java.util.Scanner;

public class odev1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        int sayi = rastgele.nextInt(100)+1 ;
        
        int haksayisi = 10;

        while (true) {
            System.out.println("Sayıyı tahmin ediniz.");
            int tahmin = input.nextInt();
            if (tahmin == sayi) {
                System.out.println("Doğru bildiniz !");
                break;
            } else {
                haksayisi--;
                System.out.println("Tekrar deneyiniz. Kalan hak :" + haksayisi);
            }
            if (haksayisi == 0) {
                System.out.println("Bilemediniz.");
                break;
            }
        }

    }

}
