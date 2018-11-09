
package commit3;
//Creamos la clase EmpleadoPorHoras que hereda atributos de Empleado
public class EmpleadoPorHoras extends Empleado{
    private int numero_horas=0; //Creamos los atributos unicos de la clase
    public double valor_horas=0;
//Creamos el constructor de nuestra clase
    public EmpleadoPorHoras(String n, String a, String c, double co,int nh,double vh) {
        super(n, a, c, co);
        setNumero_horas(nh);
        setValor_horas(vh);
    }
    //Setters y getters
    public int getNumero_horas() {
        return numero_horas;
    }

    public void setNumero_horas(int nh) {
        numero_horas=nh;
    }

    public double getValor_horas() {
        return valor_horas;
    }

    public void setValor_horas(double vh) {
        valor_horas = vh;
    }
    public double calcular_sueldo_final(){
        double a;
        a=(numero_horas*valor_horas)+comision;
        return a;
    }
        //Creamos el metodo toString para sobreescribir nuestra cadena junto con los atributos y el super para presentar la cadena heredada
    @Override 
    public String toString(){
        return String.format("%s - Numero de horas: %d\nValor Horas: %f\nSueldo: %f",super.toString(), getNumero_horas(), getValor_horas(), calcular_sueldo_final());
    }
}
