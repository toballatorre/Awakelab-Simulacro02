package cl.toballatorre.simdos.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * Entidad que sirve para hacer una llave primaria para poder manejar
 * la entidad DetalleFactura ya que tiene una llave primaria compuesta
 * @author Cristobal L
 *
 */
@Embeddable
public class DetalleFacturaKey implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="FACTURAID")
	private int facturaid;
	@Column(name="PRODUCTOID")
	private int productoid;
	
	public DetalleFacturaKey() {
	}

	public DetalleFacturaKey(int facturaid, int productoid) {
		this.facturaid = facturaid;
		this.productoid = productoid;
	}

	public int getFacturaid() {
		return facturaid;
	}

	public void setFacturaid(int facturaid) {
		this.facturaid = facturaid;
	}

	public int getProductoid() {
		return productoid;
	}

	public void setProductoid(int productoid) {
		this.productoid = productoid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + facturaid;
		result = prime * result + productoid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleFacturaKey other = (DetalleFacturaKey) obj;
		if (facturaid != other.facturaid)
			return false;
		if (productoid != other.productoid)
			return false;
		return true;
	}
	
}
