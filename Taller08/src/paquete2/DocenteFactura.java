
package paquete2;

public class DocenteFactura extends Docente {
    private double valorFactura;
    private double ivaDesc;
    private double sueldoTotalF;

    public void establecerValorFactura(double d) {
        valorFactura = d;
    }

    public void establecerIvaDesc(double d) {
        ivaDesc = 0.10;
    }

    public void establecerSueldoTotalF() {
        sueldoTotalF = valorFactura - (valorFactura * ivaDesc);
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerIvaDesc() {
        return ivaDesc;
    }

    public double obtenerSueldoTotalF() {
        return sueldoTotalF;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Nombre del Docente: %s\nId: %s\n"
                + "Valor Factura: %.2f\nDescuento: %.2f\n"
                + "Total a cancelar: %.2f",
                obtenerNombre(), 
                obtenerId(),
                obtenerValorFactura(),
                obtenerIvaDesc(),
                obtenerSueldoTotalF());
        
        return reporte;
    }   
}