package ec.edu.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.repository.modelo.Vuelo;
import ec.edu.uce.service.IVueloService;



@Controller
@RequestMapping("/clientes/")
public class clienteController {

	@Autowired
	private IVueloService vueloService;
	
	// primer metodo para Buscar vuelos
			@GetMapping("buscarVuelos")
			public String obtenerPaginaIngresoDatos(Vuelo vuelo) {
				return "buscarVuelos";

			}

			// segundo metodo para Buscar vuelos
			@GetMapping("mostrar/vuelosDisponibles")
			public String mostrarVuelos(Vuelo vuelo, Model modelo) {
				List<Vuelo> vuelos=this.vueloService.busquedaParalelo(vuelo.getOrigen(), vuelo.getDestino(), vuelo.getFechaVuelo());
						
				modelo.addAttribute("vuelos", vuelos);
				return "mostrarVuelos";

			}

}
