import java.util.Scanner;
public class example48 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      int row;
      
        do {
            System.out.println("Lütfen satır sayısı girin.");
           row = input.nextInt();
        } while (row<0);
        
        int bosluk_Sayac = 1;
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < bosluk_Sayac; j++) { //boşluk 
                System.out.print(" ");
            }
            for (int j = 1; j <= ((row-bosluk_Sayac)+1); j++) {
                System.out.print("*");
            }
            bosluk_Sayac += 1;
            System.out.println("");
        }
    }

}
