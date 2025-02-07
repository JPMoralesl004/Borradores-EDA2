class ResultadoVisual {

    private char[][] contenido;
    
    public ResultadoVisual(int height) {
        contenido = new char[height][14];
    }
    
    public void combinar(Frame1 f1, Frame2 f2) {
        char[][] c1 = f1.getContenido();
        char[][] c2 = f2.getContenido();
        
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c1[0].length; j++) {
                contenido[i][j * 2] = Compuesto.combinar(c1[i][j], c2[i][j]);
                contenido[i][j * 2 + 1] = ' ';
            }
        }
    }
    
    public void mostrarResultado() {
        for (char[] row : contenido) {
            System.out.println(new String(row));
        }
    }
    
    public static void main(String[] args) {
        Frame1 f1 = new Frame1();
        Frame2 f2 = new Frame2();
        
        ResultadoVisual rv = new ResultadoVisual(3);
        rv.combinar(f1, f2);
        rv.mostrarResultado();
    }
    
}