public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int filas = 0;
//        int columnas = 0;
//        boolean esCuadrado = false;
//
//        do {
//            System.out.println("Ingrese la cantidad de filas de la matriz");
//            filas = sc.nextInt();
//
//            System.out.println("Ingrese la cantidad de columnas de la matriz");
//            columnas = sc.nextInt();
//
//            if (filas != columnas){
//                System.out.println("La matriz debe de ser cuadrada");
//            }else{
//                esCuadrado = true;
//            }
//        }while (false);


        char[][] matriz1 = {
                {'T', 'T', 'T', 'T', 'C', 'A'},
                {'T', 'A', 'G', 'C', 'T', 'G'},
                {'G', 'T', 'G', 'A', 'T', 'G'},
                {'G', 'C', 'C', 'A', 'A', 'G'},
                {'G', 'T', 'C', 'C', 'T', 'C'},
                {'G', 'T', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 1: ");
        CrearMatrices.imprimirMatriz(matriz1);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz1))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz2 = {
                {'T', 'T', 'G', 'T', 'C', 'A'},
                {'T', 'A', 'G', 'C', 'T', 'G'},
                {'G', 'G', 'G', 'G', 'T', 'G'},
                {'T', 'C', 'C', 'A', 'A', 'G'},
                {'A', 'T', 'C', 'C', 'T', 'C'},
                {'C', 'T', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 2:");
        CrearMatrices.imprimirMatriz(matriz2);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz2))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz3 = {
                {'T', 'T', 'T', 'A', 'C', 'A'},
                {'T', 'T', 'G', 'C', 'C', 'G'},
                {'G', 'T', 'T', 'C', 'T', 'G'},
                {'G', 'C', 'C', 'T', 'A', 'G'},
                {'G', 'C', 'C', 'C', 'A', 'C'},
                {'G', 'T', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 3:");
        CrearMatrices.imprimirMatriz(matriz3);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz3))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz4 = {
                {'A', 'T', 'A', 'T', 'C', 'A'},
                {'T', 'A', 'G', 'C', 'T', 'G'},
                {'G', 'T', 'G', 'A', 'T', 'G'},
                {'C', 'C', 'C', 'A', 'A', 'G'},
                {'T', 'T', 'C', 'C', 'T', 'C'},
                {'G', 'T', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 4:");
        CrearMatrices.imprimirMatriz(matriz4);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz4))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz5 = {
                {'T', 'T', 'T', 'T', 'C', 'A'},
                {'T', 'A', 'G', 'C', 'T', 'G'},
                {'G', 'T', 'A', 'A', 'T', 'G'},
                {'G', 'C', 'C', 'A', 'G', 'G'},
                {'G', 'T', 'C', 'G', 'A', 'C'},
                {'G', 'T', 'G', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 5: ");
        CrearMatrices.imprimirMatriz(matriz5);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz5))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz6 = {
                {'T', 'T', 'A', 'T', 'C', 'A'},
                {'T', 'A', 'G', 'C', 'T', 'G'},
                {'G', 'T', 'G', 'A', 'T', 'G'},
                {'T', 'C', 'C', 'A', 'A', 'G'},
                {'G', 'T', 'C', 'C', 'T', 'C'},
                {'G', 'T', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 6: ");
        CrearMatrices.imprimirMatriz(matriz6);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz6))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz7 = {
                {'T', 'T', 'T', 'T', 'C', 'A'},
                {'T', 'A', 'A', 'A', 'A', 'G'},
                {'G', 'T', 'G', 'A', 'T', 'G'},
                {'G', 'C', 'C', 'C', 'C', 'G'},
                {'G', 'T', 'C', 'C', 'T', 'G'},
                {'G', 'T', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 7: ");
        CrearMatrices.imprimirMatriz(matriz7);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz7))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz8 = {
                {'A', 'T', 'C', 'A', 'C', 'A'},
                {'C', 'A', 'G', 'A', 'T', 'G'},
                {'G', 'T', 'G', 'A', 'T', 'G'},
                {'G', 'C', 'C', 'A', 'A', 'G'},
                {'G', 'G', 'C', 'C', 'T', 'C'},
                {'G', 'T', 'G', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 8: ");
        CrearMatrices.imprimirMatriz(matriz8);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz8))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz9 = {
                {'T', 'T', 'A', 'T', 'C', 'A'},
                {'T', 'A', 'G', 'C', 'A', 'G'},
                {'G', 'T', 'G', 'A', 'T', 'G'},
                {'G', 'C', 'A', 'A', 'A', 'A'},
                {'A', 'T', 'C', 'C', 'T', 'C'},
                {'G', 'T', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 9: ");
        CrearMatrices.imprimirMatriz(matriz9);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz9))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz10 = {
                {'T', 'C', 'T', 'G', 'C', 'A'},
                {'T', 'A', 'G', 'G', 'G', 'G'},
                {'G', 'T', 'G', 'A', 'T', 'G'},
                {'G', 'C', 'C', 'A', 'A', 'G'},
                {'G', 'T', 'C', 'C', 'T', 'C'},
                {'G', 'T', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 10: ");
        CrearMatrices.imprimirMatriz(matriz10);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz10))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }

        System.out.println();

        char[][] matriz11 = {
                {'T', 'A', 'T', 'G', 'C', 'A'},
                {'T', 'A', 'G', 'C', 'T', 'G'},
                {'G', 'T', 'G', 'A', 'C', 'G'},
                {'T', 'C', 'C', 'C', 'A', 'G'},
                {'T', 'T', 'C', 'C', 'T', 'C'},
                {'G', 'C', 'C', 'A', 'A', 'T'},
        };
        System.out.println("Matriz 11: ");
        CrearMatrices.imprimirMatriz(matriz11);
        System.out.println();

        try {
            ValidacionesMatriz validacionesMatriz = new ValidacionesMatriz();
            if (validacionesMatriz.esMutante(matriz11))
                System.out.println("Es mutante\n");
            else
                System.out.println("No es mutante\n");
        }catch (Exception e){
            System.out.println("Invalid matrix: " + e.getMessage());
        }
    }

}
