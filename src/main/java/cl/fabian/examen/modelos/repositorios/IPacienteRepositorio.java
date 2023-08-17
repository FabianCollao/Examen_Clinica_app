package cl.fabian.examen.modelos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.fabian.examen.modelos.entidades.Paciente;


public interface IPacienteRepositorio extends JpaRepository<Paciente,Integer>{

}
