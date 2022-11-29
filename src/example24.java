// basit atm örneği(koşul ödevi)
/*
1.Kullanıcıdan isim ve şifre iste
2.Eğer isim ve şifre doğru ise 3. adıma yönlendir.
3.çekmek istediği para miktarını ya da yatırmak istediği para miktarını al
4.Bankada ne kadar parası kaldığını yazdır.
5.Bitir.
*/
import java.util.Scanner;
public class example24 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int miktar = 7000;
        String kullaniciadi = "ahmet";
        int sifre = 1234;
        System.out.print("Lütfen kullanıcı adınızı giriniz :");
        String alinankullaniciadi = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz :");
        int alinansifre = input.nextInt();
       
            
        if(alinansifre == 1234){
             System.out.println("Lütfen para çekmek için 1'i ,para yatırmak için 2'yi tuşlayın.");
            int tus = input.nextInt();
            if(tus ==1){
                System.out.print("Çekmek istediğiniz miktarı giriniz :");
                int cekilenmiktar = input.nextInt();
                
                if (cekilenmiktar<=7000 && cekilenmiktar >=0) {
                    int kalanpara = miktar - cekilenmiktar;
                    System.out.print("Bankada kalan miktar :"+ kalanpara);
                }
                else{
                    System.out.println("Çekmek istediğiniz ücret bakiyenizde mevcut değildir.");
                }
             
            }
            else if(tus == 2){
                System.out.println("Yatırmak istediğiniz miktarı giriniz.");
                int yatirilanmiktar = input.nextInt();
                int kalanpara = miktar + yatirilanmiktar;
                System.out.print("Bankada kalan miktar :"+ kalanpara);
        }
            
                
            }
        else{
            System.out.println("Girdiğiniz bilgiler yanlış.");
        }
    }

}
