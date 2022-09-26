package filtros;

import arquitectura.Filtro;

public class separarPalabras extends Filtro {

    @Override
    protected Object procesar(Object entrada) {
        String e = (String)entrada;
        String[] separado  =e.split(" ");
        return separado;
    }
    
}
