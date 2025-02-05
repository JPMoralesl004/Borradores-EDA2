public class Pantalla {
    private String nombre;

    public Pantalla(String nombre) {
        this.nombre = nombre;
    }

    public ResultadoVisual getFrame(Frame1 f1, Frame2 f2) {
        ResultadoVisual resultado = new ResultadoVisual(f1.getContenido().length, f1.getContenido()[0].length);
        resultado.combinar(f1, f2);
        return resultado;
    }
}