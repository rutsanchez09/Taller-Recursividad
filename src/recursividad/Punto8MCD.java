package recursividad;

import java.util.Scanner;

public class Punto8MCD {

    public int calcularMCD(int m, int n) {
        //  Si el segundo número es 0, el MCD es m
        if (n == 0) {
            return m;
        } 
        //  MCD(n, residuo de m/n)
        else {
            return calcularMCD(n, m % n);
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 8: Maximo comun divisor");
        System.out.print("Ingresa el primer número (M): ");
        int m = sc.nextInt();
        System.out.print("Ingresa el segundo número (N): ");
        int n = sc.nextInt();

    
        int resultado = calcularMCD(Math.abs(m), Math.abs(n));

        System.out.println("El M.C.D. de " + m + " y " + n + " es: " + resultado);
        
    }
}