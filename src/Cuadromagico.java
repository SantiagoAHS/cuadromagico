import java.util.Scanner;

public class Cuadromagico {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de la matriz : ");
        int filasA = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz : ");
        int columnasA = sc.nextInt();

        if (filasA != columnasA) {
            System.out.println("Debe ser una matriz cuadrada.");
            sc.close();
            return;
        }

        int[][] a = new int[filasA][columnasA];

        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------------------");
        System.out.println("La matriz: ");
        imprimirMatriz(a, filasA,columnasA);
        System.out.println("------------------------");

        // Verificar si la matriz es un cuadrado mágico
        if (esCuadroMagico(a, filasA, columnasA)) {
            System.out.println("La matriz es un cuadrado mágico.");
        } else {
            System.out.println("La matriz no es un cuadrado mágico.");
        }

        sc.close();
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para verificar si la matriz es un cuadrado mágico
    public static boolean esCuadroMagico(int[][] matriz, int filas, int columnas) {
        int sumadiagonal1 = 0;
        int sumadiagonal2 = 0;

        for (int i = 0; i < filas; i++) {
            sumadiagonal1 += matriz[i][i];
            sumadiagonal2 += matriz[i][columnas - i - 1];
        }

        if (sumadiagonal1 != sumadiagonal2) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            int sumafila = 0;
            int sumacolumna = 0;
            for (int j = 0; j < columnas; j++) {
                sumafila += matriz[i][j];
                sumacolumna += matriz[j][i];
            }
            if (sumafila != sumacolumna || sumafila != sumadiagonal1) {
                return false;
            }
        }
        return true;

    }

}