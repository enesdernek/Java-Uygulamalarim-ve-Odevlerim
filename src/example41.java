import java.util.Scanner;
public class example41 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı girin : ");
        int sayi = input.nextInt();
        int toplam = 0;
        int tektoplam = 0;
        int cifttoplam = 0;
        for (int i = 0; i <= sayi; i++) {
            toplam += i;
        }
        for (int i = 0; i <=sayi; i++) {
            if (i%2==0) {
                cifttoplam += i;
            }
        }
        for (int i = 0; i <= sayi; i++) {
            if (i%2==1) {
                tektoplam += i;
            }
        }
        System.out.println("toplam ="+toplam + "çifttoplam ="+cifttoplam+"tektoplam ="+tektoplam);
    }

}
