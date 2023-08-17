package cl.fabian.examen.modelos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.fabian.examen.modelos.entidades.Factura;


public interface IFacturaRepositorio extends JpaRepository<Factura,Integer>{

}
