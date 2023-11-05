public class otro {
        public static void main(String[] args) {
            int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            };
    
            // Imprimir los resultados solicitados
            int a = matriz[matriz.length - 1][0];
            int length = matriz.length;
            int length2 = matriz[2].length;
            int b = matriz[0][matriz.length - 1];
    
            System.out.println("a[a.length-1][0] = " + a);
            System.out.println("a.length = " + length);
            System.out.println("a[2].length = " + length2);
            System.out.println("a[0][a.length-1] = " + b);
        }

    
}
