package cl.toballatorre.simdos.modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Producto {

	//========== ATRIBUTOS ==========
	@Id
	@Column(name="PRODUCTOID")
	private int id;
	private String nombre;
	private double valor;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "CATEGORIAID", nullable = true)
	private Categoria categoria;
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "producto")
	private List<DetalleFactura> listaDetalle;

	//========== CONSTRUCTORES ==========
	public Producto() {
		
	}
	
	public Producto(int id, String nombre, double valor, Categoria categoria, List<DetalleFactura> listaDetalle) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.categoria = categoria;
		this.listaDetalle = listaDetalle;
	}

	public Producto(int id, String nombre, double valor, Categoria categoria) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.categoria = categoria;
	}
	
	//========== GETTERS N SETTERS ==========
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<DetalleFactura> getListaDetalle() {
		return listaDetalle;
	}

	public void setListaDetalle(List<DetalleFactura> listaDetalle) {
		this.listaDetalle = listaDetalle;
	}
}
