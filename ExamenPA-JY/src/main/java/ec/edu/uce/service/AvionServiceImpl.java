package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IAvionRepo;
import ec.edu.uce.repository.modelo.Avion;

@Service
public class AvionServiceImpl implements IAvionService{

	@Autowired
	private IAvionRepo avionRepo;

	@Override
	public void create(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepo.create(avion);
	}

	@Override
	public Avion read(Integer id) {
		// TODO Auto-generated method stub
		return this.avionRepo.read(id);
	}

	@Override
	public void update(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepo.update(avion);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.avionRepo.delete(id);
	}
}
