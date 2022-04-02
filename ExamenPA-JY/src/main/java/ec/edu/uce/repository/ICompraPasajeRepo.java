package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Avion;
import ec.edu.uce.repository.modelo.CompraPasaje;

public interface ICompraPasajeRepo {

	public void create(CompraPasaje compraPasaje);
	public CompraPasaje read(Integer id); 
	public void update(CompraPasaje compraPasaje); 
	public void delete(Integer id); 
	
	public CompraPasaje buscarNumero(String numeroCompraPasaje);
}
