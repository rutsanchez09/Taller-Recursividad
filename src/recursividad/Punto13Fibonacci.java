package recursividad;

import java.util.Scanner;

public class Punto13Fibonacci {

    
    public int calcularFibonacci(int n) {
        // (1)
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // (2)
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 13: Serie de fibonnaci");
        System.out.print("Ingresa el límite de términos a mostrar: ");
        int limite = sc.nextInt();

        if (limite < 0) {
            System.out.println("Por favor ingresa un número mayor o igual a 0.");
        } else {
            System.out.print("Serie Fibonacci: ");
            for (int i = 0; i <= limite; i++) {
                System.out.print(calcularFibonacci(i) + (i == limite ? "" : ", "));
            }
        }
    }
}