import java.util.Scanner;
/*Kullanıcıdan yarıçapı al
yarıçapı hacim denkleminde kullan
yarıçapı alan denkleminde kullan
alan ve hacimi ekrana yazdır.
*/
 

public class example6 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen kürenin yarıçapını giriniz.");
        double yaricap = input.nextDouble();
        
        double hacim = 4/3*3.14*yaricap*yaricap*yaricap;
        double alan = 4*3.14*yaricap*yaricap;
        
        System.out.println("Girmiş olduğunuz yarıçapa ait kürenin hacmi =" + hacim);
        System.out.println("Girmiş olduğunuz yarıçapa ait kürenin alanı =" + alan);

        
        
        
    }
    
}
