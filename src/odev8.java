// Girilen sayının basamaklar toplamının bir fibonacci dizisi elamanına eşit mi değil mi hesaplama
import java.util.Scanner;

public class odev8 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();
        
        boolean kontrol = true;
              
        int basamaktoplam =0;
        
       while(sayi!=0){
          basamaktoplam =(sayi%10)+basamaktoplam;
          sayi = sayi/10;
           
       }
       
       int a = 1;
       int b = 1;
        for (int i = 0; i < 100; i++) {
            int c = a+b;
            a=b;
            b=c;
            
            if (c==basamaktoplam) {
                System.out.println("Girilen sayının basamaklar toplamı bir fibonacci dizisinin elemanına eşittir.");
                kontrol = false;
                break;
            }
        }
        if (kontrol) {
            System.out.println("Girilen sayının basamaklar toplamı bir fibonacci dizisi elemanına eşit değildir.");
        }
        
       
        
       
       
       
     
        
    }

}
