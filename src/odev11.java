//girilen sayıların markov sayısı oluşturup oluşturmadığını bulan program
import java.util.Scanner;

public class odev11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x'i girin :");
        int x = input.nextInt();

        System.out.print("y'i girin :");
        int y = input.nextInt();

        System.out.print("z'i girin :");
        int z = input.nextInt();

        if ((x * x) + (y * y) + (z * z) == (3 * x * y * z)) {
            System.out.println("Girilen sayılar Markov sayısı oluşturmaktadır");

        } else {
            System.out.println("Girilen sayılar markov sayısı oluşturmamaktadır.");
        }
    }
}
