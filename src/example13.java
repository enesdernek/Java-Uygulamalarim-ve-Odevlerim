import java.util.Scanner;
/*küpün hacminin çeyreğini alan program
kullanıcıdan hacmin ilk ayrıtını al
kullanıcıdan hacmin ikinci ayrıtını al
kullanıcıdan hacmin üçüncü ayrıtını al
bütün ayrıtları çarpıp hacmi bul
hacmi 4'e böl
bulduğun sonucu ekrana yazdır.
*/

public class example13 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Lütfen ilk ayrıt uzunluğunu giriniz.");
        int a = input.nextInt();
        System.out.println("Lütfen ikinci ayrıtının uzunluğunu giriniz.");
        int b = input.nextInt();
        System.out.println("Lütfen ikinci ayrıtın uzunluğunu giriniz.");
        int c = input.nextInt();
        
        double hacim = a*b*c;
        double ceyrekhacim = hacim/4;
        
        System.out.println("Hacmin çeyreği = " + ceyrekhacim);
        
        
    }
    
}
