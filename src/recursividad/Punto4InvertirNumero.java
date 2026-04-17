package recursividad;

import java.util.Scanner;

public class Punto4InvertirNumero {

    public void invertir(int n) {
        //Si tiene un solo dígito se imprime
        if (n < 10) {
            System.out.print(n);
        } 
        else {
            System.out.print(n % 10); // Saca el último dígito 
            invertir(n / 10);         // Llama a la función con lo que queda
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 4: Invertir numero");
        System.out.print("Ingresa un número entero: ");
        int n = sc.nextInt();

        System.out.print("El número " + n + " invertido es: ");
        if (n < 0) {
            System.out.print("-");
            invertir(Math.abs(n)); // Maneja números negativos
        } else {
            invertir(n);
        }
        System.out.println();
    }
}