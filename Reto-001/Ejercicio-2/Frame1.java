public class Frame1 {

    private char[][] contenido;
    private Pixel posicion;
    
    public Frame1() {
        System.out.println("Instanciando Frame1 correcto");
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