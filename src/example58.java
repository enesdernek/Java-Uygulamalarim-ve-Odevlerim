import java.util.Scanner;
public class example58 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısı girin");
        int satir = input.nextInt();
        System.out.println("sütun sayısı girin");
        int sutun = input.nextInt();
        
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print("*");
               
            }
            sutun--;
            System.out.println("");
        }
    }

}
