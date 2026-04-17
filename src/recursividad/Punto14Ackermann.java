package recursividad;

import java.util.Scanner;

public class Punto14Ackermann {

    
    public int calcular(int m, int n) {
        // Condición 1: Ackerman(m, n) = n + 1 si m = 0
        if (m == 0) {
            return n + 1;
        }
        // Condición 2: Ackerman(m, n) = Ackerman(m - 1, 1) si m > 0 y n = 0
        else if (m > 0 && n == 0) {
            return calcular(m - 1, 1);
        }
        // Condición 3: Ackerman(m, n) = Ackerman(m - 1, Ackerman(m, n - 1)) si m > 0 y n > 0
        else {
            return calcular(m - 1, calcular(m, n - 1));
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 14: Funcion de ackermann");
        System.out.print("Ingresa el valor de m: ");
        int m = sc.nextInt();
        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Ambos valores deben ser enteros no negativos.");
        } else {
            System.out.println("Calculando... (esto puede tardar para valores grandes)");
            int resultado = calcular(m, n);
            System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);
        }
    }
}