import java.util.Scanner;
public class example55 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("row sayısı girin.");
        int row = input.nextInt();
          int a = 1;
        for (int i = 0; i < row; i++) {
          
            for (int j = 0; j < a; j++) {
                System.out.print("*");
                
            }
            a = a+1;
            System.out.println(" ");
        }
    }

}
