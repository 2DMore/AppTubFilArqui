package filtros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import arquitectura.Filtro;

public class LectorLineaArchivo extends Filtro {

    @Override
    protected Object procesar(Object entrada) {
        String args = (String)entrada;
        String contenido=null;
        try {
            contenido = obtenerContenido(args);
        } catch (FileNotFoundException e) {
           System.out.println("Archivo no encontrado: " +args);
           System.exit(0);
        }
        return contenido;
    }
    
    private static String obtenerContenido(String ruta) throws FileNotFoundException{
        String linea=null;
        File archivo = new File(ruta);
        
        Scanner  lector = new Scanner(archivo);
        if(lector.hasNext()){
            linea = lector.nextLine();   
        }
        lector.close(); 
        return linea;
        
        
    }
    
}
