package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.repository.modelo.CompraPasaje;

@Repository
@Transactional
public class CompraPasajeRepoImpl implements ICompraPasajeRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.entityManager.persist(compraPasaje);
	}

	@Override
	public CompraPasaje read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CompraPasaje.class, id);
	}

	@Override
	public void update(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.entityManager.merge(compraPasaje);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}
}
