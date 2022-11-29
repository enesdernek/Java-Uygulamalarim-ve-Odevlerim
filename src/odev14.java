//girilen sayının cullen sayısı olup olmadğını buylduran program
import java.util.Scanner;

public class odev14 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı girin.");
        boolean kontrol= true;
        int sayi = input.nextInt();
        int i = 0;
        while(i<sayi) {
            if(Math.pow(2,i)+1==sayi){
                System.out.println("cullen");
                kontrol = false;             
                break;
            } 
            
            i++;
        }
        if(kontrol){
            System.out.println("cullen değil");
        }
        
    }

}
