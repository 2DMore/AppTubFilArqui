package filtros;

import java.util.ArrayList;

import arquitectura.Filtro;

public class GenerarVariaciones extends Filtro{
    ArrayList<String[]> devolver;

    @Override
    protected Object procesar(Object entrada) {
        devolver = new ArrayList<>();
        String[] palabras = (String[])entrada;
        devolver.add(palabras);

        String[] fraseActual= rotarArray(palabras);
        while(!ChecarFraseRepetida(fraseActual)){
            devolver.add(fraseActual);
            fraseActual = rotarArray(fraseActual);
        }
        return devolver;
    }
    
    private static String[] rotarArray(String[] palabras){
        String[] original = palabras.clone();
        String[] devolver = new String[original.length];

        devolver[0]= original[original.length-1];


        for(int i=0; i< original.length-1; i++){
            devolver[i+1] = original[i];
        }
        return devolver;

    }

    private boolean ChecarFraseRepetida(String[] rotacion){
        String[] p= devolver.get(0);
        return p.equals(rotacion);  
    }
    
}
