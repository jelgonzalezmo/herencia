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
public class Empleado {

    protected String nombre;
    protected int edad;
    protected double salario;
    protected int identificacion;
    protected String estadocivil;
    private int x;

    public Empleado(String nombre, int edad, double salario, int identificacion, String estadocivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.identificacion = identificacion;
        this.estadocivil = estadocivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", identificacion=" + identificacion + ", estadocivil=" + estadocivil + '}';
    }

}
