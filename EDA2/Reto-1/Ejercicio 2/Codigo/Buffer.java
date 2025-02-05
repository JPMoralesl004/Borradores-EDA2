public class Buffer {
    public void mostrarFrameEscogido(ResultadoVisual resultado) {
        char[][] contenido = resultado.getContenido();
        for (char[] fila : contenido) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}