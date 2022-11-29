import java.util.Scanner;
public class example52 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("row girin.");
        int row = input.nextInt();
        
        for (int i = 1; i <= row; i++) {
            if (i ==1 || i==row) {
                for (int j = 1; j <=row; j++) {
                    System.out.print("*");
                }
            }
            else   {
                for (int j = 1; j <= row; j++) {
                    if (j==1 || j==row) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

}
