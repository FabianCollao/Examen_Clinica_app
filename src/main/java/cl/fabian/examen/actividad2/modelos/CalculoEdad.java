package cl.fabian.examen.actividad2.modelos;

import cl.fabian.examen.actividad2.ICalculoDescuento;

/**
 * Implementación de la interfaz ICalculoDescuento que calcula el descuento
 * basado en la edad del paciente.
 */
public class CalculoEdad implements ICalculoDescuento {

    /**
     * Calcula el descuento basado en la edad de los pacientes en los detalles.
     *
     * @param detalles Arreglo de objetos Detalle que contienen la información de los pacientes.
     * @return El descuento total basado en la edad de los pacientes.
     */
    @Override
    public double descuento(Detalle[] detalles) {
        double totalDescuento = 0.0;

        for (Detalle detalle : detalles) {
            PacienteModelo paciente = detalle.getPaciente();
            int edad = paciente.getEdad();
            double descuentoActual = 0.0;

            if (edad <= 5) {
                descuentoActual = 0.05; // 5% de descuento
            } else if (edad > 5 && edad < 13) {
                descuentoActual = 0.03; // 3% de descuento
            } else if (edad >= 13 && edad <= 35) {
                // No aplica descuentoActual
            } else if (edad > 35 && edad < 60) {
                descuentoActual = 0.10; // 10% de descuento
            } else if (edad >= 60) {
                descuentoActual = 0.30; // 30% de descuento
            }

            // Guardamos el descuentoActual del paciente actual en el detalle
            detalle.setDescuentoEdad(descuentoActual);

            // Aumentamos la variable que se retornará como descuento total
            totalDescuento += descuentoActual;
        }
        return totalDescuento;
    }
}
