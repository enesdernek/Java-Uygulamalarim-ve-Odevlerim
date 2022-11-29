import java.util.Scanner;

/*kullanıcıdan ilk sayıyı al
kullanıcıdan ikinci sayıyı al
kullanıcıdan üçüncü sayıyı al
hepsini topla
hepsini çarp
çarpım ve toplamlarını ekrana yazdır.
*/

public class example3 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("İlk sayıyı girin");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı girin");
        int sayi2 = input.nextInt();
        System.out.println("Üçüncü sayıyı girin");
        int sayi3 = input.nextInt();
        
        int toplam = (sayi1 + sayi2 + sayi3);
        
        int carpim = (sayi1*sayi2*sayi3);
        
        System.out.println("Sayıların toplamı = "+ toplam);
        System.out.println("Sayıların çarpımı ="+ carpim);
        
       
                
        
        
        
     
    }
    
}
