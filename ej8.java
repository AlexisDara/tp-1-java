import java.util.Scanner;
import java.util.Random;

public class ej8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numero = random.nextInt(100) + 1; // Genera un número aleatorio entre 0 y 99
        int intento = 0;
        int n = 0;

        System.out.println("Adivina el número (entre 1 y 100):");

        // repite hasta que el intento sea igual al numero aleatorio
        while(intento != numero) {
            intento = scanner.nextInt();
            n++; // suma intento

            if(intento < numero) {
                System.out.println("El numero es mayor");
            } else if(intento > numero) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("el numero ingresado es correncto, fueron " + n + " intentos.");
            }
        }      
    }    
}
