import java.util.Scanner;

public class ej15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000; // Saldo inicial
        int opcion;

        do {//repite hasta que el usuario solicite la opcion 4
            System.out.println("\n Ingrese una opcion para realizar:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese cantidad a depositar: ");
                    int deposito = scanner.nextInt();
                    if (deposito > 0) {
                        saldo = saldo + deposito;
                        System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Cantidad no valida.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese cantidad a retirar: ");
                    int retiro = scanner.nextInt();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo = saldo - retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes o cantidad no valida");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo"); // sale del programa
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
