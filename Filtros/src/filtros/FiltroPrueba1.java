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
        String retornar = "Prueba de filtro: "+(String)entrada;
        return retornar;
    }
    
}
