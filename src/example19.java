/* 
1.Başla
2.Kullanıcıdan ilk, ikinci ve üçüncü kenarın uzunluklarını al.
3. Uzunlukların durumuna göre üçgenin ikizkenar mı, eşkenar mı çeşitkenar mı olduğunu belirle.
4.Ekrana yazdır.
5.Bitir
*/

import java.util.Scanner;
public class example19 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Üçgenin ilk kenarını giriniz.");
        int a = input.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz.");
        int b = input.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz.");
        int c = input.nextInt();
        
        if (a == b  && a ==c) {
            System.out.println("Üçgen eşkenardır.");
        }
        else if(a==b && a!= c || a == c && a !=b || b == c && b !=a){
            System.out.println("Üçgen ikizkenardır.");
        }
        else if(a != b && a !=c && b != c){
            System.out.println("Üçgen çeşitkenardır.");
        }
        else{
            System.out.println("Geçersiz bir değer girdiniz.");
        }
    }

}
