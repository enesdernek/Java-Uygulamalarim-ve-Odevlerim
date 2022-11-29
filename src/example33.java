//1 ile 99 arası 5 ile bölünen yazdırma
/*
1.Başla
2.i = 0
3.eğer i 5 ile bölünüyorsa yazdır
4. i = i+1;
5.Eğer i 1 ile 99 arasındaysa adım 3 e git
6.Yazdır.
7.Bitir
*/
import java.util.Scanner;
public class example33 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <= 99; i++) {
        if (i>=1 && i <=99) 
        {
        if (i%5==0)
        {
       System.out.println(i);
        }
            }
        }
        
    }

}
