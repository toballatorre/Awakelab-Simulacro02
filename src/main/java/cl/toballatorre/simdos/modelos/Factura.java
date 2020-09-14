package cl.toballatorre.simdos.modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Factura {
	
	@Id
	@Column(name="FACTURAID")
	private int id;
	private String cliente;
	private String fecha;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "factura")
	private List<DetalleFactura> listaDetalle;
	
	public Factura() {
		
	}
	
	public Factura(int id, String cliente, String fecha, List<DetalleFactura> listaDetalle) {
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
		this.listaDetalle = listaDetalle;
	}

	public Factura(int id, String cliente, String fecha) {
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<DetalleFactura> getListaDetalle() {
		return listaDetalle;
	}

	public void setListaDetalle(List<DetalleFactura> listaDetalle) {
		this.listaDetalle = listaDetalle;
	}
	
}
