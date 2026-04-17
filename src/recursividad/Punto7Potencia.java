package recursividad;

import java.util.Scanner;

public class Punto7Potencia {

    
    public int calcular(int base, int exponente) {
        // Un numero elevado a la 0 es 1
        if (exponente == 0) {
            return 1;
        } 
        else {
            return base * calcular(base, exponente - 1);
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 7: Potencia");
        System.out.print("Ingresa la base: ");
        int base = sc.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exp = sc.nextInt();

        if (exp < 0) {
            System.out.println("Este método solo soporta exponentes positivos.");
        } else {
            int resultado = calcular(base, exp);
            System.out.println(base + " elevado a la " + exp + " es: " + resultado);
        }
        
    }
}