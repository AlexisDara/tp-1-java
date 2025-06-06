/*2. Escribir por consola los números del 50 al 100 de la siguiente manera si es un numero primo
escribir primo, sino escribir sus divisores*/

public class ej2 {

	public static void main(String[] args) {
        for(int i = 50; i<=100;i++) { // For recorre 50 -> 100
        	boolean esPrimo = true; // asigna que son todos primos
        	for(int j=2;j<i;j++) { // divisores de 2 hasta -> i
        		if(i % j == 0) { //saber si I es divisible por j
        			esPrimo = false; // elimina los que no son primos
        			break; //sale de la linea
        		}
        	}
        	if(esPrimo == true) {// si es primo
        		System.out.println(i + " es primo");// imprime num + es primo
        	}else{ // si no es primo
        		System.out.println(i + " divisores: "); //imprime num + divisores
        		for(int k =2; k<=i;k++) {// recorre divisores de I y con k que empieza con 2
        			if(i % k == 0) { // sabe si es divisible 
        				System.out.print(k + " "); // imprime los numeros en una linea
        			}
        		}
        		System.out.println(""); // salto de linea
        	}
        	
        }
        
    }
}
