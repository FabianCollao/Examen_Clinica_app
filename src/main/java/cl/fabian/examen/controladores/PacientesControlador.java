package cl.fabian.examen.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.fabian.examen.modelos.entidades.Paciente;
import cl.fabian.examen.modelos.servicios.PacienteServicio;

@Controller
public class PacientesControlador {
	
	@Autowired
	private PacienteServicio pacienteServ;
	
	@RequestMapping(value = { "/", "/lista-pacientes" }, method = RequestMethod.GET)
	public ModelAndView listarPacientes() {
		List<Paciente> listaPacientes = new ArrayList<>();
		listaPacientes = pacienteServ.obtenerPacientes();
		
		return new ModelAndView ("lista-pacientes","listaPacientes",listaPacientes);
	}
}
