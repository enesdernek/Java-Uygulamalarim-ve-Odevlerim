/*
1.Başla
2.Kullanıcıdan bir sayı al
3.Kullanıcıdan alınan sayıya kadar 1'den başlayarak sayıyı teker teker artır
4.Bu sayilar arasından tek sayıları alarak toplama değerine ekle.
5.Kullanıcıdan alınan sayıya gelince işlemi bitir.
6.Ekrana toplamı yazdır.
*/
import java.util.Scanner;
public class example25 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();
        
        int teksayitoplami =0;
        int a = 0 ;
        while(a<=sayi){
            if (a%2 == 1) {
                teksayitoplami += a;              
            }
            a = a+1;
        }
        System.out.println(teksayitoplami);
        
    }

}
