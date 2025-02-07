class Frame2 {
    private char[][] contenido;
    private Pixel posicion;
    
    public Frame2() {
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