/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona {
    private String materia;
    private double [] notas; 
    private Profesor profe;      

    public Estudiante(String materia, double[] notas, Profesor profe, String nombre, String apellido, String direccion, int telefono) {
        super(nombre, apellido, direccion, telefono);
        this.materia = materia;
        this.notas = notas;
        this.profe = profe;
    }

  
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }
     public double promedio(){
     
         for (int i=0;i>notas.length;i++){
             double promedio =this.getNotas()[i];
             promedio+=promedio;
             return promedio;
     }
     }
}

