package ec.edu.uce.service;

import ec.edu.uce.repository.modelo.Avion;

public interface IAvionService {

	public void create(Avion avion);
	public Avion read(Integer id); 
	public void update(Avion avion); 
	public void delete(Integer id); 
}
