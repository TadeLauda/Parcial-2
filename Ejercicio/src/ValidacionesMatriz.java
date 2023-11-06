public class ValidacionesMatriz{

    static String cadenaComparar1 = "AAAA";
    static String cadenaComparar2 = "TTTT";
    static String cadenaComparar3 = "CCCC";
    static String cadenaComparar4 = "GGGG";

    public boolean esMutante(char[][] matriz){
        int count = 0;
        System.out.println("Hay "+validarFila(matriz)+" gen mutante en fila");
        System.out.println("Hay "+validarColumna(matriz)+" gen mutante en columnas");
        System.out.println("Hay "+validarDiagonal1(matriz)+" gen mutante diagonal arria a abajo");
        System.out.println("Hay "+validarDiagonal2(matriz)+" gen mutante diagonal abajo arriba");
        count += validarFila(matriz);
        count += validarColumna(matriz);
        count += validarDiagonal1(matriz);
        count += validarDiagonal2(matriz);

        return count>=2;
    }

    public int validarFila(char[][] matriz){
        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            String filaComoString = new String(matriz[i]);
            if (filaComoString.contains(cadenaComparar1)||filaComoString.contains(cadenaComparar2)||filaComoString.contains(cadenaComparar3)||filaComoString.contains(cadenaComparar4)) {
                count++;
            }
        }
        return count;
    }

    public int validarColumna(char[][] matriz){
        int count = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            StringBuilder columnaComoString = new StringBuilder();

            for (int i = 0; i < matriz.length; i++) {
                columnaComoString.append(matriz[i][j]);
            }

            String columnaString = columnaComoString.toString();

            if (columnaString.contains(cadenaComparar1)||columnaString.contains(cadenaComparar2)||columnaString.contains(cadenaComparar3)||columnaString.contains(cadenaComparar4)) {
                count++;
            }
        }
        return count;
    }
    public int validarDiagonal1(char[][] matriz) {
        int count = 0;
        for (int i = 0; i < matriz.length - 3; i++) {
            for (int j = 0; j < matriz[i].length - 3; j++) {
                if (matriz[i][j] == matriz[i+1][j+1] && matriz[i][j] == matriz[i+2][j+2] && matriz[i][j] == matriz[i+3][j+3]) {
                    count++;
                }
            }
        }
        return count;
    }

    public int validarDiagonal2(char[][] matriz) {
        int count = 0;
        for (int i = 3; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 3; j++) {
                if (matriz[i][j] == matriz[i-1][j+1] && matriz[i][j] == matriz[i-2][j+2] && matriz[i][j] == matriz[i-3][j+3]) {
                    count++;
                }
            }
        }
        return count;
    }

}
