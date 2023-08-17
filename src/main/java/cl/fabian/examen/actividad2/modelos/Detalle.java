package cl.fabian.examen.actividad2.modelos;

/**
 * Clase que representa un detalle que contiene información sobre un paciente y un doctor,
 * así como los descuentos aplicados a partir de cálculos de edad y especialidad/experiencia.
 */
public class Detalle {

    private PacienteModelo paciente;
    private DoctorModelo doctor;
    private double descuentoEsp = 0.0;
    private double descuentoEdad = 0.0;

    /**
     * Constructor vacío de la clase Detalle.
     */
    public Detalle() {
    }

    /**
     * Constructor de la clase Detalle con parámetros.
     *
     * @param paciente El paciente asociado al detalle.
     * @param doctor   El doctor asociado al detalle.
     */
    public Detalle(PacienteModelo paciente, DoctorModelo doctor) {
        this.paciente = paciente;
        this.doctor = doctor;
    }

    /**
     * Obtiene el paciente asociado al detalle.
     *
     * @return El paciente asociado al detalle.
     */
    public PacienteModelo getPaciente() {
        return paciente;
    }

    /**
     * Establece el paciente asociado al detalle.
     *
     * @param paciente El paciente a establecer.
     */
    public void setPaciente(PacienteModelo paciente) {
        this.paciente = paciente;
    }

    /**
     * Obtiene el doctor asociado al detalle.
     *
     * @return El doctor asociado al detalle.
     */
    public DoctorModelo getDoctor() {
        return doctor;
    }

    /**
     * Establece el doctor asociado al detalle.
     *
     * @param doctor El doctor a establecer.
     */
    public void setDoctor(DoctorModelo doctor) {
        this.doctor = doctor;
    }

    /**
     * Obtiene el descuento de especialidad.
     *
     * @return El descuento de especialidad en valor decimal.
     */
    public double getDescuentoEsp() {
        return descuentoEsp;
    }

    /**
     * Establece el descuento de especialidad.
     *
     * @param descuento El descuento de especialidad a establecer.
     */
    public void setDescuentoEsp(double descuento) {
        this.descuentoEsp += descuento;
    }

    /**
     * Obtiene el descuento de edad.
     *
     * @return El descuento de edad en valor decimal.
     */
    public double getDescuentoEdad() {
        return descuentoEdad;
    }

    /**
     * Establece el descuento de edad.
     *
     * @param descuentoEdad El descuento de edad a establecer.
     */
    public void setDescuentoEdad(double descuentoEdad) {
        this.descuentoEdad = descuentoEdad;
    }

    /**
     * Reinicia los valores de los descuentos a cero.
     */
    public void resetDescuentos() {
        this.descuentoEsp = 0.0;
        this.descuentoEdad = 0.0;
    }

    /**
     * Genera una representación en formato de cadena del objeto Detalle.
     *
     * @return Una cadena que muestra información sobre el paciente, doctor y descuentos.
     */
    @Override
    public String toString() {
        return "Detalle \n  -Paciente " + paciente + ", descuento edad=" + descuentoEdad * 100 + "%"
                + ", \n  -Doctor " + doctor
                + " \n  -descuento especialidad y exp=" + descuentoEsp * 100 + "%]";
    }
}
