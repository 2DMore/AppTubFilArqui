package filtros;

import arquitectura.Filtro;

public class QuitarEspacios extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        String cadena = (String)entrada;
        cadena= cadena.trim().replaceAll("\\s{2,}", " ");
        return cadena;
    }
    
}
