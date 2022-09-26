/*

 */
package filtros;

import arquitectura.Filtro;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author picar
 */
public class Ordenar extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        ArrayList<String> arreglo = (ArrayList<String>)entrada;
        Collections.sort(arreglo);
        return arreglo;
    }
    
}
