package Ejercicio4;

import java.util.Scanner;

/*
    En este ejercicio practicarás las estructuras de control, para ello deberás crear:


    Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

    Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque
    de código que tendrá el bucle deberá:

      -Incrementar el valor de la variable en uno cada vez que se ejecute.

      -Mostrarlo por pantalla cada vez que se ejecute.

    Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

    Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable 
    sea igual o menor que 3, se irá incrementando  en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

    Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la 
    que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
public class Tarea4 
{
    static Scanner tc = new Scanner(System.in);
    public static void main (String[] args) 
    {
        menu();
    }

    public static void condicionIf ()
    {
        System.out.println("\nCondicion If: \n");
        int numeroIf = 0;
        String dato = subMenu();
        if(dato != null)
        {
            numeroIf = Integer.parseInt(dato);
        }
        if (numeroIf > 0) 
        {
            System.out.println("\nEl numero ingresado es positivo.\n");
        } else if (numeroIf < 0)
        {
            System.out.println("\nEl numero ingresado es negativo.\n");
        } else
        {
            System.out.println("\nEl numero es 0.\n");
        }
    }

    public static void condicionWhile ()
    {
        System.out.println("\nCondicion While: \n");
        int numeroWhile = 0;
        String dato = subMenu();
        if(dato != null)
        {
            numeroWhile = Integer.parseInt(dato);
        }
        while (numeroWhile < 3) 
        {
            System.out.println("\nWhile ejecutado. Numero: " + numeroWhile);
            numeroWhile++;
        }
        System.out.println();
    }

    public static void condicionDoWhile ()
    {
        System.out.println("\nCondicion Do While: \n");
        int numeroDoWhile = 0, contador = 0;
        String dato = subMenu();
        if(dato != null)
        {
            numeroDoWhile = Integer.parseInt(dato);
        }
        do 
        {
            System.out.println("\nDo While ejecutado. Numero: " + numeroDoWhile);
        } while (contador != 0);
        System.out.println();
    }

    public static void condicionFor ()
    {
        System.out.println("\nCondicion For: \n");
        int numeroFor = 0;
        String dato = subMenu();
        if(dato != null)
        {
            numeroFor = Integer.parseInt(dato);
        }
        for (int i = 0; i <= 3; i++) 
        {
            System.out.println("\nFor ejecutado. Numero: " + numeroFor++);
        }
        System.out.println();
    }

    public static void condicionSwitch ()
    {
        System.out.println("\nCondicion Switch: \n");
        String estacionActual = "VERANO";
        String dato = subMenu();
        if(dato != null)
        {
            estacionActual = dato.toUpperCase();
        }
        switch (estacionActual) 
        {
            case "INVIERNO":
                System.out.println("\nLa estación acual es invierno.\n");
                break;
            case "VERANO":
                System.out.println("\nLa estación acual es verano.\n");
                break;
            case "OTOÑO":
                System.out.println("\nLa estación acual es otoño.\n");
                break;
            case "PRIMAVERA":
                System.out.println("\nLa estación acual es primavera.\n");
                break;
            default:
                System.out.println("\nNo coloco una estación del año. Coloque una correcta.\n");
                break;
        }
    }

    public static void menu ()
    {
        int opcion = 0;
        do
        {
            System.out.println("\n============================");
            System.out.println("| Ingrese una opcion:      |");
            System.out.println("| 1) Condicion If          |");
            System.out.println("| 2) Condicion While       |");
            System.out.println("| 3) Condicion Do While    |");
            System.out.println("| 4) Condicion For         |");
            System.out.println("| 5) Condicion Switch      |");
            System.out.println("| 6) Salir                 |");
            System.out.println("============================\n");
            do 
            {
                opcion = tc.nextInt();
                tc.nextLine();
                if (opcion < 0 || opcion > 6) 
                {
                    System.out.println("Ingrese una opcion correcta: ");
                }
            } while (opcion < 0 || opcion > 6);
            switch (opcion) 
            {
                case 1:
                    condicionIf();
                    break;
                case 2:
                    condicionWhile();
                    break;
                case 3:
                    condicionDoWhile();
                    break;
                case 4:
                    condicionFor();
                    break;
                case 5:
                    condicionSwitch();
                    break;
                default:
                System.out.println("\nGracias por usar nuestro sistema de Open Bootcamp. ❤");
                System.out.println("\nFernando F. Feijoo");
                    break;
            }
        }while(opcion != 6);
    }

    public static String subMenu ()
    {
        System.out.println("****************************");
        System.out.println("*                          *");
        System.out.println("* ¿Desea ingresar un dato? *");
        System.out.println("*                          *");
        System.out.println("*    1. Si                 *");
        System.out.println("*    2. NO                 *");
        System.out.println("*                          *");
        System.out.println("****************************\n");
        int opcion = tc.nextInt();
        tc.nextLine();
        do 
        {
            if (opcion == 1) 
            {
                System.out.println("\nIngrese el Dato:");
                String dato = tc.nextLine();
                return dato;
            }
            if (opcion < 0 || opcion > 2) 
            {
                System.out.println("\nIngrese una opcion correcta: \n");
            }
        } while (opcion < 0 || opcion > 2);
        return null;
    }
}