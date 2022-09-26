package filtros;

import java.util.Arrays;

import arquitectura.Filtro;

public class QuitarPV extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        String[] palabras  =(String[])entrada;
        for(int i=0; i< palabras.length;i++){
            int r=Arrays.binarySearch(Kwic.palabrasVacias, palabras[i]);
            if(r>=0){
                
                palabras[i]="";
            }
        }
        return palabras;
    }

}
