
package modelo;

import java.util.ArrayList;

/**
 * Clase encargada de calcular el salario del empleado
 * @author jeiso
 */
public class CalcularSalario {

    /**
     * Variable que atribuye el salario final del empleado
     */
    private double salario;
    
    /**
     * Variable que atribuye los dias trabajados del empleado
     */
    private int diasTrabajados;
    
    /**
     * Variable que atribuye los idiomas que tiene el empleado
     */
    private ArrayList idiomas;

    /**
     * Constructor de la clase
     * @param salario
     * @param diasTrabajados
     * @param idiomas 
     */
    public CalcularSalario(double salario, int diasTrabajados, ArrayList idiomas) {
        this.salario = salario;
        this.diasTrabajados = diasTrabajados;
        this.idiomas = idiomas;
    }
    
    /**
     * Funcion encargada de devolver los idiomas que tiene el usuario
     * @return 
     */
    public String idiomas(){
        String idioma=" ";
        for (int i = 0; i < idiomas.size(); i++) {
            idioma+=idiomas.get(i)+"  ";
        }
        if(idioma.equals(" ")){
            idioma="No registro ningun idioma";
        }
        return idioma;
    }

    /**
     * Funcion encargada de calcular el salario del empleado
     * @return 
     */
    public double calcularSalario() {
        salario = this.diasTrabajados * this.salario;
        for (int i = 0; i < idiomas.size(); i++) {
            if (idiomas.get(i).equals("espanol")) {
                salario += 80.000;
            };
            if (idiomas.get(i).equals("frances")) {
                salario += 110.000;
            };
            if (idiomas.get(i).equals("ingles")) {
                salario += 100.000;
            };
            if (idiomas.get(i).equals("mandarin")) {
                salario += 150.000;
            };
        }
        return salario;
    }

    /**
     * Funcion que devuelve el salario del empleado
     * @return 
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Funcion que cambia el salario del empleado
     * @param salario 
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Funcion que devuelve los dias trabajados del empleado
     * @return 
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * Funcion que cambia los dias trabajados del empleado
     * @param diasTrabajados 
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    /**
     * Funcion que devuelve los idiomas del empleado
     * @return 
     */
    public ArrayList getIdiomas() {
        return idiomas;
    }

    /**
     * Funcion que cambia los idiomas del empleado
     * @param idiomas 
     */
    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }
    
}
