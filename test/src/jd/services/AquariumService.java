package jd.services;
import jd.dao.*;
import jd.entities.Aquarium;
import jd.entities.Utilisateur;

import java.util.List;

import javax.persistence.EntityManagerFactory;

public class AquariumService {
	private AquariumDAO dao;
	public AquariumService(EntityManagerFactory emf) {
		AquariumDAO dao = new AquariumDAO(emf);
	}
	
	public List<Aquarium> getAquariumByNameRecord(String nameRecord) {
		return dao.getAquariumByNameRecord(nameRecord);
	}
	
	public List<Aquarium> getAllAquariumRecords() {
		return dao.getAllAquariumRecords();
	}
	
	public List<Utilisateur> getAllUsers() {
		return dao.getAllUsers();
	}
	
	public List<Utilisateur> getUserByName(String nom) {
		return dao.getUserByName(nom);
	}

	public void create(Utilisateur utilisateur) {
		dao.create(utilisateur);
		
	}
	
	public void create(Aquarium aquarium) {
		dao.create(aquarium);
		
	}


}
