import java.util.Scanner;
public class example60 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci dizisinin sayısını giriniz.");
        int uzunluk = input.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a+" "+b);
        for (int i = 1; i <=uzunluk-2; i++) {
           int c = a+b;
            System.out.print(" "+c+" ");
            a = b;
            b = c;
            
        }
        System.out.println("");
    }

}
