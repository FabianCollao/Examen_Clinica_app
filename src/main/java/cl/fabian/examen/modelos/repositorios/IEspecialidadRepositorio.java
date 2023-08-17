package cl.fabian.examen.modelos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.fabian.examen.modelos.entidades.Especialidad;


public interface IEspecialidadRepositorio extends JpaRepository<Especialidad,Integer> {

}
