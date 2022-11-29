//girilen sayının palindrom sayı olup olmadığını bulan program
import java.util.Scanner;

public class odev12 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int palindrom = input.nextInt();
        int ilkdeger = palindrom;        
        int length = String.valueOf(palindrom).length();
         
        int kalan,deger=0;
        for (int i = 0; i<length; i++){
             
            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom /10;
        }
         
        if(deger == ilkdeger){
            System.out.println(deger + " Palindrom Sayidir.");
        }else{
            System.out.println(deger + " Palindrom Sayi Degildir.");
        }
        
    }

}
