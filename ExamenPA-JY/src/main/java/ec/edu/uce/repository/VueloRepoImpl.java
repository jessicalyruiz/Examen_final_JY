package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.ExamenPaJyApplication;
import ec.edu.uce.repository.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepoImpl implements IVueloRepo{

	private static Logger LOG=Logger.getLogger(ExamenPaJyApplication.class);
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	public Vuelo read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

	@Override
	public void update(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public List<Vuelo>  buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo) {
		TypedQuery<Vuelo> myQuery=this.entityManager.createQuery("Select v from Vuelo v where v.origen=:valor1 and v.destino=valor2 and v.fechaVuelo=:valor3", Vuelo.class);
		myQuery.setParameter("valor1", origen);
		myQuery.setParameter("valor2", destino);
		myQuery.setParameter("valor3", fechaVuelo);
		return myQuery.getResultList();
	}

	@Override
	public Vuelo buscarNumero(String numeroVuelo) {
		TypedQuery<Vuelo> myQuery=this.entityManager.createQuery("Delect v fron Vuelo v where v.numero=:valor", Vuelo.class);
		myQuery.setParameter("valor", numeroVuelo);
		//relacionamientos
		Vuelo vuelo=myQuery.getSingleResult();
		LOG.info(vuelo.getAvion());
		
		return myQuery.getSingleResult();
	}
}
