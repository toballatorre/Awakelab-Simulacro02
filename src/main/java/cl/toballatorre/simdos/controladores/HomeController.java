package cl.toballatorre.simdos.controladores;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.toballatorre.simdos.modelos.Factura;
import cl.toballatorre.simdos.repositorios.FacturaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path = "/")
public class HomeController {
	
   //========== Atributos ==========
	@Autowired
	FacturaRepository fr;

    @GetMapping
    public String paginaInicio(@RequestParam Optional<Integer> id, HttpServletRequest request, Model modelo) {
        
    	// Verificar si hay un valor para buscar una factura
        if (id.isPresent()) {
        	int idFactura = id.get();
        	Optional<Factura> factura = fr.findById(idFactura);
        	
        	// Verificar si existe una factura
        	if (factura.isPresent()) {
        		
        		// Insertar la factura en el modelo
        		modelo.addAttribute("factura", factura.get());
			}
        	
        	// Mostrar vista con el modelo
        	return "home";
		}
        
        // se envia un valor null para mostrar la vista limpia
        modelo.addAttribute("factura", null);
        // Mostrar vista
        return "home";
    }

}
