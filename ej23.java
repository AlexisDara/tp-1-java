import java.util.Scanner;

public class ej23{
    public static void main(String[] args) {
        // Arreglo con 5 provincias de Argentina
        String[] provincias = {"Buenos Aires", "Cordoba", "Santa Fe", "Mendoza", "Tucuman"};

        // Pedir al usuario que ingrese una provincia
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre de una provincia argentina para buscar: ");
        String busqueda = scanner.nextLine();

        // Buscar la provincia usando un bucle for-each
        boolean encontrada = false;
        for (String provincia : provincias) {
            if (provincia.equalsIgnoreCase(busqueda)) { //si encuentra la provincia, cambia el valor de encontrada a true
                encontrada = true;  
                break;
            }
        }

        
        if (encontrada) {
            System.out.println("La provincia fue encontrada");
        } else {
            System.out.println("La provincia no fue encontrada");
        }

        scanner.close();
    }
}
