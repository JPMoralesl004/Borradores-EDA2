public class Pantalla {
    @SuppressWarnings("unused")
    private String clase;

    public Pantalla(String clase) {
        this.clase = clase;
    }

    public void getFrame(Frame1 frame1, Frame2 frame2, ResultadoVisual resultado) {
        System.out.println("Mostrando Frame 1:");
        frame1.posicionFrame();

        System.out.println("Mostrando Frame 2:");
        frame2.posicionFrame();

        System.out.println("Mostrando Resultado Combinado:");
        resultado.combinar(frame1, frame2);
    }

    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla("Pantalla");

        Frame1 frame1 = new Frame1(3, 7);
        Frame2 frame2 = new Frame2(3, 7);
        ResultadoVisual resultado = new ResultadoVisual(3, 7);

        pantalla.getFrame(frame1, frame2, resultado);
    }
}
