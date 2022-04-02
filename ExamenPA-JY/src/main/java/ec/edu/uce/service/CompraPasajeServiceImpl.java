package ec.edu.uce.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.ExamenPaJyApplication;
import ec.edu.uce.repository.ICompraPasajeRepo;
import ec.edu.uce.repository.modelo.CompraPasaje;
import ec.edu.uce.repository.modelo.Vuelo;

@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService{
	
	private static Logger LOG=Logger.getLogger(ExamenPaJyApplication.class);
	@Autowired
	private ICompraPasajeRepo compraRepo;
	
	@Autowired
	private IVueloService vueloService;

	@Override
	public void create(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraRepo.create(compraPasaje);
	}

	@Override
	public CompraPasaje read(Integer id) {
		// TODO Auto-generated method stub
		return this.compraRepo.read(id);
	}

	@Override
	public void update(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraRepo.update(compraPasaje);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.compraRepo.delete(id);
	}

	@Override
	@Transactional
	public void reservarPasajes(String numeroVuelo) {
		// TODO Auto-generated method stub
		Vuelo vuelo=this.vueloService.buscarNumero(numeroVuelo);
		if(vuelo.getEstado().equalsIgnoreCase("D")) {
			LOG.info("cantidad Asientos ocupados");
		}
	}

	@Override
	public void realizarCheckIn(String numeroCompraPasaje) {
		// TODO Auto-generated method stub
		CompraPasaje compra=this.buscarNumero(numeroCompraPasaje);
		compra.setEstado("I");
		this.update(compra);
	}

	@Override
	public CompraPasaje buscarNumero(String numeroCompraPasaje) {
		// TODO Auto-generated method stub
		return this.compraRepo.buscarNumero(numeroCompraPasaje);
	}
}
