import java.util.Scanner;

public class ej4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        // pedir un numero entero positivo
        System.out.println("Ingrese un numero entero positivo:");
        n = scanner.nextInt();

        while(n <= 0) { // validar que sea positivo
            System.out.println("ingrese un numero mayor que cero:");
            n = scanner.nextInt();
        }

        // recorrer desde 1 hasta n
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sumaPares += i; // si es par sumar a pares
            } else {
                sumaImpares += i; // si es impar sumar a impares
            }
        }

        // mostrar resultados
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
}
