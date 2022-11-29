import java.util.Scanner;
 /*kullanıcının aylık harcamalarından maaşına ne kadar kaldığını
kirayı al
faturaları al
eğlence masraflarını al
topla ve çıkan sonucu maaştan çıkar.
yazdır
*/


public class example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        
        System.out.println("Lütfen maaşınızı giriniz.");
        int maas = input.nextInt();
        System.out.println("Kiranızı giriniz");
        int kira = input.nextInt();
        System.out.println("faturalarınızın tutarını giriniz.");
        int faturalar = input.nextInt();
        System.out.println("Eğlence tutarını giriniz.");
        int eglence = input.nextInt();
        
        int artakalan = maas-(faturalar+eglence+faturalar);
        
        System.out.println("Maaşınızdan arta kalan miktar = " + artakalan);
         
        
        
        
        
        
    }
    
}
