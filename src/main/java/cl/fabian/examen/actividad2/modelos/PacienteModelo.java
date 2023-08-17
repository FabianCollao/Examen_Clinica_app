package cl.fabian.examen.actividad2.modelos;

import java.time.LocalDateTime;
import java.time.Period;

/**
 * Clase que representa a un paciente con su nombre y fecha de nacimiento.
 */
public class PacienteModelo {

    private String nombre;
    private LocalDateTime fechaNacimiento;

    /**
     * Constructor vacío de la clase PacienteModelo.
     */
    public PacienteModelo() {

    }

    /**
     * Constructor de la clase PacienteModelo con parámetros.
     *
     * @param nombre          El nombre del paciente.
     * @param fechaNacimiento La fecha de nacimiento del paciente.
     */
    public PacienteModelo(String nombre, LocalDateTime fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el nombre del paciente.
     *
     * @return El nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del paciente.
     *
     * @param nombre El nombre del paciente a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de nacimiento del paciente.
     *
     * @return La fecha de nacimiento del paciente.
     */
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del paciente.
     *
     * @param fechaNacimiento La fecha de nacimiento del paciente a establecer.
     */
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Calcula y obtiene la edad del paciente en años.
     *
     * @return La edad del paciente en años.
     */
    public int getEdad() {
        LocalDateTime fechaActual = LocalDateTime.now();
        Period periodo = Period.between(fechaNacimiento.toLocalDate(), fechaActual.toLocalDate());
        return periodo.getYears();
    }

    /**
     * Genera una representación en formato de cadena del objeto PacienteModelo.
     *
     * @return Una cadena que muestra el nombre y edad del paciente.
     */
    @Override
    public String toString() {
        return "(nombre)= " + nombre + ", *edad=" + getEdad() + " años";
    }
}
