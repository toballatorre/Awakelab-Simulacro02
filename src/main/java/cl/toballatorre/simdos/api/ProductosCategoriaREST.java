package cl.toballatorre.simdos.api;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.toballatorre.simdos.modelos.Categoria;
import cl.toballatorre.simdos.modelos.Producto;
/**
 * Controller de tipo REST para retornar una lista de productos según el identificador de categoría
 * 
 * @author Cristobal L
 *
 */
import cl.toballatorre.simdos.repositorios.CategoriaRepository;

@RestController
@RequestMapping(path = "/api/categoria", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductosCategoriaREST {
	
	@Autowired
	CategoriaRepository cr;
	
	private static final Logger logger = LogManager.getLogger(ProductosCategoriaREST.class);
	
	//Método usando get para obtener la lista de productos por la categoría seleccionada
	@GetMapping("/{id}")
	public List<Producto> productoPorCategoria(@PathVariable int id){
		
		// Busca si existe una categoría
		Optional<Categoria> categoria = cr.findById(id);
		
		// Si está presente busca la lista de productos
		if (categoria.isPresent()) {
			// Debugger
			logger.info("API: Buscando los productos para la categoría: {}", categoria.get().getNombre());
			
			// Se obtiene la clase categoría para no usar el Optional
			Categoria c = categoria.get();
			
			// Busca llama la lista de categoría
			List<Producto> listaP = c.getListaProductos();
			
			// Debugger mostrando la lista de productos de la categoria
			logger.info("API: Lista de produtcos: {}", listaP);
			return listaP;
		}else {
			
			//Debuger al no encontrar una categoría
			logger.info("API: Categoría no encontrada");
			return null;
		}
		
	}
}
