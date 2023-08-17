package cl.fabian.examen.modelos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.fabian.examen.modelos.entidades.Doctor;

@Repository
public interface IDoctorRepositorio extends JpaRepository<Doctor,Integer>{

}
