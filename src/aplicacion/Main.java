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
public class Main {

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        String nombrest = teclado.next();
        String apellido = teclado.next();
        String direccion = teclado.next();
        int telefono = teclado.nextInt();
        String materia = teclado.next();
        Persona per = new Persona(nombrest, apellido, direccion, telefono);
        Profesor pro = new Profesor(nombrest, apellido, direccion, telefono);
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double nota4 = teclado.nextDouble();
        double[] notas = new double[4];
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        notas[4] = nota4;
        String nombrest1 = teclado.next();
        String apellido1 = teclado.next();
        String direccion1 = teclado.next();
        int telefono1 = teclado.nextInt();
        String materia1 = teclado.next();
        Estudiante est = new Estudiante(materia1,notas, pro, nombrest1, apellido1, direccion1, telefono1);
       

       

    }
}
