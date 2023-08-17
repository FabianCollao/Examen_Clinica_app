package cl.fabian.examen.actividad2.modelos;

import java.time.LocalDateTime;
import java.time.Period;


public class PacienteModelo {
	
	 private String nombre;
	 private LocalDateTime fechaNacimiento;
	 
	 public PacienteModelo() {
		 
	 }

	public PacienteModelo(String nombre, LocalDateTime fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		LocalDateTime fechaActual = LocalDateTime.now();
		Period periodo= Period.between(fechaNacimiento.toLocalDate(), fechaActual.toLocalDate());
		int edad = periodo.getYears();
		return edad;
	}
	@Override
	public String toString() {
		return "(nombre)= " + nombre + ", *edad="+ getEdad()+ " años";
	}
	 
}
