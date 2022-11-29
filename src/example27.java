/*
1.Başla,
2.Kullanıcıdan ilk değeri al
3.Kullanıcıdan ikinci değeri al.
4.carpim tanımla 0'a eşitle.
5.sayi2'yi teker teker azaltarak sayı 1 kadar topla.
6.Toplamı ekrana yazdır.
7.Bitir.
*/
import java.util.Scanner;
public class example27 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz.");
        int sayi1=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        int sayi2 = input.nextInt();
        
        int carpim = 0;
       
        while(sayi2>0){
            carpim = carpim + sayi1;
            sayi2 -= 1;
        
        }
        System.out.println(carpim);
    }

}
