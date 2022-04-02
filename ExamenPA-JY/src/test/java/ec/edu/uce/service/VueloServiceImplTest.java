package ec.edu.uce.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ec.edu.uce.repository.modelo.Avion;
import ec.edu.uce.repository.modelo.Vuelo;

class VueloServiceImplTest {

	@Autowired
	private IAvionService avionService;
	
	@Autowired
	private IVueloService vueloService;
	
	@Test
	void testCreate() {
		//fail("Not yet implemented");
		Avion avion=new Avion();
		avion.setCapacidadAsientos(Integer.valueOf(200));
		 this.avionService.create(avion);
		
		
		Vuelo vuelo=new Vuelo();
		vuelo.setAsientosDisponibles(avion.getCapacidadAsientos());
		vuelo.setAvion(avion);
		vuelo.setCategoria("E");
	}

}
