public class Frame2 {

    private char[][] contenido;
    private Pixel posicion;
    
    public Frame2() {
        System.out.println("Instanciando Frame2 correcto");
        contenido = new char[][] {
            { '.', '.', '#', '.' },
            { '+', '.', '.', '*' },
            { '#', '+', '*', '.' }
        };
    }
    
    public char[][] getContenido() {
        return contenido;
    }
    
    public Pixel getPosicion() {
        return posicion;
    }

}