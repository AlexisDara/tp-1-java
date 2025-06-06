import java.util.Scanner;

public class ej6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("ingrese una palabra");
        String n= scanner.nextLine();
        
        String nInvertido= "";
        
        
        for(int i = n.length() -1 ; i >= 0; i--) {
           nInvertido += n.charAt(i);
       
        }
    
         System.out.println(" palabra normal:" + n);// mostrar palabra ordenada
         System.out.println(" palabra invertida:" + nInvertido);// mostrar palabra invertida

    }
}
