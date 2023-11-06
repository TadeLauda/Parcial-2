import java.util.Random;
import java.util.Scanner;

public class CrearMatrices {
    public static char[][] crearMatriz() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ingrese valores de la matriz");
//        char valor = 0;
//        String letra = null;
//        char[][] matriz = new char[filas][columnas];
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas; j++) {
//                System.out.println("Valor [" + i + "] [" + j + "]");
//                letra = sc.next();
//                valor = letra.charAt(0);
//                matriz[i][j]=valor;
//            }
//        }
//        return matriz;
//    }

//        char[][] matriz = new char[filas][columnas];
        char[][] matriz = {
                {'T', 'T', 'T', 'T', 'C', 'A'},
                {'T', 'A', 'G', 'C', 'T', 'G'},
                {'G', 'T', 'G', 'A', 'T', 'G'},
                {'G', 'C', 'C', 'A', 'A', 'G'},
                {'G', 'T', 'C', 'C', 'T', 'C'},
                {'G', 'T', 'C', 'A', 'A', 'T'},
        };
//        Random rand = new Random();
//        for (int i=0; i < filas;  i++){
//            for (int j=0; j < columnas; j++){
//                int aleatorio = rand.nextInt(4);
//                char letra;
//                switch (aleatorio){
//                    case 0:
//                        letra = 'A';
//                        break;
//                    case 1:
//                        letra = 'C';
//                        break;
//                    case 2:
//                        letra = 'T';
//                        break;
//                    case 3:
//                        letra = 'G';
//                        break;
//                    default:
//                        letra = ' ';
//                        break;
//                }
//                matriz[i][j] = letra;
//            }
//        }
        return matriz;
    }

    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


