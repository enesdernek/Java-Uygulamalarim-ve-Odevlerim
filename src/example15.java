/*1.Başla
2.Sayı al.
3.Eğer sayı%2 = 0 ise sayı çift yazdır.
4.Aksi takdirde sayı tek yazdır.
5.Bitir.
*/
import java.util.Scanner;
public class example15 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();
        
        int sonuc = sayi%2;
        
       if(sonuc == 0 ){
           System.out.println(sayi +" Sayısı çifttir.");
       }
       
       else{
           System.out.println(sayi + " Sayısı tektir.");
       }
        
        
    }

}
