
package paquete2;

public class DocenteNombramiento extends Docente {
    private double sueldo;
    private double valHoraExtra;
    private int numHoraEx;
    private double sueltoTotalN;

    public void establecerSueldo(double d) {
        sueldo = d;
    }

    public void establecerValHoraExtra(double d) {
        valHoraExtra = d;
    }

    public void establecerNumHoraEx(int d) {
        numHoraEx = d;
    }

    public void establecerSueltoTotalN() {
        sueltoTotalN = sueldo + (valHoraExtra * numHoraEx);
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerValHoraExtra() {
        return valHoraExtra;
    }

    public int obtenerNumHoraEx() {
        return numHoraEx;
    }

    public double obtenerSueltoTotalN() {
        return sueltoTotalN;
    }
    
    
    
    @Override
    public String toString(){
        String reporte = String.format("Nombre del Docente: %s\nId: %s\n"
                + "Sueldo: %.2f\nValor de las horas extras: %.2f\n"
                + "Cantidad de horas extras: %d\nSueldo total: %.2f",
                obtenerNombre(), 
                obtenerId(),
                obtenerSueldo(),
                obtenerValHoraExtra(),
                obtenerNumHoraEx(),
                obtenerSueltoTotalN());
        
        return reporte;
    } 
}