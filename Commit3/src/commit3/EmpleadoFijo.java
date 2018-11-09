package commit3;
public class EmpleadoFijo extends Empleado{ //Creamos la clase EmpleadoFijo que heredará atributos de Empleado
    private double sueldo_fijo=0,descuento_seguro=0; //Creamos los atributos de nuestra clase
    
    public EmpleadoFijo(String n, String a, String c, double co,double sf, double ds) { //Creamos el constructor usamos el super para las variables heredadas
        super(n, a, c, co);
        setSueldo_fijo(sf);
        setDescuento_seguro(ds);
    }
    //Seters y getters
    public double getSueldo_fijo() {
        return sueldo_fijo;
    }
    public void setSueldo_fijo(double sf) {
        sueldo_fijo = sf;
    }

    public double getDescuento_seguro() {
        return descuento_seguro;
    }

    public void setDescuento_seguro(double ds) {
        descuento_seguro = ds;
    }
    
    public double calcular_sueldo_final(){
        double a;
        a=(sueldo_fijo*descuento_seguro)/100;
        return sueldo_fijo-a+comision;
    } 
    @Override
        //Creamos el metodo toString para sobreescribir nuestra cadena junto con los atributos y el super que presentará la cadena heredada
    public String toString(){
        return String.format("%s -Sueldo%f\t\n-Descuento porcentaje %f\n-Sueldo:%f\n",super.toString(),
                getSueldo_fijo(),getDescuento_seguro(),calcular_sueldo_final());
    }
}
