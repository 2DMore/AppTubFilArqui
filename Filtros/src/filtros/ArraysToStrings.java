/*

 */
package filtros;

import arquitectura.Filtro;
import java.util.ArrayList;

/**
 *
 * @author picar
 */
public class ArraysToStrings extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        ArrayList<String[]> cadenas = (ArrayList<String[]>)entrada;
        Filtro procesar = new ArrayToString();
        ArrayList<String> devolver = new ArrayList();
        for(String[] arregloActual:cadenas){
            devolver.add((String) procesar.ejecutar(arregloActual));
        }
        return devolver;
    }
    
}
