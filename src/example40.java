import java.util.Scanner;
public class example40 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi = input.nextInt();
        
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0) {
                  System.out.println(i);
            }
          
        }
        
    }

}
