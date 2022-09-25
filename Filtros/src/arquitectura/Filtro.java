
package arquitectura;

public abstract class Filtro {

    private Filtro siguiente;
    
    protected abstract Object procesar(Object entrada);

    public Object ejecutar(Object entrada) {
        Object valor = procesar(entrada);
        if( this.siguiente != null ) valor = this.siguiente.ejecutar(valor);
        return valor;
    }

    public void setSiguiente(Filtro filtroSiguiente) {
        this.siguiente = filtroSiguiente;
    }
    
}
