
package commit3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {//Metodo principal
        Scanner teclado = new Scanner(System.in); //Scanner para ingresar datos
        String nombre;
        double comision;//Variables que utilizaremos para llenar nuestros objetos
        Empleado e = new Empleado("Luis","Benitez","1001",0); //Creamos el objeto 1 y enviamos parametros
        System.out.println(e);
        System.out.println("Ingrese su nombre"); 
        nombre = teclado.next();
        EmpleadoPorHoras e1 = new EmpleadoPorHoras(nombre,"Andrade","111222333",0,15,20.2);//Enviamos parametros a nuestro nuebo objeto
        System.out.println(e1);
        System.out.println("Ingrese la comision");
        comision = teclado.nextDouble();
        EmpleadoFijo e2 = new EmpleadoFijo("Ana","Diaz"," ",comision,300.2,10);//Enviamos parametros a nuestro nuebo objeto
        System.out.println(e2);
    }
}
