import java.util.Scanner;
public class example31 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0 ;
        int toplam = 0 ;
        while(a<=n){
            if (a%7==0) {
                toplam += a;
            }
            a= a+1;
        }
        System.out.println(toplam);
    }

}
