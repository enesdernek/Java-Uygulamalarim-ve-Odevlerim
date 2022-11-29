/*
1.Başla
2.Kullanıcıdan sayı al.(n)
3.a = 1 sonuc = 1
4. a<=n git adım 7
5.  sonuc *a
6. a = a+1
7. sonucu yazdır
8.bitir

*/


import  java.util.Scanner;
public class example32 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        long n = input.nextLong();
        long a = 1l;
        long sonuc = 1l;
        
         if (n==0) {
                System.out.println("Faktöriyel = 1");
            }
         else   {
        while (a<=n){
            sonuc *= a;
            a = a+1;
           
                    
        }
        
        System.out.println(n+"! ="+sonuc);
    }
         }
}
