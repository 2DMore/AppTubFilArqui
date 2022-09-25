/*

 */
package filtros;

import arquitectura.Filtro;

/**
 *
 * @author picar
 */
public class FiltroPrueba1 extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        String[] args = (String[])entrada;
        String retornar="|";
        for(String s: args){
            retornar+=s+"|";
        }
        return retornar;
    }
    
}
