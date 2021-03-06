package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Avion;
import ec.edu.uce.repository.modelo.Cliente;

public interface IClienteRepo {

	public void create(Cliente cliente);
	public Cliente read(Integer id); 
	public void update(Cliente cliente); 
	public void delete(Integer id); 
}
