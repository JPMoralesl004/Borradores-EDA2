public class Frame1 {
    private char[][] contenido;
    private Pixel posicionFrame;
    private Compuestos compuestos;

    public Frame1(int filas, int columnas) {
        contenido = new char[filas][columnas];
        posicionFrame = new Pixel(filas, columnas);
        compuestos = new Compuestos(filas, columnas);
    }

    public char[][] getContenido() {
        return contenido;
    }

    public char[][] getListaColores() {
        return compuestos.getListaColores();
    }
}