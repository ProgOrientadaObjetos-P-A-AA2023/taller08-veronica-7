
package paquete1;
import java.util.Locale;
import java.util.Scanner;
import paquete2.DocenteFactura;
import paquete2.DocenteNombramiento;

public class Ejecutor1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
         System.out.printf("%s\n%s\n%s\n",
                "      >>Opciones<<     ",
                "1) Ingresar Docente Factura",
                "2) Ingresar Docente Nombramiento");

        int opcion = entrada.nextInt();
        entrada.nextLine();
        if (opcion < 1 || opcion > 2) {
            System.out.println("Ingrese una de las dos opciones!!");
        } else {
            if (opcion == 1) {
                ingresarDocenteFactura();
            } else {
                if (opcion == 2) {
                    ingresarDocenteNombramiento();
                }
            }
        }     
    }
    
    public static void ingresarDocenteFactura(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del docente:");
        String nombreDF = entrada.next();
        System.out.println("Ingresar el id:");
        String idDF = entrada.next();
        System.out.println("Ingrese el valor de la factura:");
        double valorF = entrada.nextDouble();
        
        DocenteFactura docenteF = new DocenteFactura();
        
        docenteF.establecerNombre(nombreDF);
        docenteF.establecerId(idDF);
        docenteF.establecerValorFactura(valorF);
        docenteF.establecerSueldoTotalF();
        
        System.out.printf("%s\n", docenteF);
        
    }

    public static void ingresarDocenteNombramiento(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del docente:");
        String nombreDN = entrada.next();
        System.out.println("Ingresar el id:");
        String idDN = entrada.next();
        System.out.println("Ingrese el suelo:");
        double sueldoN = entrada.nextDouble();
        System.out.println("Ingrese el valor de las horas extras:");
        double valHorasExtra = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de horas extras:");
        int horasExtras = entrada.nextInt();
        
        DocenteNombramiento docenteN = new DocenteNombramiento();
        
        docenteN.establecerNombre(nombreDN);
        docenteN.establecerId(idDN);
        docenteN.establecerSueldo(sueldoN);
        docenteN.establecerValHoraExtra(valHorasExtra);
        docenteN.establecerNumHoraEx(horasExtras);
        docenteN.establecerSueltoTotalN();
        
        System.out.printf("%s\n", docenteN );
        
    }
}
