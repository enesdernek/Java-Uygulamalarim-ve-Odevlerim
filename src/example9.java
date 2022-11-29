import java.util.Scanner;
/* Kullanıcının hangi yıl doğduğunu hesaplayan program*/
/*Kullanıcının yaşını al
2022 yılından o yaşı çıkart
ekrana yazdır
*/
public class example9 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("Lütfen yaşınızı giriniz.");
        int yas = input.nextInt();
        int yil = 2022-yas;
        System.out.println("Doğduğunuz yıl = " + yil);
        
        
    }
    
}
