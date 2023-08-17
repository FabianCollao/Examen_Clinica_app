package cl.fabian.examen.actividad2;

import cl.fabian.examen.actividad2.modelos.Detalle;

public interface ICalculoDescuento {
	/* Según el diagrama, debes implementar un método que recibe una lista de detalle y retorna
	el porcentaje de descuento en valor decimal. */
	
	double descuento(Detalle[] detalles);
}
