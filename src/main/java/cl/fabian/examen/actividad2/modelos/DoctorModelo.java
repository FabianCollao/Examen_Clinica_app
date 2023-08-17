package cl.fabian.examen.actividad2.modelos;

/**
 * Clase que representa a un doctor con su nombre, especialidad y experiencia.
 */
public class DoctorModelo {

    private String nombre;
    private String especialidad;
    private int experiencia;

    /**
     * Constructor vacío de la clase DoctorModelo.
     */
    public DoctorModelo() {
    }

    /**
     * Constructor de la clase DoctorModelo con parámetros.
     *
     * @param nombre       El nombre del doctor.
     * @param especialidad La especialidad del doctor.
     * @param experiencia  La experiencia del doctor en años.
     */
    public DoctorModelo(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    /**
     * Obtiene el nombre del doctor.
     *
     * @return El nombre del doctor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del doctor.
     *
     * @param nombre El nombre del doctor a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la especialidad del doctor.
     *
     * @return La especialidad del doctor.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del doctor.
     *
     * @param especialidad La especialidad del doctor a establecer.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la experiencia del doctor en años.
     *
     * @return La experiencia del doctor en años.
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * Establece la experiencia del doctor en años.
     *
     * @param experiencia La experiencia del doctor en años a establecer.
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Genera una representación en formato de cadena del objeto DoctorModelo.
     *
     * @return Una cadena que muestra el nombre, especialidad y experiencia del doctor.
     */
    @Override
    public String toString() {
        return "(nombre)= " + nombre + ", \n *especialidad=" + especialidad
                + ", \n *experiencia=" + experiencia + " años";
    }
}
