//Random sayının artır azalt komutlarıyla bulunması
import java.util.Random;
import java.util.Scanner;



public class odev2 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        int sayi = rastgele.nextInt(100)+1 ;
        
        while(true){
            System.out.print("Tahmininizi giriniz :");
            int tahmin = input.nextInt();
            
            if(tahmin == sayi){
                System.out.println("Doğru bildiniz !");
                break;
            }
            else if(tahmin>sayi){
                System.out.println("Azalt");
            }
            else if(sayi>tahmin)
                System.out.println("Artır");
        }
        
    }

}
