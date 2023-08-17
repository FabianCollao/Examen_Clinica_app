package cl.fabian.examen.modelos.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Clase que representa a un doctor con información como ID, nombre, especialidad y experiencia.
 */
@Entity
@Table(name = "Doctores")
public class Doctor {
    /**
     * Identificador único del doctor.
     */
    @Id
    @Column(name = "ID")
    private int id;

    /**
     * Nombre del doctor.
     */
    @Column(name = "Nombre", length = 100)
    private String nombre;

    /**
     * Especialidad a la que pertenece el doctor.
     */
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "Especialidad_ID", referencedColumnName = "ID")
    private Especialidad especialidad;

    /**
     * Experiencia en años del doctor.
     */
    @Column(name = "Experiencia")
    private int experiencia;

    /**
     * Constructor por defecto de la clase Doctor.
     */
    public Doctor() {
    	
    }

    /**
     * Constructor de la clase Doctor.
     *
     * @param id          El ID del doctor.
     * @param nombre      El nombre del doctor.
     * @param especialidad La especialidad a la que pertenece el doctor.
     * @param experiencia La experiencia en años del doctor.
     */
	public Doctor(int id, String nombre, Especialidad especialidad, int experiencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.experiencia = experiencia;
	}

	/**
     * Obtiene el ID del doctor.
     *
     * @return El ID del doctor.
     */
	public int getId() {
		return id;
	}

	/**
     * Establece el ID del doctor.
     *
     * @param id El ID del doctor a establecer.
     */
	public void setId(int id) {
		this.id = id;
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
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	/**
     * Establece la especialidad del doctor.
     *
     * @param especialidad La especialidad del doctor a establecer.
     */
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	/**
     * Obtiene la experiencia en años del doctor.
     *
     * @return La experiencia en años del doctor.
     */
	public int getExperiencia() {
		return experiencia;
	}

	/**
     * Establece la experiencia en años del doctor.
     *
     * @param experiencia La experiencia en años del doctor a establecer.
     */
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	/**
     * Genera una representación en formato de cadena del objeto Doctor.
     *
     * @return Una cadena que muestra la información del doctor.
     */
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", experiencia="
				+ experiencia + "]";
	}
	
    
}

