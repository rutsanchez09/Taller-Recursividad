package recursividad;

import java.util.Scanner;

public class Punto12SumaMatriz {

    
    public int sumarMatriz(int[][] matriz, int i, int j) {
        // Caso Base Final: Si llegamos más allá de la última fila
        if (i == matriz.length) {
            return 0;
        }

        // Si terminamos una fila (j llega al final de las columnas)
        if (j == matriz[i].length) {
            // Salta a la siguiente fila y reinicia columna a 0
            return sumarMatriz(matriz, i + 1, 0);
        }

        // Valor actual + siguiente columna
        return matriz[i][j] + sumarMatriz(matriz, i, j + 1);
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ejercicio 12: Suma de elementos de una matriz");
        
        System.out.print("Ingrese número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        // Llenado de la matriz 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // empieza en la posición (0,0)
        int total = sumarMatriz(matriz, 0, 0);

        System.out.println("\nLa suma total de la matriz es: " + total);
    }
}