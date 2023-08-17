package cl.fabian.examen.actividad2;

import java.time.LocalDateTime;

import cl.fabian.examen.actividad2.modelos.CalculoEdad;
import cl.fabian.examen.actividad2.modelos.CalculoEspecialidadExperiencia;
import cl.fabian.examen.actividad2.modelos.Detalle;
import cl.fabian.examen.actividad2.modelos.DoctorModelo;
import cl.fabian.examen.actividad2.modelos.PacienteModelo;

public class Main {
	public static void main(String[] args) {
		
        // Creamos instancias de Detalle, Paciente y Doctor
		Detalle detalle1 = new Detalle(
				new PacienteModelo("Jose",LocalDateTime.of(1998, 8, 12, 0, 0)),
				new DoctorModelo("Dr. Mario", "Endocrinología", 7));
		
		Detalle detalle2 = new Detalle(
				new PacienteModelo("Daniel", LocalDateTime.of(2011, 12, 11, 0, 0)),
				new DoctorModelo("Dra. Angela", "Cardiología", 12));
		
		Detalle detalle3 = new Detalle(
				new PacienteModelo("Catalina", LocalDateTime.of(2020, 1, 1, 0, 0)),
				new DoctorModelo("Dr. Antonio", "Cardiología", 20));
		Detalle[] detalles = { detalle1, detalle2, detalle3 };

		// Instanciar los cálculos
		ICalculoDescuento calculoEdad = new CalculoEdad();
		ICalculoDescuento calculoEspecialidadExperiencia = new CalculoEspecialidadExperiencia();

		// Calcular descuentos
		double descuentoPorEdad = calculoEdad.descuento(detalles);
		double descuentoPorEspecialidadExperiencia = calculoEspecialidadExperiencia.descuento(detalles);
		
		//Imprimir datos por consola
		System.out.println("Descuento total por Edad: " + descuentoPorEdad * 100 + "%");
		System.out.println("Descuento total por Especialidad y Experiencia: " + descuentoPorEspecialidadExperiencia * 100 + "% \n");
		for(Detalle detalle : detalles) {
			System.out.println(detalle);
		}
	}
}
