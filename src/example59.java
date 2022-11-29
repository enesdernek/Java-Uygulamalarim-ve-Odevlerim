import java.util.Scanner;
public class example59 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satir");
        int satir = input.nextInt();
        System.out.println("sutun");
        int sutun = input.nextInt();
          int bosluk = sutun;
           int yildiz = 1;
        
        for (int i = 1; i <=satir; i++) {
         
            
            for (int j = 1; j <= bosluk-1; j++) {
                System.out.print(" ");
            }           
            for (int j = 1; j <= yildiz ; j++) {
                System.out.print("*");
            }
            bosluk--;
            yildiz++;
            System.out.println("");
        }
    }

}
