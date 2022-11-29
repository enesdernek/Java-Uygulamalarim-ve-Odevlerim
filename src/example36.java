// asallık kontroü
import java.util.Scanner;
public class example36 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();
        
        for (int i = 2; i >=0; i++) {
             if(sayi%i!=0 || sayi==2){
                System.out.println("asal");
                break;
            }
             else if(sayi%i==0) {
                System.out.println("asal değil");
                break;
            }
            else if (sayi==1 || sayi ==0 || sayi<0) {
                System.out.println("asal değil");
                break;
            }
           
        }
        
    }

}
