package filtros;

import java.util.ArrayList;

import arquitectura.Filtro;

public class imprimirArrayList extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        ArrayList<String[]> frases = (ArrayList<String[]>)entrada;
        for(String[] fraseActual:frases){
            for(String s: fraseActual){
                System.out.print(s+" ");
            }
            System.out.println();
        }
        return null;
    }
    
}
