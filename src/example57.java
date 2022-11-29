
public class example57 {
   
    public static void main(String[] args) {
        int row = 6;
        int bosluk = 4;
         int yildiz = 1;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
                 
            }
            bosluk--;
            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            yildiz++;
            System.out.println(" ");
            
        }
    }

}
