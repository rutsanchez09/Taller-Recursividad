package recursividad;

import java.util.Scanner;

public class Punto10MultiplicacionSumas {

    
    public int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } 
        else {
            return a + multiplicar(a, b - 1);
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 10: Multiplicacion por sumas");
        System.out.print("Ingresa el primer número (a): ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número (b): ");
        int b = sc.nextInt();

        // Manejamos el signo para que funcione con negativos básicos
        int resultado = multiplicar(Math.abs(a), Math.abs(b));
        
        // Lógica simple para el signo final
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            resultado = -resultado;
        }

        System.out.println("El resultado de " + a + " * " + b + " es: " + resultado);
    }
}