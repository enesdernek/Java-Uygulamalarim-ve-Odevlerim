//girilen pozitif bir tamsayının basamaklarındaki sayıların toplamı
import java.util.Scanner;
public class example35 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen bir sayı giriniz.");
        int sayi = input.nextInt();
        int toplam =0;
        int i = 0;
        while(sayi>0){
            int kalan = sayi%10;
            toplam += kalan;
            sayi = sayi/10;
        }
        System.out.println(toplam);
         }
    }


