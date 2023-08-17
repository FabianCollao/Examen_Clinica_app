package cl.fabian.examen.modelos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabian.examen.modelos.entidades.Cita;
import cl.fabian.examen.modelos.repositorios.ICitaRepositorio;

/**
 * Clase de servicio que maneja las operaciones relacionadas con las citas médicas.
 */
@Service
public class CitaServicio {

	@Autowired
	ICitaRepositorio citaRepo;
	
	/**
	 * Constructor por defecto de la clase CitaServicio.
	 */
	public CitaServicio() {
		super();
	}
	
	/**
	 * Obtiene una lista de todas las citas médicas.
	 *
	 * @return Lista de citas médicas.
	 */
	public List<Cita> obtenerCitas(){
		return citaRepo.findAll();
	}
	
	/**
	 * Obtiene una cita médica según su ID.
	 *
	 * @param id Identificador único de la cita médica.
	 * @return La cita médica encontrada.
	 */
	public Cita obtenerCita(int id) {
		return citaRepo.findById(id).get();
	}
	
	/**
	 * Crea una nueva cita médica.
	 *
	 * @param cita La cita médica a ser creada.
	 */
	public void crearCita(Cita cita) {
		citaRepo.save(cita);
	}
	
	/**
	 * Actualiza una cita médica existente.
	 *
	 * @param cita La cita médica a ser actualizada.
	 */
	public void actualizarCita(Cita cita) {
		citaRepo.save(cita);
	}
	
	/**
	 * Borra una cita médica según su ID.
	 *
	 * @param id Identificador único de la cita médica a ser borrada.
	 */
	public void borrarCita(int id) {
		citaRepo.delete(obtenerCita(id));
	}
}

