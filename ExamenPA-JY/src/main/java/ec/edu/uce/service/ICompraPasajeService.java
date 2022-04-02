package ec.edu.uce.service;

import ec.edu.uce.repository.modelo.CompraPasaje;

public interface ICompraPasajeService {

	public void create(CompraPasaje compraPasaje);
	public CompraPasaje read(Integer id); 
	public void update(CompraPasaje compraPasaje); 
	public void delete(Integer id); 
	
	public void reservarPasajes(String numeroVuelo);
	public void realizarCheckIn(String numeroCompraPasaje);
	
	public CompraPasaje buscarNumero(String numeroCompraPasaje);
}
