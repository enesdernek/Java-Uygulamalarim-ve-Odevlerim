import java.util.Scanner;
 /*açısal momentum hesaplayan program
kullanıcıdan kütle al
kullanıcıdan yarıçap al
kullanıcıdan hız al
hepsini çarp
yazdır
*/


public class example11 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Lütfen kütle giriniz.");
        int m = input.nextInt();
        System.out.println("Lütfen yarıçap giriniz.");
        int r = input.nextInt();
        System.out.println("Lütfen hız giriniz.");
        int v = input.nextInt();
        
        int acisalmomentum = m*r*v;
        System.out.println("Açısal momentum değeri = "+ acisalmomentum);
        
    }
    
}
