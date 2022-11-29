import java.util.Scanner;
/* kullanıcıdan fahrenhayt değerini al
fahrenhaytı celciusa çevir
ekrana yaz
*/

public class example2 {

    
    public static void main(String[] args) {
       
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("Lütfen fahrenhayt değerini giriniz.");
         double fahrenhayt = input.nextDouble();
         
         double celcius =(fahrenhayt -32) /  1.8;
         
         
         System.out.println("celcius="+ celcius);
                 
                 
                 
          
                 
        
        
        
    }
    
}
