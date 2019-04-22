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
public class Mensaje implements Serializable{
    
    private int id;
    private int tipo;
    private int variable;

    public Mensaje(int id, int tipo, int variable) {
        this.id = id;
        this.tipo = tipo;
        this.variable = variable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", tipo=" + tipo + ", variable=" + variable + '}';
    }
    

}
