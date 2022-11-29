import java.util.Scanner;
public class example53 {
   
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        int randomsayi = (int) (Math.random() * (max-min-1) + min);
        Scanner input = new Scanner(System.in);
        System.out.println("1 ile 99 arası sayı giriniz.");
      
      while(true){
              int sayi = input.nextInt();
        if (sayi>randomsayi) {
            System.out.println("azalt");
        }
        else if (randomsayi > sayi) {
            System.out.println("artır");
        }
        else if (randomsayi==sayi) {
              System.out.println("doğru");
              break;
          }
    }
    }

}
