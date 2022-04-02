package ec.edu.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.repository.modelo.CompraPasaje;
import ec.edu.uce.repository.modelo.Vuelo;
import ec.edu.uce.service.ICompraPasajeService;

@Controller
@RequestMapping("/empleados/")
public class empleadoController {

	@Autowired
	private ICompraPasajeService compraService;

	// primer metodo para hacer check in
	@GetMapping("hacerCheckin")
	public String obtenerPaginaIngresoDatos(CompraPasaje compra) {
		return "hacerCheckin";

	}

	// segundo metodo para para hacer check in
	@GetMapping("checkinListo")
	public String mostrarVuelos(CompraPasaje compra, Model modelo) {
		this.compraService.realizarCheckIn(compra.getNumero());

		return "checkinMsj";

	}

}
