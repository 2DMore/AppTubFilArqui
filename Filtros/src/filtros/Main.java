package filtros;

import arquitectura.Tuberia;

public class Main {
    public static void main(String[] args) {
        Tuberia tuberia = new Tuberia();

        tuberia.registrar(new setKwic());
        tuberia.registrar(new LectorLineaArchivo());
        tuberia.registrar(new NormalizarCadena());
        tuberia.registrar(new QuitarEspacios());
        tuberia.registrar(new separarPalabras());
        tuberia.registrar(new QuitarPV());
        tuberia.registrar(new ArrayToString());
        tuberia.registrar(new separarPalabras());
        tuberia.registrar(new GenerarVariaciones());
        tuberia.registrar(new imprimirArrayList());
        tuberia.ejecutar(args);


    }
    
}
