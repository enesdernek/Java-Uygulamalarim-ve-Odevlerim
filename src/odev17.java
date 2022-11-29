
import java.util.Scanner;

public class odev17 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("İlk sayıyı girin.");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı girin.");
        int sayi2 = input.nextInt();
        
        int abas1 = 0;
        int abas2 = 0;
        int bbas1 = 0;
        int bbas2 = 0;
        
        int sayac1 = 0;
        while(sayac1<1){
            sayi1 = sayi1%10;
            abas1 = sayi1;
            sayac1++;
        }
        
        int sayac2 = 0;
        while(sayac2<2){
            sayi1 -= sayi1%10;
            sayi1 = sayi1/10;
            abas2 = sayi1;
            
            sayac2++;
        }
        
        int sayac3 = 0;
        while(sayac3<1){
            sayi2 = sayi2%10;
            bbas1 = sayi2;
            sayac3++;
        }
        
        int sayac4 = 0;
        while(sayac4<2){
            sayi2 = sayi2%10;
            
            bbas2 = sayi2;
            
            sayac4++;
        }
        
        System.out.println(abas1+" "+abas2+" "+bbas1+" "+bbas2);
        
        
    }

}
