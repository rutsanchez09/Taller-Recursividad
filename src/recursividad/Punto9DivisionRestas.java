package recursividad;

import java.util.Scanner;

public class Punto9DivisionRestas {

    /**
     * Método recursivo para calcular el cociente de a / b
     * @param a Dividendo
     * @param b Divisor
     * @return El cociente entero
     */
    public int calcularCociente(int a, int b) {
        // Caso Base: Si el dividendo es menor al divisor, ya no cabe ninguna vez.
        if (a < b) {
            return 0;
        } 
        // Caso Recursivo: 1 + la división del resto
        else {
            return 1 + calcularCociente(a - b, b);
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejerciio 9 : Division por restas");
        System.out.print("Ingresa el dividendo (a): ");
        int a = sc.nextInt();
        System.out.print("Ingresa el divisor (b): ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            int resultado = calcularCociente(Math.abs(a), Math.abs(b));
            System.out.println("El cociente de " + a + " / " + b + " es: " + resultado);
        }
        
    }
}