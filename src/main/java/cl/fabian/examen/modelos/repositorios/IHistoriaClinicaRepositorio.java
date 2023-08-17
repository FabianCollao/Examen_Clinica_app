package cl.fabian.examen.modelos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.fabian.examen.modelos.entidades.HistoriaClinica;


public interface IHistoriaClinicaRepositorio extends JpaRepository<HistoriaClinica,Integer>{

}
