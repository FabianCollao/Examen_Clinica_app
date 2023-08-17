package cl.fabian.examen.modelos.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Table;


/**
 * Clase que representa a un paciente con información como ID, nombre y fecha de nacimiento.
 */
@Entity
@Table(name = "Pacientes")
public class Paciente {
    /**
     * Identificador único del paciente.
     */
    @Id
    @Column(name = "ID")
    private int id;

    /**
     * Nombre del paciente.
     */
    @Column(name = "Nombre", length = 100)
    private String nombre;

    /**
     * Fecha de nacimiento del paciente.
     */
    @Column(name = "Fecha_Nacimiento")
    private LocalDate fechaNacimiento;

    /**
     * Constructor por defecto de la clase Paciente.
     */
    public Paciente() {
    	
    }
    
    /**
     * Constructor que recibe los atributos principales del paciente.
     *
     * @param id             Identificador único del paciente.
     * @param nombre         Nombre del paciente.
     * @param fechaNacimiento Fecha de nacimiento del paciente.
     */
	public Paciente(int id, String nombre, LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
     * Formatea la fecha de nacimiento en un formato legible en español.
     *
     * @return Fecha de nacimiento formateada en el formato "dd de MM de yyyy" como: "01 de Enero de 2000".
     */
	public String getFechaNacFormateado() {
		int dia = fechaNacimiento.getDayOfMonth();
		String mes = fechaNacimiento.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		int año = fechaNacimiento.getYear();
		return dia + " de " + mes + " de " + año;
	}
	/**
     * Genera una representación en formato de cadena del objeto Paciente.
     *
     * @return Una cadena que muestra la información del paciente.
     */
	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
    
    
}

