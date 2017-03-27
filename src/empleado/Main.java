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
public class Main {
     public static void main(String[] args) {
     Empleado e1= new Empleado("jenny", 4156,56564,5485,"comprometida");
     Programador p1=new Programador (2,"java","lina", 41564,565464,54845,"soltera");
     Director d1=new Director (4,"juan",44156,565654,54785,"soltero");
     Empresa empresa=new Empresa();
     empresa.adicionarempleado(e1);
     empresa.adicionarempleado(p1);
     empresa.adicionarempleado(d1);
     empresa.imprimirempleado();
     
     }
}
