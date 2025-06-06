import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("elige el tipo de conversion:");
        System.out.println("1. celsius a fahrenheit");
        System.out.println("2. fahrenheit a celsius");
        System.out.print("opcion (1 o 2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("ingresa la temperatura en celsius: ");
            float celsius = scanner.nextFloat();
            float fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("la temperatura en fahrenheit es: " + fahrenheit);
        } else if (opcion == 2) {
            System.out.print("ingresa la temperatura en fahrenheit: ");
            float fahrenheit = scanner.nextFloat();
            float celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("la temperatura en celsius es: " + celsius);
        } else {
            System.out.println("opcion no valida");
        }
    }
}
