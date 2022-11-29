import java.util.Scanner;
 /*
kullanıcıdan derece cinsinden açı al
açıyı radyana çevir
açıyı gradyana .çevir
ekrana ikisini de yazdır.
*/
public class example5 {
    
   
    

    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
            System.out.println("Lütfen bir açı giriniz.");
       
           double aci = input.nextDouble();
           
           double radyan = ((aci*  3.14) / 180);
           
           double gradyan = aci / 360;
           
           System.out.println("Girmiş olduğunuz açının radyan değeri = "+ radyan);
           System.out.println("Girmiş olduğunuz açının gradyan değeri = "+ gradyan);
                   
                   
            
            

     
        
    }
    
}
