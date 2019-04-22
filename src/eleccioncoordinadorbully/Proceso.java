/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccioncoordinadorbully;

import java.io.Serializable;

/**
 *
 * @author ark
 */
public class Proceso implements Serializable{
    
    private int id;
    private int puerto;
    private String direccion;
    private int estado;
    private String coordinador;

    public Proceso(int id, int puerto, String direccion) {
        this.id = id;
        this.puerto = puerto;
        this.direccion = direccion;
    }

    public Proceso(int id, int puerto, String direccion, int estado) {
        this.id = id;
        this.puerto = puerto;
        this.direccion = direccion;
        this.estado = estado;
        this.coordinador=null;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuerto() {
        return puerto;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }
    
    

    @Override
    public String toString() {
        return "Proceso{" + "id=" + id + ", puerto=" + puerto + ", direccion=" + direccion +  '}';
    }

    

}
