import java.util.Scanner;


public class ej17 {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("ingrese una oracion");
	        String n= scanner.nextLine();
	        
	        int cantPalabras= 1;
	        
	        
	        for(int i = n.length() -1 ; i >= 0; i--) {
	           char letra = n.charAt(i);
	        
	            if(letra == ' '){
	                cantPalabras++;
	            }
	        }
	    
	         System.out.println("La cantidad palabras son: "+cantPalabras);
	    }
	}
