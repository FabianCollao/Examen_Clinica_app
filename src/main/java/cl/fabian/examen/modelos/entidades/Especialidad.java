package cl.fabian.examen.modelos.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
/**
 * Clase que representa una especialidad médica con información como ID y nombre.
 */
@Entity
@Table(name = "Especialidades")
public class Especialidad {
    /**
     * Identificador único de la especialidad.
     */
    @Id
    @Column(name = "ID")
    private int id;

    /**
     * Nombre de la especialidad.
     */
    @Column(name = "Nombre", length = 100)
    private String nombre;

    /**
     * Constructor por defecto de la clase Especialidad.
     */
    public Especialidad() {
    	
    }

    /**
     * Constructor de la clase Especialidad.
     *
     * @param id     El ID de la especialidad.
     * @param nombre El nombre de la especialidad.
     */
	public Especialidad(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

    /**
     * Obtiene el ID de la especialidad.
     *
     * @return El ID de la especialidad.
     */
	public int getId() {
		return id;
	}

    /**
     * Establece el ID de la especialidad.
     *
     * @param id El ID de la especialidad a establecer.
     */
	public void setId(int id) {
		this.id = id;
	}

    /**
     * Obtiene el nombre de la especialidad.
     *
     * @return El nombre de la especialidad.
     */
	public String getNombre() {
		return nombre;
	}

    /**
     * Establece el nombre de la especialidad.
     *
     * @param nombre El nombre de la especialidad a establecer.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Genera una representación en formato de cadena del objeto Especialidad.
     *
     * @return Una cadena que muestra la información de la especialidad.
     */
	@Override
	public String toString() {
		return "Especialidad [id=" + id + ", nombre=" + nombre + "]";
	}
}

