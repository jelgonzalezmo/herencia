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
public class Programador extends Empleado {
    private int numerolineasporhora;
    private String lenguaje;        

    public Programador(int numerolineasporhora, String lenguaje, String nombre, int edad, double salario, int identificacion, String estadocivil) {
        super(nombre, edad, salario, identificacion, estadocivil);
        this.numerolineasporhora = numerolineasporhora;
        this.lenguaje = lenguaje;
    }

    public int getNumerolineasporhora() {
        return numerolineasporhora;
    }

    public void setNumerolineasporhora(int numerolineasporhora) {
        this.numerolineasporhora = numerolineasporhora;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Programador{" + "numerolineasporhora=" + numerolineasporhora + ", lenguaje=" + lenguaje + '}'+super.toString();
    }

}
