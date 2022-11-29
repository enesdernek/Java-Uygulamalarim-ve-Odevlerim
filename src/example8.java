import java.util.Scanner;
/*kullanıcıdan direnci al
kullanıcıdan akımı al
bu değerleri kullanarak gerilimi hesapla
gerilimi ekrana yazdır.
*/
 
public class example8 {

  
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Direnci giriniz.");
        double r = input.nextDouble();
        System.out.println("Akımı giriniz.");
        double i = input.nextDouble();
        
        double v = i*r;
        
        System.out.println("Gerilim değeri = " + v);

    }
    
}
