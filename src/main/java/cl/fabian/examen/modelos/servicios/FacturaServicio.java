package cl.fabian.examen.modelos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabian.examen.modelos.entidades.Factura;
import cl.fabian.examen.modelos.repositorios.IFacturaRepositorio;

/**
 * Clase de servicio que maneja las operaciones relacionadas con las facturas.
 */
@Service
public class FacturaServicio {

	@Autowired
	IFacturaRepositorio facturaRepo;
	
	/**
	 * Constructor por defecto de la clase FacturaServicio.
	 */
	public FacturaServicio() {
		super();
	}
	
	/**
	 * Obtiene una lista de todas las facturas.
	 *
	 * @return Lista de facturas.
	 */
	public List<Factura> obtenerFacturas(){
		return facturaRepo.findAll();
	}
	
	/**
	 * Obtiene una factura según su ID.
	 *
	 * @param id Identificador único de la factura.
	 * @return La factura encontrada.
	 */
	public Factura obtenerFactura(int id) {
		return facturaRepo.findById(id).get();
	}
	
	/**
	 * Crea una nueva factura.
	 *
	 * @param factura La factura a ser creada.
	 */
	public void crearFactura(Factura factura) {
		facturaRepo.save(factura);
	}
	
	/**
	 * Actualiza una factura existente.
	 *
	 * @param factura La factura a ser actualizada.
	 */
	public void actualizarFactura(Factura factura) {
		facturaRepo.save(factura);
	}
	
	/**
	 * Borra una factura según su ID.
	 *
	 * @param id Identificador único de la factura a ser borrada.
	 */
	public void borrarFactura(int id) {
		facturaRepo.delete(obtenerFactura(id));
	}
}