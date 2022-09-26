package filtros;

import java.text.Normalizer;
import arquitectura.Filtro;

public class NormalizarCadena extends Filtro {

    @Override
    protected Object procesar(Object entrada) {
        String cadena = (String)entrada;
        cadena =Normalizer.normalize(cadena, Normalizer.Form.NFD).replaceAll("[\u0300-\u0301]", "");
        cadena = cadena.toLowerCase();
        cadena= cadena.trim().replaceAll("\\s{2,}", " ");
        return cadena;
    }
    
}
