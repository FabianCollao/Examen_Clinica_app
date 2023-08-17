package cl.fabian.examen.modelos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.fabian.examen.modelos.entidades.HistoriaClinica;
/**
 * Interfaz que define el repositorio para la entidad HistoriaClinica.
 */
@Repository
public interface IHistoriaClinicaRepositorio extends JpaRepository<HistoriaClinica, Integer> {
	
	/**
	 * Obtiene una lista de todas las historias clínicas con información detallada de pacientes y doctores.
	 *
	 * @return Lista de historias clínicas con pacientes y doctores.
	 */
	@Query("SELECT hc FROM HistoriaClinica hc LEFT JOIN FETCH hc.paciente LEFT JOIN FETCH hc.doctor")
	List<HistoriaClinica> findAllWithPacienteAndDoctor();
	
	/**
	 * Obtiene una lista de historias clínicas de un paciente específico ordenadas por fecha de cita descendente.
	 *
	 * @param pacienteId Identificador del paciente.
	 * @return Lista de historias clínicas del paciente.
	 */
	@Query("SELECT hc FROM HistoriaClinica hc WHERE hc.paciente.id = :pacienteId ORDER BY hc.fechaCita DESC")
    List<HistoriaClinica> findByPacienteId(@Param("pacienteId") int pacienteId);
}
