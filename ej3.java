import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
		
	
	int numero = 0;
	boolean esPrimo = true; // asigna que son todos primos
		do {
			
			System.out.println("Ingrese numeros numeros hasta que se cumpla la condicion");
			numero = scanner.nextInt();
			esPrimo=true;
			for(int i = 2; i<numero; i++) {
				if(numero % i == 0) {
					esPrimo=false;
					break;
				}
			}

			
		}while(!(numero > 100 && esPrimo== true));
			System.out.println(numero + " es mayor a 100 y es primo");
		
		
		
		
		
	
}}
