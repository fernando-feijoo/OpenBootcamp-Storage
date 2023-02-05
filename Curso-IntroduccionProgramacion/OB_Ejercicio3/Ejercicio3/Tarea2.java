package Ejercicio3;
/**
 * *Segunda parte:
        -Crear una clase coche.
        -Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        -Una función que incremente el número de puertas que tiene el coche.
        -Crear un objeto miCoche en el main y añadirle una puerta.
        -Mostrar el número de puertas que tiene el objeto.
 */
public class Tarea2 
{
    public static void main(String[] args) 
    {
        int numPuertas = 2;
        Tarea2 miCoche = new Tarea2();
        System.out.println("\nResultado: " + miCoche.addPuetas(numPuertas));
    }
    public static int addPuetas (int puertas) 
    {
        return ++puertas;
    }   
}
