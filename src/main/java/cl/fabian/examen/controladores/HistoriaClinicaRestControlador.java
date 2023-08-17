package cl.fabian.examen.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.fabian.examen.modelos.entidades.HistoriaClinica;
import cl.fabian.examen.modelos.servicios.HistoriaClinicaServicio;

@RestController
@RequestMapping(value = "/api/historiasclinicas", produces = MediaType.APPLICATION_JSON_VALUE)
public class HistoriaClinicaRestControlador {

	@Autowired
	private HistoriaClinicaServicio histServ;

	@GetMapping
	public List<HistoriaClinica> obtenerUsuarios() {
		return histServ.obtenerHistoriasClinicas();
	}

	@GetMapping("/{id}")
	public ResponseEntity<HistoriaClinica> getHistoriaClinicaById(@PathVariable int id) {
		Optional<HistoriaClinica> historiaClinica = Optional.ofNullable(histServ.obtenerHistoriaClinica(id));

		if (historiaClinica.isPresent()) {
			return ResponseEntity.ok(historiaClinica.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public ResponseEntity<Void> createHistoriaClinica(@RequestBody HistoriaClinica historiaClinica) {
		histServ.crearHistoriaClinica(historiaClinica);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping
	public ResponseEntity<HistoriaClinica> updateHistoriaClinica(@RequestBody HistoriaClinica updatedHistoriaClinica) {
		histServ.actualizarHistoriaClinica(updatedHistoriaClinica);
		return ResponseEntity.ok(updatedHistoriaClinica);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteHistoriaClinica(@PathVariable int id) {
		histServ.borrarHistoriaClinica(id);
		return ResponseEntity.noContent().build();
	}
}
