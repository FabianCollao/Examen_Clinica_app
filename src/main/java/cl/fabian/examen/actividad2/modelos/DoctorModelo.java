package cl.fabian.examen.actividad2.modelos;


public class DoctorModelo {

    private String nombre;
    private String especialidad;
    private int experiencia;
    
    
    public DoctorModelo() {
    	
    }
    
	public DoctorModelo( String nombre, String especialidad, int experiencia) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.experiencia = experiencia;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "(nombre)= " + nombre + ", \n *especialidad=" + especialidad 
				+ ", \n *experiencia=" + experiencia + " años";
	}
    
}
