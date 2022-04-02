package ec.edu.uce.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.uce.repository.modelo.Avion;
import ec.edu.uce.repository.modelo.Vuelo;

//@Transactional
//@Rollback(true)
@SpringBootTest
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
		
		
		
		Vuelo vuelo=new Vuelo();
		vuelo.setAsientosDisponibles(avion.getCapacidadAsientos());
		vuelo.setAvion(avion);
		vuelo.setCategoria("E");
		vuelo.setDestino("New York");
		vuelo.setEstado("D");
		vuelo.setFechaVuelo(LocalDateTime.of(2022, 04, 30, 0, 0));
		vuelo.setNumero("AAA-789");
		vuelo.setOrigen("Quito");
		vuelo.setValorAsiento(new BigDecimal(600));
		
		List<Vuelo> vuelos=new ArrayList<>();
		vuelos.add(vuelo);
		avion.setVuelos(null);
		 //this.avionService.create(avion);
		this.vueloService.create(vuelo);
		assertThat(vuelo).isNotNull();
	}

}
