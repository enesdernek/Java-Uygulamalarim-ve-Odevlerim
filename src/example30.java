
import java.util.Scanner;
public class example30{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int n = input.nextInt();
        int s =0;
        int tektoplam = 0 ;
        int cifttoplam = 0;
        while(s<=n){
            if (s%2==1) {
                tektoplam = tektoplam +s;
            }
            else if (s%2==0) {
                cifttoplam = cifttoplam +s;
            }
 s = s+1;
        }
        System.out.println("Çift sayıların toplamı ="+ cifttoplam + " Tek sayıların toplamı ="+ tektoplam);
    }
}