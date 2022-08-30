/*
Construye un programa con método main para probar la excepción.
Solicitar al usuario un valor numérico, si el valor es positivo calcular e imprimir de la raíz cuadrada.
Si es negativo, lanzar la excepción "NumeroNegativoExcepcion”.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws NumeroNegativoExcepcion{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double x = sc.nextDouble();

        if(x>0){
            System.out.println(Math.sqrt(x));
        }else{
            throw new NumeroNegativoExcepcion();
        }
    }
}
