import java.io.*;
import java.util.*;

/*Lectura y escritura de texto plano:
 * Se le entregará un archivo de texto plano con dos párrafos en inglés,sin caracteres extraños.
 * Deberá crear los métodos para leer completo el archivo y añadir nueva línea al final del archivo.
 *
 *En esta tarea no se evaluará el modelado de clases, pero sitodo lo especificado en la primera página y
 *las pruebas unitarias. Solamente se entregará el texto en un archivo y un archivo complementario, que le servirá
 * de referencia para hacer las pruebas.
 *La “prueba de lectura” debe demostrar que el programa es capaz de leer textual el contenido del archivo, respetando saltos de línea, espacios blancos, etc.
 *La “prueba de añadir nueva línea” debe añadir al final la línea:
 *The first man who stepped on the moon.
 *  */
public class ReadText{
    private static Scanner scan;
    static String line;
    static Scanner keyboard= new Scanner(System.in);
    public static void main (String [] args){

        openFile();
        readFile();
        closeFile();
        line = createNewline();
        addNewLine(line);
    }

    /**
     * Metodo que abre el archivo "texto.txt"y maneja la excepción de no encontrar el archivo enviando un mensaje al usuario
     * */
    public static void openFile(){
        try{
            scan = new Scanner(new File("texto.txt"));
        }
        catch(Exception e){
            System.out.println("No se pudo encontrar le archivo");
        }
    }

    /*
     * Metodo que muestra por pantalla el contenido del archivo
     *
     */

    public static void readFile(){
        while(scan.hasNext()){
            System.out.print( scan.nextLine()+"\n");
        }
    }


    /**
     * Método que cierra el archivo
     */

    public static void closeFile(){
        scan.close();
    }

    /**
     * Método que lee por teclado la nueva linea que se desea agregar al final del texto
     * @ return newline  linea de texto que se desea agregar al final
     */
    public static String createNewline(){
        String newline= keyboard.nextLine();
        return newline;
    }

    /**
     * Método que cierra el archivo
     * @param txt linea  que se desea agregar al final del texto
     */
    public static void addNewLine(String txt){
        System.out.println("\n" + txt);
    }

}
