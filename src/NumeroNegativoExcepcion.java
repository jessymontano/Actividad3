/*
III. Define una clase “NumeroNegativoExcepcion” que herede de “Exception” y que contenga un constructor
sin parámetros y un constructor que reciba como parámetro una “String”, de tal modo que ambos invoquen a
 los constructores de la clase “Exception” correspondientes.
 */

public class NumeroNegativoExcepcion extends Exception{
    public NumeroNegativoExcepcion(){
        super();
    }
    public NumeroNegativoExcepcion(String mensaje){
        super(mensaje);
    }
}
