import java.util.Scanner;
public class example37 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Metre cinsinden bir uzunluk giriniz : ");
        double m = input.nextDouble();
        System.out.println("mm'ye çevirmek için 1, cm'ye çevirmek için 2, dm'ye çevirmek için 3 ve km'ye çevirmek için 4 'e basınız..");
        double secim = input.nextDouble();
        if (secim ==1) {
            double mm = m/1000;
            System.out.println(mm);
        }
        else if (secim ==2) {
            double cm = m/100;
            System.out.println(cm);
        }
        else if (secim ==3) {
            double dm = m/10;
            System.out.println(dm);
        }
        else if (secim==4) {
            double km = m*1000;
            System.out.println(km);
        }
    }

}
