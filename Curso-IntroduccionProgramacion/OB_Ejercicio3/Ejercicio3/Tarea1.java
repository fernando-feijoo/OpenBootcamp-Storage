package Ejercicio3;
/**
 * EjerciciosTema3
 *  *Primera parte:
        -Crear una función con tres parámetros que sean números que se suman entre sí.
        -Llamar a la función en el main y darle valores.
 */
public class Tarea1 
{
    public static void main(String[] args) 
    {
        int n1 = 5, n2 = 93, n3 = 54;
        System.out.println("\nResultado: " + sumaNumeros(n1, n2, n3));
    }
    public static int sumaNumeros (int n1, int n2, int n3)    
    {
        return n1+n2+n3;
    }
}
