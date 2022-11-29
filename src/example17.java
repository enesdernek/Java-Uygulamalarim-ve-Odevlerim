
/*1.Başla.
2. Sayı al
3. Girilen sayının değerine göre koşul yapıalrını oluştur ve sayının durumunu yazdır.
7.bitir.
*/
import java.util.Scanner;
public class example17 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        double a = input.nextDouble();
        
        if (a>0) {
            System.out.println("Girdiğiniz sayı pozitiftir.");
        }
        else if (a ==0) {
            System.out.println("Girdiğiniz sayı 0'dır.");
        }
        else{
            System.out.println("Girdiğiniz sayı negatiftir.");
        }
        
    }

}
