/* 1'den 10'a kadar olan sayıların toplamı ?
1.Başla
2.Toplam =0 
3. s= 1
4.eğer s>5 ise git adım 8
5.toplam = toplam+S
6.Git adım 4
7.Toplamı yazdır.
8.bitir
*/
public class example21 {
   
    public static void main(String[] args) {
        int sayi = 5;
        int toplam = 0 ;
        
        for (int i = 1; i<=sayi; i++) {
            toplam += i;
        }
        System.out.println(toplam);
    }

}
