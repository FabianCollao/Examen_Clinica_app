package cl.fabian.examen.modelos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabian.examen.modelos.entidades.Paciente;
import cl.fabian.examen.modelos.repositorios.IPacienteRepositorio;

/**
 * Clase de servicio que maneja las operaciones relacionadas con los pacientes.
 */
@Service
public class PacienteServicio {

	@Autowired
	IPacienteRepositorio pacienteRepo;
	
	/**
	 * Constructor por defecto de la clase PacienteServicio.
	 */
	public PacienteServicio() {
		super();
	}
	
	/**
	 * Obtiene una lista de todos los pacientes.
	 *
	 * @return Lista de pacientes.
	 */
	public List<Paciente> obtenerPacientes(){
		return pacienteRepo.findAll();
	}
	
	/**
	 * Obtiene un paciente según su ID.
	 *
	 * @param id Identificador único del paciente.
	 * @return El paciente encontrado.
	 */
	public Paciente obtenerPaciente(int id) {
		return pacienteRepo.findById(id).get();
	}
	
	/**
	 * Crea un nuevo paciente.
	 *
	 * @param paciente El paciente a ser creado.
	 */
	public void crearPaciente(Paciente paciente) {
		pacienteRepo.save(paciente);
	}
	
	/**
	 * Actualiza un paciente existente.
	 *
	 * @param paciente El paciente a ser actualizado.
	 */
	public void actualizarPaciente(Paciente paciente) {
		pacienteRepo.save(paciente);
	}
	
	/**
	 * Borra un paciente según su ID.
	 *
	 * @param id Identificador único del paciente a ser borrado.
	 */
	public void borrarPaciente(int id) {
		pacienteRepo.delete(obtenerPaciente(id));
	}
}
