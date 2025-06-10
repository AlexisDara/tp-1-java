import java.util.Scanner;
import java.util.Random;

public class ej20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        System.out.print("Ingrese la longitud deseada para la contraseña: ");
        int longitud = scanner.nextInt();
      
        String contrasena = "";// Creamos una cadena vacia donde iremos construyendo la contraseña caracter por caracter

        for (int i = 0; i < longitud; i++) {// Bucle que se repite 'longitud' veces (tantas veces como el usuario pidio)
            int indice = random.nextInt(caracteres.length());  // Genera un numero aleatorio entre 0 y la longitud del string 'caracteres' - 1
            char caracter = caracteres.charAt(indice);  // Obtiene el caracter que esta en la posicion 'indice' del string 'caracteres'
            contrasena = contrasena + caracter;  // Agrega ese caracter a la contraseña actual
        }

        System.out.println("Contraseña generada: " + contrasena);

        scanner.close();
    }
}
