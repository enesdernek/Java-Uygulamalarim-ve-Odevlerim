import java.util.Scanner;
public class example38 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir değer giriniz : ");
        int x = input.nextInt();
        int sonuc = (x*x)-(5*x)+3;
        if (sonuc>0) {
            System.out.println("pozitif");
        }
        else if (sonuc ==0) {
            System.out.println("sonuç 0");
        }
        else if (sonuc<0) {
            System.out.println("sonuç negatif");
        }
    }

}
