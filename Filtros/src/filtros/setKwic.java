package filtros;

import arquitectura.Filtro;

public class setKwic extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        String[] args = (String[])entrada;
        Kwic.archivoPV = args[1];
        return args[0];
    }
    
}
