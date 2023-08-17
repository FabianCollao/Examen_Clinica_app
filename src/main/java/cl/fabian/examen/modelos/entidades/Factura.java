package cl.fabian.examen.modelos.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Clase que representa una factura con información como ID, monto y fecha de pago.
 */
@Entity
@Table(name = "Facturas")
public class Factura {
    /**
     * Identificador único de la factura.
     */
    @Id
    @Column(name = "ID")
    private int id;

    /**
     * Monto de la factura.
     */
    @Column(name = "Monto", precision = 8, scale = 2)
    private BigDecimal monto;

    /**
     * Fecha en que se realizó el pago de la factura.
     */
    @Column(name = "Fecha_Pago")
    private LocalDate fechaPago;

    /**
     * Constructor por defecto de la clase Factura.
     */
    public Factura() {
    	
    }

    /**
     * Constructor de la clase Factura.
     *
     * @param id        El ID de la factura.
     * @param monto     El monto de la factura.
     * @param fechaPago La fecha en que se realizó el pago de la factura.
     */
	public Factura(int id, BigDecimal monto, LocalDate fechaPago) {
		super();
		this.id = id;
		this.monto = monto;
		this.fechaPago = fechaPago;
	}

    /**
     * Obtiene el ID de la factura.
     *
     * @return El ID de la factura.
     */
	public int getId() {
		return id;
	}

    /**
     * Establece el ID de la factura.
     *
     * @param id El ID de la factura a establecer.
     */
	public void setId(int id) {
		this.id = id;
	}

    /**
     * Obtiene el monto de la factura.
     *
     * @return El monto de la factura.
     */
	public BigDecimal getMonto() {
		return monto;
	}

    /**
     * Establece el monto de la factura.
     *
     * @param monto El monto de la factura a establecer.
     */
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

    /**
     * Obtiene la fecha en que se realizó el pago de la factura.
     *
     * @return La fecha de pago de la factura.
     */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

    /**
     * Establece la fecha en que se realizó el pago de la factura.
     *
     * @param fechaPago La fecha de pago de la factura a establecer.
     */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

    /**
     * Genera una representación en formato de cadena del objeto Factura.
     *
     * @return Una cadena que muestra la información de la factura.
     */
	@Override
	public String toString() {
		return "Factura [id=" + id + ", monto=" + monto + ", fechaPago=" + fechaPago + "]";
	}
}
