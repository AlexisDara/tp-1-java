public class ej24{
    public static void main(String[] args) {
        // Creamos un arreglo de 5 provincias argentinas
        String[] provincias = {"Buenos Aires", "Cordoba", "Santa Fe", "Mendoza", "Tucuman"};

        // Recorremos el arreglo con un bucle for-each
        // Este tipo de bucle es util cuando queremos acceder a todos los elementos de una coleccion sin preocuparnos por el indice
     
       for (String provincia : provincias) {
            // En cada iteracion provincia toma el valor de uno de los elementos del arreglo
            
            // imprime un saludo personalizado para cada provincia
            System.out.println("¡Hola, " + provincia + "!");
        }
    }
}

