public class Main {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla("Mi Pantalla");

        Frame1 f1 = new Frame1(3, 3);
        Frame2 f2 = new Frame2(3, 3);

        char[][] contenidoF1 = f1.getContenido();
        char[][] contenidoF2 = f2.getContenido();

        contenidoF1[0][0] = 'A';
        contenidoF1[1][1] = 'B';
        contenidoF1[2][2] = 'C';

        contenidoF2[0][2] = 'X';
        contenidoF2[1][1] = 'Y';
        contenidoF2[2][0] = 'Z';

        ResultadoVisual resultado = pantalla.getFrame(f1, f2);

        Buffer buffer = new Buffer();
        buffer.mostrarFrameEscogido(resultado);
    }
}