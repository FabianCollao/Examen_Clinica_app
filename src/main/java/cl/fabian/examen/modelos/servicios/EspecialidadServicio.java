package cl.fabian.examen.modelos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabian.examen.modelos.entidades.Especialidad;
import cl.fabian.examen.modelos.repositorios.IEspecialidadRepositorio;

/**
 * Clase de servicio que maneja las operaciones relacionadas con las especialidades.
 */
@Service
public class EspecialidadServicio {

	@Autowired
	IEspecialidadRepositorio especialidadRepo;
	
	/**
	 * Constructor por defecto de la clase EspecialidadServicio.
	 */
	public EspecialidadServicio() {
		super();
	}
	
	/**
	 * Obtiene una lista de todas las especialidades.
	 *
	 * @return Lista de especialidades.
	 */
	public List<Especialidad> obtenerEspecialidades(){
		return especialidadRepo.findAll();
	}
	
	/**
	 * Obtiene una especialidad según su ID.
	 *
	 * @param id Identificador único de la especialidad.
	 * @return La especialidad encontrada.
	 */
	public Especialidad obtenerEspecialidad(int id) {
		return especialidadRepo.findById(id).get();
	}
	
	/**
	 * Crea una nueva especialidad.
	 *
	 * @param especialidad La especialidad a ser creada.
	 */
	public void crearEspecialidad(Especialidad especialidad) {
		especialidadRepo.save(especialidad);
	}
	
	/**
	 * Actualiza una especialidad existente.
	 *
	 * @param especialidad La especialidad a ser actualizada.
	 */
	public void actualizarEspecialidad(Especialidad especialidad) {
		especialidadRepo.save(especialidad);
	}
	
	/**
	 * Borra una especialidad según su ID.
	 *
	 * @param id Identificador único de la especialidad a ser borrada.
	 */
	public void borrarEspecialidad(int id) {
		especialidadRepo.delete(obtenerEspecialidad(id));
	}
}
