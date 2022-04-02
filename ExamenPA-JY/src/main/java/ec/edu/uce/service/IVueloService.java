package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.repository.modelo.Vuelo;

public interface IVueloService {

	public void create(Vuelo vuelo);
	public Vuelo read(Integer id); 
	public void update(Vuelo vuelo); 
	public void delete(Integer id); 
	
	public List<Vuelo>  buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo);
	
	public List<Vuelo> busquedaParalelo(String origen, String destino, LocalDateTime fechaVuelo);
	
	public Vuelo buscarNumero(String numeroVuelo);
	
}
