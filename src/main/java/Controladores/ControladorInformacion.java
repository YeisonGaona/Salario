package Controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import modelo.CalcularSalario;

/**
 * Clase encargada de controlar la vista informacion
 *
 * @author jeison gaona
 */
@RequestScoped
@ManagedBean
public class ControladorInformacion {

    /**
     * Variable que hace referencia a el bean controlador de formulario
     */
    @ManagedProperty("#{controladorFormulario}")
    private ControladorFormulario controladorFormulario;

    /**
     * Variable que hace referencia a la clase calcular
     */
    CalcularSalario calcular;

    /**
     * Constructor de la clase
     */
    public ControladorInformacion() {
    }

    /**
     * funcion que devuelve el salario calculado
     *
     * @return
     */
    public double calcularSalario() {
        calcular = new CalcularSalario(controladorFormulario.getSalarioDia(), controladorFormulario.getDiasTrabajados(), controladorFormulario.getIdiomas());
        return calcular.calcularSalario();
    }

    /**
     * Funcion que se encargar de hacer la redireccion
     *
     * @return
     */
    public String volver() {
        return "index";
    }

    /**
     * Funcion encargada de traer los idiomas seleccionados
     * @return
     */
    public String idiomasHablados() {
        calcular = new CalcularSalario(controladorFormulario.getSalarioDia(), controladorFormulario.getDiasTrabajados(), controladorFormulario.getIdiomas());
        return calcular.idiomas();
    }

    /**
     * Funcion que devuelve el controlador de formulario
     * @return 
     */
    public ControladorFormulario getControladorFormulario() {
        return controladorFormulario;
    }

    /**
     * Funcion que cambia el controlador de formulario
     * @param controladorFormulario 
     */
    public void setControladorFormulario(ControladorFormulario controladorFormulario) {
        this.controladorFormulario = controladorFormulario;
    }

}
