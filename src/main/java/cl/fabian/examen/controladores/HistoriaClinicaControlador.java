package cl.fabian.examen.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.fabian.examen.modelos.entidades.HistoriaClinica;
import cl.fabian.examen.modelos.servicios.HistoriaClinicaServicio;

@Controller
public class HistoriaClinicaControlador {
	@Autowired
	private HistoriaClinicaServicio histServ;

	@RequestMapping(value = "/historial-clinico", method = RequestMethod.GET)
	public ModelAndView mostrarAdmin(ModelMap model, @RequestParam("idRescatado") int id) {

		List<HistoriaClinica> listaHistorial = histServ.obtenerHistoriasPorIdPaciente(id);
		model.addAttribute("listaHistorial", listaHistorial);
		return new ModelAndView("historial-clinico");
	}
}
