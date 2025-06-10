import java.util.Scanner;

public class ej21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {1, 10, 20, 30, 40, 50, 60, 70, 80, 90};
      
        System.out.print("Ingrese un numero X: ");
        int x = scanner.nextInt();

        int contador = 0;

        for (int num : numeros) {
            if (num > x) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " elementos mayores que " + x + ".");

        scanner.close();
    }
}
