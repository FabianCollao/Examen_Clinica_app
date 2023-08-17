package cl.fabian.examen.modelos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.fabian.examen.modelos.entidades.Cita;

public interface ICitaRepositorio extends JpaRepository<Cita,Integer>{

}