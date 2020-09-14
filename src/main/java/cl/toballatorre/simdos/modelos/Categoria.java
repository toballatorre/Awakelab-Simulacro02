package cl.toballatorre.simdos.modelos;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	//========== ATRIBUTOS ==========
	@Id
	@Column(name="CATEGORIAID")
	private int id;
	private String nombre;
	@OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
	private List<Producto> listaProductos;
	
	//========== CONSTRUCTORES ==========
	public Categoria() {
		
	}
	
	public Categoria(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
}
