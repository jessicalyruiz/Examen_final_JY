package ec.edu.uce;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.repository.modelo.Avion;
import ec.edu.uce.service.IAvionService;

@SpringBootApplication
public class ExamenPaJyApplication implements CommandLineRunner{

	@Autowired
	IAvionService avionService;
	
	private static Logger LOG=Logger.getLogger(ExamenPaJyApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ExamenPaJyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Examen Final Jessica Yanez");
		
		Avion avion=this.avionService.read(2);
		avion.setNombre("Force two");
		
		this.avionService.update(avion);
		Avion avion2=this.avionService.read(1);
		avion2.setNombre("Force one");
		this.avionService.update(avion2);
	}

}
