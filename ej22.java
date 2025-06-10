import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[] calificaciones = new double[5];

      
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

    
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma = suma + calificacion;
        }

        // Calculo del promedio
        double promedio = suma / calificaciones.length;

        System.out.println("El promedio de las calificaciones es: " + promedio);

        scanner.close();
    }
}
