
import java.util.Scanner;
public class example50 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sutün sayısını giriniz.");
        int row = input.nextInt();
        int bosluk = row-1;
        for (int i = row; i >=1; i--) {
            for (int j = 0  ;  j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < row; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            bosluk --;
            row++;
            
            
            
        }
    }

}
