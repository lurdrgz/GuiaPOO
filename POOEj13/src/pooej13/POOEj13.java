
package pooej13;

import Entidades.Curso;
import Servicios.CursoServicio;

public class POOEj13 {

    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso curso1 = cs.crearCurso();
        
        cs.calcularGananciaSemanal(curso1);
               

    }
    
}
