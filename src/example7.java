import java.util.Scanner;/*
/*kullanıcıdan kütle al
kullanıcıdan hız al
kullanıcıdan yerden yükseklik al
potansiyel enerji ve kinetik enerji denklemlerinde bu verileri kullan
ekrana potansiyel ve kinetik enerjiyi yazdır.*/

 
public class example7 {

  
    public static void main(String[] args) {
     
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen cismin kütlesini giriniz.");
        double m = input.nextDouble();
        System.out.println("Lütfencismin hızını giriniz");
        double v = input.nextDouble();
        System.out.println("Lütfen cismin yerden yüksekliğini giriniz.");
        double h = input.nextDouble();
        
        double potansiyel = m*10*h;
        double kinetik = m*v*v/2;
        
        System.out.println("Girmiş olduğunuz cismin potansiyel enerjisi = "+ potansiyel);
        System.out.println("Girmiş olduğunuz cismin kinetik enerjisi = "+ kinetik);
        
                
    }
    
}
