
package arquitectura;

public class Tuberia {
    
    private Filtro inicio;
    private static Filtro ultimo;
    
    public Object ejecutar(Object entrada) {
        return this.inicio.ejecutar(entrada);
    }
    
    public Tuberia registrar(Filtro filtro) {
        if ( vacio() ){
            this.inicio=this.ultimo = filtro;
        }else{
           ultimo.setSiguiente(filtro);
           ultimo=filtro;          
        }
        return this;
    }
    private boolean vacio(){
        return inicio==null;
    }
    
}
