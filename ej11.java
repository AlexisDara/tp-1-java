import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año:");
        int n = scanner.nextInt();

        if ((n % 4 == 0) && ((n % 100 != 0) || (n % 400 == 0))) {
            System.out.println(n + " es un año bisiesto.");
        } else {
            System.out.println(n + " no es un año bisiesto.");
        }
    }
}
