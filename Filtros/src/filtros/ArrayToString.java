package filtros;

import arquitectura.Filtro;

public class ArrayToString extends Filtro{
    @Override
    protected Object procesar(Object entrada) {
        String[] arreglo = (String[])entrada;
        String devolver=arreglo[0];
        for(int i=1;i< arreglo.length; i++){
            devolver+=" "+arreglo[i];
        }
        devolver= devolver.trim().replaceAll("\\s{2,}", " "); 
        return devolver;
    }
    

   
}
