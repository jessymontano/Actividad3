/*
II. Construye un programa “main” en Java que realice las siguientes acciones:

Crea un objeto de la clase “Scanner” y lo asocia con la entrada estándar (la consola de MSDOS);
Lee un objeto de tipo “String” de la misma en un objeto “lectTeclado”;
Invoca al método “caracterEn” definido en el ejercicio anterior, con la “String” leída de la entrada estándar y el entero “7”,mostrándolo por pantalla;
Captura la posible excepción, mostrando por pantalla un mensaje: “Has intentado recuperar una posición de la cadena de caracteres que no existe;”.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectTeclado = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String s =  lectTeclado.nextLine();

        try{
            System.out.println(Ejercicio1.caracterEn(s, 7));
        } catch(Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}
