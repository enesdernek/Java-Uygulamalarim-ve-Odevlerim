//Sayılarla üçgen
import java.util.Scanner;


public class odev4 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı girin.");
        int row = input.nextInt();
        int row2 = 2;
        
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j < row2; j++) {
                System.out.print(j);
            }
            System.out.println("");
            row2++;
        }
    }

}
