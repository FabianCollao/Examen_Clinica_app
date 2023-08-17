package cl.fabian.examen.actividad2.modelos;

import cl.fabian.examen.actividad2.ICalculoDescuento;

public class CalculoEspecialidadExperiencia implements ICalculoDescuento {
    @Override
    public double descuento(Detalle[] detalles) {
        double descuentoTotal = 0;

        for (Detalle detalle : detalles) {
            DoctorModelo doctor = detalle.getDoctor();
            String especialidad = doctor.getEspecialidad();
            int experiencia = doctor.getExperiencia();

            double descuentoActual = 0;

            if ((especialidad.equals("Cardiología") || especialidad.equals("Neurología")) && experiencia >= 10 && experiencia < 20) {
                descuentoActual = 0.05; // 5% de descuento para Cardiólogos y Neurólogos con experiencia entre 10 y 20 años
            } else if ((especialidad.equals("Endocrinología") || especialidad.equals("Oncología")) && experiencia > 5) {
                descuentoActual = 0.10; // 10% de descuento para Endocrinólogos y Oncólogos con más de 5 años de experiencia
            } else if (especialidad.equals("Dermatología") ) {
            	descuentoActual = 0.0; // No hay descuento
            }else if(experiencia >= 20) {
                descuentoActual = 0.05; // 5% de descuento para otras especialidades con más de 20 años de experiencia
            }else if (experiencia < 10) {
                descuentoActual = 0.15; // 15% de descuento para menos de 10 años de experiencia
            }
            //Guardamos el descuento del paciente actual en el detalle
            detalle.setDescuentoEsp(descuentoActual);
            //System.out.println("-- Descuento Actual Esp y Exp: "+ descuentoActual * 100 + "%");
            //Aumentamos la variable que se retornará como descuento total
            descuentoTotal += descuentoActual;
        }

        return descuentoTotal;
    }
}

