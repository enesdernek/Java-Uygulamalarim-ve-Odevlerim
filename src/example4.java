import java.util.Scanner;
/*
kullanıcıdan kenar uzunluğu al
kullanıcıdan o kenara ait yüksekliği al
iki veriyi çarpıp ikiye böl
*/

public class example4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        
        System.out.println("Lütfen üçgenin kenar uzunluğunu giriniz.");
        int kenaruzunlugu = input.nextInt();
        System.out.print("Lütfen o kenara ait yüksekliği giriniz.");
        int kenaruzunluguyuksekligi = input.nextInt();
        
        int alan = ((kenaruzunlugu*kenaruzunluguyuksekligi) / 2 );
        
        System.out.println("Girdiğiniz bilgilerdeki üçgenin alanı = "+ alan );
        
        
        
        
    }
    
}
