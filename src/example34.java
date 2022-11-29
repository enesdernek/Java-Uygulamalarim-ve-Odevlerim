import java.util.Scanner;
public class example34 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lüten ilk sayıyı giriniz :");
        int s1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz :");
        int s2= input.nextInt();
        
        for (int i = 0; i >=0;  i++) {
            if (s1>i && s2<i && i%4 ==0) {
               
                System.out.println("4 bölünen "+ i);
            }
            else if (s1>i && s2<i && i%3 ==0) {
                System.out.println("3 ile bölünen "+i);
            }
        }
    }

}
