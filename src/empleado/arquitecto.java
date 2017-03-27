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
public class arquitecto extends Empleado {
    private int cantidaddeproyectos;

    public arquitecto(int cantidaddeproyectos, String nombre, int edad, double salario, int identificacion, String estadocivil) {
        super(nombre, edad, salario, identificacion, estadocivil);
        this.cantidaddeproyectos = cantidaddeproyectos;
    }

    public int getCantidaddeproyectos() {
        return cantidaddeproyectos;
    }

    public void setCantidaddeproyectos(int cantidaddeproyectos) {
        this.cantidaddeproyectos = cantidaddeproyectos;
    }

    @Override
    public String toString() {
        return "arquitecto{" + "cantidaddeproyectos=" + cantidaddeproyectos + '}'+super.toString();
    }
    
}
