import java.util.Scanner;

public class ej7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("ingrese una oracion");
        String n= scanner.nextLine();
        
        int cantVocales= 0;
        int cantConsonantes=0;
        
        for(int i = n.length() -1 ; i >= 0; i--) {
           char letra = n.charAt(i);
        
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                cantVocales++;
            }else{
                cantConsonantes++;
            }
        }
    
         System.out.println("La cantidad de vocales son " + cantVocales + " y la cantidad de consonantes son " + cantConsonantes);
    }
}
