package cl.fabian.examen.actividad2;

import cl.fabian.examen.actividad2.modelos.Detalle;
/**
 * Interfaz que define el método para calcular el descuento basado en una lista de detalles.
 */
public interface ICalculoDescuento {

    /**
     * Calcula el porcentaje de descuento en valor decimal basado en una lista de detalles.
     *
     * @param detalles Arreglo de objetos Detalle que contienen la información necesaria para el cálculo del descuento.
     * @return El porcentaje de descuento en valor decimal.
     */
	double descuento(Detalle[] detalles);
}
