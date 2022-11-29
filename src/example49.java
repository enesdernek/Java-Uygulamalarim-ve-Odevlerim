import java.util.Scanner;
public class example49 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       int row = 5;
       
        int bosluk = 4;
        for (int i = row; i >=1; i--) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < row-3; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            bosluk --;
            row++;
            
            
            
        }
    }

}
