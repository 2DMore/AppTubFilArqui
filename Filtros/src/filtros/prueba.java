/*

 */
package filtros;

import arquitectura.Tuberia;

/**
 *
 * @author picar
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tuberia tuberia = new Tuberia();
        
        tuberia.registrar(new FiltroPrueba1());
        tuberia.registrar(new FiltroPrueba2());
        
        tuberia.ejecutar("Como es que llegamos aqui");
    }
    
}
