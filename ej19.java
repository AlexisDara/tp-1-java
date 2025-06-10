import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random random = new Random();

        // generar numero aleatorio entre 1 y 6 para cada dado
        int dado1 = random.nextInt(6) + 1; // 0–5 + 1 => 1–6
        int dado2 = random.nextInt(6) + 1;

        int suma = dado1 + dado2;

        // mostrar los resultados
        System.out.println("Resultado del primer dado: " + dado1);
        System.out.println("Resultado del segundo dado: " + dado2);
        System.out.println("Suma total: " + suma);
    }
}
