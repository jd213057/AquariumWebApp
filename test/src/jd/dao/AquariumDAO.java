package jd.dao;
import jd.entities.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AquariumDAO extends AbstractDAO<Aquarium, Integer>  {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(Constantes.UNIT_NAME);

	public AquariumDAO(EntityManagerFactory emf) {
		super(emf, Aquarium.class);
	
	}
	

	public List<Aquarium> getAquariumByNameRecord(String nameRecord) {
		EntityManager em =getEntityManagerFactory().createEntityManager();
		List<Aquarium> aquariumResults = (List<Aquarium>) em.createNamedQuery("Aquarium.byNameRecord",Aquarium.class)
				.getResultList();
		em.close();
		return aquariumResults;
	}
	
	public List<Aquarium> getAllAquariumRecords() {
		EntityManager em =getEntityManagerFactory().createEntityManager();
		List<Aquarium> aquariumResults = (List<Aquarium>) em.createNamedQuery("Aquarium.getAll",Aquarium.class)
				.getResultList();
		em.close();
		return aquariumResults;
	}
	
	public List<Utilisateur> getAllUsers() {
		EntityManager em =getEntityManagerFactory().createEntityManager();
		List<Utilisateur> utilisateurs = em.createNamedQuery("Utilisateur.getAll",Utilisateur.class)
				.getResultList();
		em.close();
		return utilisateurs;
	}
	
	public List<Utilisateur> getUserByName(String nom) {
		EntityManager em =getEntityManagerFactory().createEntityManager();
		List<Utilisateur> utilisateurs = (List<Utilisateur>) em.createNamedQuery("Utilisateur.byName",Utilisateur.class)
				.getResultList();
		em.close();
		return utilisateurs;
	}


	@Override
	protected EntityManagerFactory getEntityManagerFactory() {
		// TODO Auto-generated method stub
		return super.getEntityManagerFactory();
	}


	@Override
	public void create(Aquarium entity) {
		// TODO Auto-generated method stub
		super.create(entity);
	}


	@Override
	public Aquarium findById(Integer id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}


	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}


	@Override
	public void update(Aquarium entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}


	public void create(Utilisateur utilisateur) {
		super.create(utilisateur);		
	}
	
	
	

}
