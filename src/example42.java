//girilen syaının tersini yazdıran program
import java.util.Scanner;
public class example42 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int sayi = input.nextInt();
        int sayitersi= 0;
        while(sayi !=0){
            sayitersi = sayitersi * 10;
            sayitersi = sayitersi + sayi%10;
            sayi = sayi/10;
        }
        System.out.println(sayitersi);
        
    }

}
