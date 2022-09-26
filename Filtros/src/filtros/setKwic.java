package filtros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import arquitectura.Filtro;

public class setKwic extends Filtro{

    @Override
    protected Object procesar(Object entrada) {
        String[] args = (String[])entrada;
        String[] contenido=null;
        try {
            contenido = obtenerContenido(args[1]);
        } catch (FileNotFoundException e) {
           System.out.println("Archivo no encontrado: " +args[1]);
           System.exit(0);
        }
        Kwic.palabrasVacias=contenido;
        return args[0];
    }
    
    private static String[] obtenerContenido(String ruta) throws FileNotFoundException{
        int lineas = lineasArchivo(ruta);
        String[] retornar = new String[lineas];
        
        File archivo = new File(ruta);
        Scanner  lector;
        lector = new Scanner(archivo);
        int i =0;
        while(lector.hasNextLine()){
            String linea = lector.nextLine();
            retornar[i] =linea;
            i++;
        }
        lector.close(); 
        return retornar;
    }
    

    private static int lineasArchivo(String ruta) throws FileNotFoundException{
        File archivo = new File(ruta);
        Scanner  lector;
        lector = new Scanner(archivo);
        int i=0;
        while(lector.hasNextLine()){
            lector.nextLine();
            i++;
        }
        lector.close();
        return i; 

    }


}
