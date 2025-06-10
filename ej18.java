import java.util.Scanner;


public class ej18 {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Ingrese un numero N para la altura del triangulo: ");
	        int N = scanner.nextInt();

	        // Generar el patron
	        for (int i = 1; i <= N; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // Salto de linea
	        }
	}
	}
