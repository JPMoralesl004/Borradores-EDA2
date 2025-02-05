public class Pixel {
    private char[][] elementos;

    public Pixel(int filas, int columnas) {
        elementos = new char[filas][columnas];
    }

    public char[][] listaElementos() {
        return elementos;
    }
}