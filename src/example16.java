/*1.Başla
2.ilk, ikinci ve üçüncü sayıyı al.
3.eğer sayi1 > sayi2 ve sayi1> sayi3 ise sayi1 yazdır.
4. eğer sayi2> sayi1" ve sayi2 > sayi3 ise sayi2 yazdır.
5. eğer sayi3 > sayi1" ve sayi3 > sayi1 ise sayi3 yazdır.
6. Aksi takdirde "en büyük sayı yok" yazdır.
7.Bitir.
*/


import java.util.Scanner;
public class example16 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("İlk sayıyı giriniz.");
        int sayi1 = input.nextInt();  
        System.out.println("İkinci sayıyı giriniz.");
        int sayi2= input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz.");
        int sayi3= input.nextInt();
        
        if(sayi1>sayi2 && sayi1 > sayi3){
            System.out.println(sayi1 +" En büyük sayıdır");
        }
        else if(sayi2>sayi1 && sayi2 > sayi3){
            System.out.println(sayi2 +" En büyük sayıdır");
        }
        else if(sayi3 >sayi1 && sayi3 > sayi2){
            System.out.println(sayi3 +" En büyük sayıdır");
        }
        else{
            System.out.println("En büyük sayı yok.");
        }
        
        

      
    }

}
