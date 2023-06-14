/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Docente {
    private String nombre;
    private String id;

    public void establecerNombre(String d) {
        nombre = d;
    }

    public void establecerId(String d) {
        id = d;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerId() {
        return id;
    }
    
    
}
