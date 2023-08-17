package cl.fabian.examen.modelos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.fabian.examen.modelos.entidades.Paciente;


@Repository
public interface IPacienteRepositorio extends JpaRepository<Paciente,Integer>{

}
