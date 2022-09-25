/*

 */
package filtros;
import arquitectura.Filtro;

/**
 *
 * @author picar
 */
public class FiltroPrueba2 extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        System.out.println((String)entrada);
        return null;
    }
    
}
