package cl.fabian.examen.modelos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.fabian.examen.modelos.entidades.Doctor;

public interface IDoctorRepositorio extends JpaRepository<Doctor,Integer>{

}
