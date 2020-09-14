package cl.toballatorre.simdos.modelos;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 * Entidad con una llave primaria compuesta por dos llaves foráneas
 * @author Cristobal L
 *
 */
@Entity
public class DetalleFactura {
	
	@EmbeddedId
	DetalleFacturaKey id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("facturaid")
	@JoinColumn(name="FACTURAID")
	private Factura factura;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("productoid")
	@JoinColumn(name="PRODUCTOID")
	private Producto producto;
	
	private int cantidad;
	
	public DetalleFactura() {
		
	}

	public DetalleFactura(DetalleFacturaKey id, Factura factura, Producto producto, int cantidad) {
		this.id = id;
		this.factura = factura;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public DetalleFacturaKey getId() {
		return id;
	}

	public void setId(DetalleFacturaKey id) {
		this.id = id;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
