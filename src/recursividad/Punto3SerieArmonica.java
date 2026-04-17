package recursividad;

import java.util.Scanner;

public class Punto3SerieArmonica {

    
    public double calcular(int n) {
        //primer término de la serie es 1/1 = 1
        if (n == 1) {
            return 1.0;
        } 
        // 1/n + suma de los anteriores
        else {
            return (1.0 / n) + calcular(n - 1);
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 3: Serie armonica (1 + 1/2 + ... + 1/n)");
        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Por favor ingresa un número mayor a 0.");
        } else {
            double resultado = calcular(n);
            System.out.printf("El resultado de la serie para n=%d es: %.4f\n", n, resultado);
        }
    }
}