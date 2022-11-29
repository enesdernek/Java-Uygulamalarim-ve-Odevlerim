import java.util.Scanner;
public class example39 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz : ");
        int a = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        int b = input.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz : ");
        int c = input.nextInt();
        
        int sonuc1 = a%10;
        int sonuc2 = b%10;
        int sonuc3 = c%10;
        
        System.out.println("girilen sayıların birler basamağı toplamı ="+(sonuc1+sonuc2+sonuc3));
    }

}
