package recursividad;

import java.util.Scanner;

public class Punto11SumaArreglo {

    
    public int sumarVector(int[] vector, int n) {
        // Si el índice es 0, retorna el primer elemento
        if (n == 0) {
            return vector[0];
        } 
        // Elemento actual + suma de los anteriores
        else {
            return vector[n] + sumarVector(vector, n - 1);
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 11: Suma de elementos de un vector");
        System.out.print("¿Cuántos números desea ingresar?: ");
        int tam = sc.nextInt();

        int[] numeros = new int[tam];

        // se llena el arreglo
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese el valor para la posición [" + i + "]: ");
            numeros[i] = sc.nextInt();
        }

        
        if (tam > 0) {
            int resultado = sumarVector(numeros, tam - 1);
            System.out.println("\nLa suma de todos los elementos es: " + resultado);
        } else {
            System.out.println("El arreglo está vacío.");
        }
    }
}