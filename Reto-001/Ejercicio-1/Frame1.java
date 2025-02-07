class Frame1 {
    private char[][] contenido;
    private Pixel posicion;
    
    public Frame1() {
        contenido = new char[][] {
            { '.', '.', '.', '#', '#', '.', '.' },
            { '+', '+', '.', '.', '.', '.', '.' },
            { '#', '#', '#', '.', '.', '.', '.' }
        };
    }
    
    public char[][] getContenido() {
        return contenido;
    }
    
    public Pixel getPosicion() {
        return posicion;
    }
}