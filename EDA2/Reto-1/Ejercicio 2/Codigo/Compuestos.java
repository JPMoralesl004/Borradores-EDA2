public class Compuestos {
    private char[][] listaColores;

    public Compuestos(int filas, int columnas) {
        listaColores = new char[filas][columnas];
    }

    public char[][] getListaColores() {
        return listaColores;
    }
}