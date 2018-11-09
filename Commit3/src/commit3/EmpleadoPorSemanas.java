
package commit3;
//Creamos la clase que heredará atributos de la clase Empleado
public class EmpleadoPorSemanas extends Empleado{
    private int numero_semanas=0; //Creamos los atributos únicos de nuestra clase
    private double valor_semanas=0;
//Creamos el constructor que recibe con el super los valores heredados y ponemos los nuevos atributos
    public EmpleadoPorSemanas(String n, String a, String c, double co, int ns, double vs) {
        super(n, a, c, co);
        setNumero_semanas(ns);
        setValor_semanas(vs);
    }
    //Setter y getter
    public int getNumero_semanas() {
        return numero_semanas;
    }
    public void setNumero_semanas(int ns) {
        numero_semanas = ns;
    }
    public double getValor_semanas() {
        return valor_semanas;
    }
    public void setValor_semanas(double vs) {
        valor_semanas = vs;
    }
    public double calcular_sueldo_final(){
        return (numero_semanas*valor_semanas)+comision;
    }
     //Creamos el metodo toString para sobreescribir nuestra cadena junto con los atributos y el super para presentar la cadena heredada
    @Override
    public String toString(){
        return String.format("%s-\n Numero de semanas:%d\nValor por semana:%f\nSueldo: %f",super.toString(),
                getNumero_semanas(),getValor_semanas(),calcular_sueldo_final());
    }
}
