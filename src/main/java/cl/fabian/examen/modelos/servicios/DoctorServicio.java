package cl.fabian.examen.modelos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabian.examen.modelos.entidades.Doctor;
import cl.fabian.examen.modelos.repositorios.IDoctorRepositorio;

/**
 * Clase de servicio que maneja las operaciones relacionadas con los doctores.
 */
@Service
public class DoctorServicio {

	@Autowired
	IDoctorRepositorio doctorRepo;
	
	/**
	 * Constructor por defecto de la clase DoctorServicio.
	 */
	public DoctorServicio() {
		super();
	}
	
	/**
	 * Obtiene una lista de todos los doctores.
	 *
	 * @return Lista de doctores.
	 */
	public List<Doctor> obtenerDoctores(){
		return doctorRepo.findAll();
	}
	
	/**
	 * Obtiene un doctor según su ID.
	 *
	 * @param id Identificador único del doctor.
	 * @return El doctor encontrado.
	 */
	public Doctor obtenerDoctor(int id) {
		return doctorRepo.findById(id).get();
	}
	
	/**
	 * Crea un nuevo doctor.
	 *
	 * @param doctor El doctor a ser creado.
	 */
	public void crearDoctor(Doctor doctor) {
		doctorRepo.save(doctor);
	}
	
	/**
	 * Actualiza un doctor existente.
	 *
	 * @param doctor El doctor a ser actualizado.
	 */
	public void actualizarDoctor(Doctor doctor) {
		doctorRepo.save(doctor);
	}
	
	/**
	 * Borra un doctor según su ID.
	 *
	 * @param id Identificador único del doctor a ser borrado.
	 */
	public void borrarDoctor(int id) {
		doctorRepo.delete(obtenerDoctor(id));
	}
}
