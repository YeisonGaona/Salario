package Controladores;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Clase encargada de controlar la vista principal
 *
 * @author jeiso
 */
@RequestScoped
@ManagedBean
public class ControladorFormulario {

    /**
     * Variable que se atribuye el nombre del empleado
     */
    private String nombre;

    /**
     * Variable que se atribuye al salario diario del empleado
     */
    private double salarioDia;

    /**
     * Variable que se atribuye los dias trabajados del empleado
     */
    private int diasTrabajados;

    /**
     * Variable que se atribuye los idiomas del empleado
     *
     */
    private ArrayList idiomas;

    /**
     * Constructor de la clase
     */
    public ControladorFormulario() {
        this.idiomas = new ArrayList();
    }

    /**
     * Funcion encargada de hacer la redireccion a la pgina informacion
     *
     * @return
     */
    public String redirigir() {
        return "informacion";
    }

    /**
     * Funcion que devuelve el nombre del empleado
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Funcion que cambia el nombre del empleado
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Funcion que devuelve el salario por dia del empleado
     * @return
     */
    public double getSalarioDia() {
        return salarioDia;
    }

    /**
     * Funcion que cambia el salario por dia del empleado
     * @param salarioDia
     */
    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

    /**
     * Funcion que devuelve los dias trabajados del empleado
     *
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
