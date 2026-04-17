package recursividad;

import java.util.Scanner;

public class Punto5SumaDigitos {

    
    public int sumar(int n) {
        // Si el número tiene un solo dígito 0 a 9
        if (n < 10) {
            return n;
        } 
        //  Se Toma el último dígito y llamamos con el resto
        else {
            return (n % 10) + sumar(n / 10);
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 5: Suma de digitos");
        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();

        // Por si  ingresa un negativo
        int numeroProcesar = Math.abs(n);
        int resultado = sumar(numeroProcesar);

        System.out.println("La suma de los dígitos de " + n + " es: " + resultado);
        
    }
}