package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Avion;

public interface IAvionRepo {

	public void create(Avion avion);
	public Avion read(Integer id); 
	public void update(Avion avion); 
	public void delete(Integer id); 
}
