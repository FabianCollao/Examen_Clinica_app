package cl.fabian.examen.modelos.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Table;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Clase que representa una historia clínica con información como ID, paciente, doctor, fecha de cita, síntomas,
 * diagnóstico y tratamiento.
 */
@Entity
@Table(name = "Historia_Clinica")
public class HistoriaClinica {
    /**
     * Identificador único de la historia clínica.
     */
    @Id
    @Column(name = "ID")
    private int id;
    
    /**
     * Paciente asociado a la historia clínica.
     */
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "Paciente_ID", referencedColumnName = "ID")
    private Paciente paciente;

    /**
     * Doctor asociado a la historia clínica.
     */
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "Doctor_ID", referencedColumnName = "ID")
    private Doctor doctor;

    /**
     * Fecha de la cita médica registrada en la historia clínica.
     */
    @Column(name = "Fecha_Cita")
    private LocalDate fechaCita;

    /**
     * Síntomas reportados en la historia clínica.
     */
    @Column(name = "Sintomas", length = 5000)
    private String sintomas;

    /**
     * Diagnóstico registrado en la historia clínica.
     */
    @Column(name = "Diagnostico", length = 5000)
    private String diagnostico;

    /**
     * Tratamiento prescrito en la historia clínica.
     */
    @Column(name = "Tratamiento", length = 5000)
    private String tratamiento;

    /**
     * Constructor por defecto de la clase HistoriaClinica.
     */
    public HistoriaClinica() {
    	
    }


	public HistoriaClinica(int id, Paciente paciente, Doctor doctor, LocalDate fechaCita, String sintomas,
			String diagnostico, String tratamiento) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.doctor = doctor;
		this.fechaCita = fechaCita;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public LocalDate getFechaCita() {
		return fechaCita;
	}
	

	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}


	public String getSintomas() {
		return sintomas;
	}


	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public String getTratamiento() {
		return tratamiento;
	}


	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	
	public String getFechaCitaFormateada() {
		int dia =fechaCita.getDayOfMonth();
		String mes = fechaCita.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));;
		int año =fechaCita.getYear();
		return dia +" de "+ mes + " de " + año ;
	}
	/**
     * Genera una representación en formato de cadena del objeto HistoriaClinica.
     *
     * @return Una cadena que muestra la información de la Historia Clinica.
     */
	@Override
	public String toString() {
		return "HistoriaClinica [id=" + id + ", paciente=" + paciente + ", doctor=" + doctor + ", fechaCita="
				+ fechaCita + ", sintomas=" + sintomas + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento
				+ "]";
	}

    
    
}

