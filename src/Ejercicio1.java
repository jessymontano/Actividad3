/*
I. Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente acción:

Recibe como parámetros una cadena (String) y un entero (int);
Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length(): int” de la clase “String”)
 devuelve el carácter en la posición correspondiente (puedes hacer uso del método “charAt(int)” de la clase “String”).
En caso contrario, construye y lanza una excepción de tipo “Exception”.
*/
public class Ejercicio1 {
    public static char caracterEn(String cadena, int num) throws Exception{
        if(num>=0 && num<=cadena.length()){
            return cadena.charAt(num-1);
        }else{
            throw new Exception();
        }

    }
}
