/*
1.Başla
2.Kullanıcıdan bir değer al
3.Kullanıcıdan alınan değere kadar sayıları 1'er artır ve bu sayıların karelerini  toplam üzerinde topla.
4.toplamı ekrana ayzdır.
5.bitir.
*/
import java.util.Scanner;
public class example26 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = input.nextInt();
        int karelerintoplami = 0;
        int a = 0 ;
        while(a<=sayi){
            int karesi = a*a;
            karelerintoplami += karesi;
            a= a + 1;
        }
        System.out.println(karelerintoplami);
    }

}
