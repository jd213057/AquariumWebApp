package jd.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jd.entities.Aquarium;
import jd.entities.Constantes;
import jd.entities.Utilisateur;

public class UtilisateurDAO extends AbstractDAO<Utilisateur, Integer> {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(Constantes.UNIT_NAME);
	protected UtilisateurDAO(EntityManagerFactory emf) {
		super(emf, Utilisateur.class);

	}
	@Override
	protected EntityManagerFactory getEntityManagerFactory() {
		// TODO Auto-generated method stub
		return super.getEntityManagerFactory();
	}
	@Override
	public void create(Utilisateur entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
	}
	@Override
	public Utilisateur findById(Integer id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}
	@Override
	public void update(Utilisateur entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	

	

}
