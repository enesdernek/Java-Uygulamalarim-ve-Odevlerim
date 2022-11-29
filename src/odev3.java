
import java.util.Scanner;

public class odev3 {

    //pisagor üçlemesi
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("A'yı girin :");
        int a = input.nextInt();

        System.out.print("B'yi girin :");
        int b = input.nextInt();

        System.out.print("C'yi girin :");
        int c = input.nextInt();

        System.out.print("n'i girin :");
        int n = input.nextInt();
        
        if(a<b&&b<c&&(a*a+b*b==c*c)&&(a+b+c==n)){
            System.out.println("Grilen değerler pisagor üçlemesine uygundur !");
        }
        else{
            System.out.println("Girilen değerler pisagor üçlemesine uygun değildir !");
        }

       

    }

}
