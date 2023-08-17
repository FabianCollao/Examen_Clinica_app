package cl.fabian.examen.modelos.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Table;

import java.time.LocalDate;

/**
 * Clase que representa una cita médica con información sobre el paciente, doctor, fecha y factura asociada.
 */
@Entity
@Table(name = "Citas")
public class Cita {
    @Id
    @Column(name = "ID")
    private int id;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "Paciente_ID", referencedColumnName = "ID")
    private Paciente paciente;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "Doctor_ID", referencedColumnName = "ID")
    private Doctor doctor;

    @Column(name = "Fecha")
    private LocalDate fecha;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "Factura_ID", referencedColumnName = "ID")
    private Factura factura;

    /**
     * Constructor vacío de la clase Cita.
     */
    public Cita() {

    }

    /**
     * Constructor de la clase Cita con parámetros.
     *
     * @param id      El ID de la cita.
     * @param paciente El paciente asociado a la cita.
     * @param doctor  El doctor asociado a la cita.
     * @param fecha   La fecha de la cita.
     * @param factura La factura asociada a la cita.
     */
    public Cita(int id, Paciente paciente, Doctor doctor, LocalDate fecha, Factura factura) {
        this.id = id;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.factura = factura;
    }

    /**
     * Obtiene el ID de la cita.
     *
     * @return El ID de la cita.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la cita.
     *
     * @param id El ID de la cita a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el paciente asociado a la cita.
     *
     * @return El paciente asociado a la cita.
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Establece el paciente asociado a la cita.
     *
     * @param paciente El paciente a asociar a la cita.
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * Obtiene el doctor asociado a la cita.
     *
     * @return El doctor asociado a la cita.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Establece el doctor asociado a la cita.
     *
     * @param doctor El doctor a asociar a la cita.
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * Obtiene la fecha de la cita.
     *
     * @return La fecha de la cita.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la cita.
     *
     * @param fecha La fecha de la cita a establecer.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la factura asociada a la cita.
     *
     * @return La factura asociada a la cita.
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * Establece la factura asociada a la cita.
     *
     * @param factura La factura a asociar a la cita.
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * Genera una representación en formato de cadena del objeto Cita.
     *
     * @return Una cadena que muestra la información de la cita.
     */
    @Override
    public String toString() {
        return "Cita [id=" + id + ", paciente=" + paciente + ", doctor=" + doctor + ", fecha=" + fecha + ", factura="
                + factura + "]";
    }
    
    
}

