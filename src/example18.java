/*
1.Başla
2.Kullanıcıdan 1 ve 7 arasında tamsayı değeri al.
3. girilen değere göre haftanın günlerini koşul yapısı ile eşleştir.
4.Ekrana girilen günü yazdır.
5.Bitir.
*/
import java.util.Scanner;
public class example18 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1 ile 7 arasında bir tam sayı giriniz : ");
        int a = input.nextInt();
        
        if (a == 1) {
            System.out.println("Girilen değer pazartesi gününe denk gelmektedir.");
        }
        else if (a == 2) {
                        System.out.println("Girilen değer salı gününe denk gelmektedir.");
        }
         else if (a == 3) {
                                    System.out.println("Girilen değer çarşamba gününe denk gelmektedir.");

        }
         else if ( a == 4) {
                                    System.out.println("Girilen değer perşembe gününe denk gelmektedir.");

        }
         else if (a == 5) {
                                    System.out.println("Girilen değer cuma gününe denk gelmektedir.");

        }
         else if (a == 6) {
                                    System.out.println("Girilen değer cumartesi gününe denk gelmektedir.");

        } else if (a == 7) {
                                    System.out.println("Girilen değer pazar gününe denk gelmektedir.");       
          }
        else{
                                    System.out.println("Hatalı bir değer girdiniz.");

        }
    }

}
