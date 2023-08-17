package cl.fabian.examen.actividad2.modelos;


public class Detalle {
    private PacienteModelo paciente;
    private DoctorModelo doctor;
    private double descuentoEsp = 0.0;
    private double descuentoEdad = 0.0;
    
    
    //Constructor, getters y setters
    public Detalle() {
    	
    }
	public Detalle(PacienteModelo paciente, DoctorModelo doctor) {
		super();
		this.paciente = paciente;
		this.doctor = doctor;
	}
	public PacienteModelo getPaciente() {
		return paciente;
	}
	public void setPaciente(PacienteModelo paciente) {
		this.paciente = paciente;
	}
	public DoctorModelo getDoctor() {
		return doctor;
	}
	public void setDoctor(DoctorModelo doctor) {
		this.doctor = doctor;
	}
	
	public double getDescuentoEsp() {
		return descuentoEsp;
	}
	public void setDescuentoEsp(double descuento) {
		this.descuentoEsp += descuento;
	}
	
	public double getDescuentoEdad() {
		return descuentoEdad;
	}
	public void setDescuentoEdad(double descuentoEdad) {
		this.descuentoEdad = descuentoEdad;
	}
	public void resetDescuentos() {
		this.descuentoEsp = 0.0;
		this.descuentoEdad = 0.0;
	}
	@Override
	public String toString() {
		return "Detalle \n  -Paciente " + paciente + ", descuento edad=" + descuentoEdad * 100 + "%"
				+ ", \n  -Doctor " + doctor
				+ " \n  -descuento especialidad y exp="+ descuentoEsp * 100 + "%]";
	}
	
    
    
}