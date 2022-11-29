import java.util.Scanner;
/*
 boy kilo endeksi
kullanıcıdan boy al
kullanıcıdan kilo al
matematiksel işlem ile indeksi al
endeksi ekrana yazdır.
 *
 * @author ENES
 */
public class example12 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen boyunuzu girin");
        double boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu girin");
        double kilo = input.nextDouble();
        
        double indeks = kilo / (boy*boy);
        
        System.out.println("Boy kilo indeksiniz = " + indeks);
        
                
        
    }
    
}
