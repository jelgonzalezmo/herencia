/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Estudiante
 */
public class Director extends Empleado {
    private int anosdeexperencia;

    public Director(int añosdeexperencia, String nombre, int edad, double salario, int identificacion, String estadocivil) {
        super(nombre, edad, salario, identificacion, estadocivil);
        this.anosdeexperencia = añosdeexperencia;
    }

    public int getAñosdeexperencia() {
        return anosdeexperencia;
    }

    public void setAñosdeexperencia(int añosdeexperencia) {
        this.anosdeexperencia = añosdeexperencia;
    }

    @Override
    public String toString() {
        return "Director{" + "añosdeexperencia=" + anosdeexperencia + '}'+super.toString();
    }
    
}
