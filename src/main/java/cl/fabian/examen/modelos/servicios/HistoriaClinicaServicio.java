package cl.fabian.examen.modelos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabian.examen.modelos.entidades.HistoriaClinica;
import cl.fabian.examen.modelos.repositorios.IHistoriaClinicaRepositorio;

/**
 * Clase de servicio que maneja las operaciones relacionadas con las historias clínicas.
 */
@Service
public class HistoriaClinicaServicio {

	@Autowired
	IHistoriaClinicaRepositorio histRepo;
	
	/**
	 * Constructor por defecto de la clase HistoriaClinicaServicio.
	 */
	public HistoriaClinicaServicio() {
		super();
	}
	
	/**
	 * Obtiene una lista de todas las historias clínicas con información completa de pacientes y doctores.
	 *
	 * @return Lista de historias clínicas.
	 */
	public List<HistoriaClinica> obtenerHistoriasClinicas(){
		return histRepo.findAllWithPacienteAndDoctor();
	}
	
	/**
	 * Obtiene una lista de historias clínicas asociadas a un paciente específico.
	 *
	 * @param id Identificador único del paciente.
	 * @return Lista de historias clínicas asociadas al paciente.
	 */
	public List<HistoriaClinica> obtenerHistoriasPorIdPaciente(int id){
		return histRepo.findByPacienteId(id);
	}
	
	/**
	 * Obtiene una historia clínica según su ID.
	 *
	 * @param id Identificador único de la historia clínica.
	 * @return La historia clínica encontrada.
	 */
	public HistoriaClinica obtenerHistoriaClinica(int id) {
		return histRepo.findById(id).get();
	}
	
	/**
	 * Crea una nueva historia clínica.
	 *
	 * @param hist La historia clínica a ser creada.
	 */
	public void crearHistoriaClinica(HistoriaClinica hist) {
		histRepo.save(hist);
	}
	
	/**
	 * Actualiza una historia clínica existente.
	 *
	 * @param hist La historia clínica a ser actualizada.
	 */
	public void actualizarHistoriaClinica(HistoriaClinica hist) {
		histRepo.save(hist);
	}
	
	/**
	 * Borra una historia clínica según su ID.
	 *
	 * @param id Identificador único de la historia clínica a ser borrada.
	 */
	public void borrarHistoriaClinica(int id) {
		histRepo.delete(obtenerHistoriaClinica(id));
	}
}

