package ec.edu.uce.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.repository.modelo.Avion;

//@Transactional
//@Rollback(true)
@SpringBootTest
class AvionServiceImplTest {

	@Autowired
	private IAvionService avionService;
	
	@Test
	void testCreate() {
		//fail("Not yet implemented");
		Avion avion=new Avion();
		avion.setCapacidadAsientos(Integer.valueOf(150));
		 this.avionService.create(avion);
		 assertThat(avion).isExactlyInstanceOf(Avion.class);
		 
	}

}
