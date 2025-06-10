import java.util.Scanner;


public class ej12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("ingrese un numero de 3 cifras");
        String n= scanner.nextLine();
        
        int resultado =0;
        
        for(int i=0;i<n.length(); i++) {
           char num = n.charAt(i);
                
           if (Character.isDigit(num)) { // verifica si el character es un digito
               resultado += Character.getNumericValue(num); //trasforma el character a un int para sumarlo
           }

            }
        
    
         System.out.println("el resultado de la suma de sus cifras es:" + resultado);
    }
    
}

