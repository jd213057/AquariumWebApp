package jd.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "aquarium_users")
@Access(AccessType.FIELD)
@NamedQuery(name = "Utilisateur.getAll",query = "SELECT u FROM Utilisateur u ")
@NamedQuery(name = "Utilisateur.byName",query = "SELECT u FROM Utilisateur u WHERE UPPER(u.nom) LIKE :nom")
public class Utilisateur implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="age")
	private int age;
	@Column(name="user")
	private String user;
	@Column(name="password")
	private String password;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="utilisateur")
	private List<Aquarium> aquariums;
	
	public Utilisateur() {}

	public Utilisateur(int id, String nom, String prenom, int age, String user, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.user = user;
		this.password = password;
	}


	public Utilisateur(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Utilisateur(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	
	
	public Utilisateur(String nom, String prenom, int age, String user, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.user = user;
		this.password = password;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
