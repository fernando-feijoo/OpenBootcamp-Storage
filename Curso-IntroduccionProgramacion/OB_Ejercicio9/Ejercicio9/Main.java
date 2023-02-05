package Ejercicio9;

/*
Enunciado del ejercicio:

    Crea una clase Persona con las siguientes variables:

      -La edad
      -El nombre
      -El teléfono

    Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá 
    la variable credito solo para esa clase.

    Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre
    y el credito, tienes que darles valor y mostrarlas por   pantalla.

    Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable 
    salario que solo tenga la clase Trabajador.
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Cliente cliente = new Cliente();
        cliente.datos();
        Trabajador trabajador = new Trabajador();
        trabajador.datos();
    }
}

class Persona 
{
    int edad;
    String nombre, telefono;
}

class Cliente extends Persona
{
    Double credito;
    public void datos()
    {
        edad = 26;
        telefono = "+593968985221";
        nombre = "Fernando F. Feijoo";
        credito = 2500.00;

        System.out.println("\n Cliente:\n\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Credito: " + credito);
    }
}

class Trabajador extends Persona
{
    Double salario;
    public void datos()
    {
        edad = 30;
        telefono = "+593987375649";
        nombre = "Dicxon F. Feijoo";
        salario = 5500.00;

        System.out.println("\nTrabajador:\n\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Salario: " + salario);
    }
}