import java.util.Scanner;
public class example46 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sütün = ?");
        int sutun = input.nextInt();
        System.out.println("satır=?");
        int satir = input.nextInt();
        
        for (int i = 0; i < sutun; i++) {
            System.out.print("*");
            for (int j = 0; j < (satir-1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
    }

}
