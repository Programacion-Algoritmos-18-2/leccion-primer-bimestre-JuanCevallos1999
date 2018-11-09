package commit3;
public class Empleado { //Creamos la clase empleado que es la clase padre
    private String nombre="",apellido="",cedula="";     //Colocamos los atributos que serán compartidos por todas nuestras clases
    public double comision=0;
//Creamos el constructor de la clase Empleado
    public Empleado(String n, String a, String c, double co){
        setNombre(n);
        setApellido(a);
        setCedula(c);
        setComision(co);
    }
 //Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String n) {
        apellido = n;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String n) {
        cedula = n;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double c) {
        comision = c;
    }
    //Creamos el metodo toString para sobreescribir nuestra cadena junto con los atributos
    @Override
    public String toString(){
        return String.format("Nombre: %s \n Apellido: %s \n Cedula: %s",getNombre(),getApellido(),getCedula());
    }
}
