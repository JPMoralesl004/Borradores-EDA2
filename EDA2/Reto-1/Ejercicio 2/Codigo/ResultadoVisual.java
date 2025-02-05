public class ResultadoVisual {
    private char[][] contenido;

    public ResultadoVisual(int filas, int columnas) {
        contenido = new char[filas][columnas];
    }

    public void combinar(Frame1 f1, Frame2 f2) {
        char[][] contenidoF1 = f1.getContenido();
        char[][] contenidoF2 = f2.getContenido();

        for (int i = 0; i < contenido.length; i++) {
            for (int j = 0; j < contenido[i].length; j++) {
                contenido[i][j] = (contenidoF1[i][j] != 0) ? contenidoF1[i][j] : contenidoF2[i][j];
            }
        }
    }

    public char[][] getContenido() {
        return contenido;
    }
}