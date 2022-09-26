package filtros;

import java.util.Arrays;

import arquitectura.Filtro;

public class QuitarPV extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        String[] palabras  =(String[])entrada;
        for(int i=0; i< palabras.length;i++){
            if(busquedaBinaria(Kwic.palabrasVacias, palabras[i])<0){
                palabras[i]="";
            }
        }
        return palabras;
    }
    

    private static int busquedaBinaria(String[] arreglo, String buscar){
        return Arrays.binarySearch(arreglo, buscar);
    }
}
