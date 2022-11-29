import java.util.Scanner;
public class example51 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("row sayısı girin.");
        int row = input.nextInt();
        
        int bosluk = 0;
        
        for (int i = row; i >=row; i--) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            if (2<bosluk && bosluk<6) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("*");
                }
            }
            System.out.println("");
            bosluk++;           
        }
        
        
        
        
        
    }

}
