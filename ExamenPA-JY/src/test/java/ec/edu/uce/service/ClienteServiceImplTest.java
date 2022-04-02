package ec.edu.uce.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.repository.modelo.Cliente;
//@Transactional
//@Rollback(true)
@SpringBootTest
class ClienteServiceImplTest {

	@Autowired
	private IClienteService clienteService;
	@Test
	void testCreate() {
		//fail("Not yet implemented");
		
		Cliente cliente=new Cliente();
		cliente.setApellido("Yanez");
		cliente.setCedula("2300");
		cliente.setNombre("Jessi");
		this.clienteService.create(cliente);
		assertThat(cliente).isNotNull();
	}

}
