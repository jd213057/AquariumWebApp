package jd.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name = "aquarium_savings")
@Access(AccessType.FIELD)
@NamedQuery(name = "Aquarium.getAll",query = "SELECT a FROM Aquarium a ")
@NamedQuery(name = "Aquarium.byNameRecord",query = "SELECT a FROM Aquarium a WHERE UPPER(a.nameRecord) LIKE :nameRecord")
public class Aquarium implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aquarium_id")
	private int idAquarium;
	
	@Column(name="dernieremaintenance")
	private LocalDate derniereMaintenance;
	@Column(name="prochainemaintenance")
	private LocalDate prochaineMaintenance = derniereMaintenance;
	@Column(name="nameRecord")
	private String nameRecord="nameRecord";
	@Column(name="nourriture")
	private boolean nourriture;
	@Column(name="changementEauBac")
	private boolean changementEauBac;
	@Column(name="filtres")
	private boolean filtres;
	@Column(name="revisionPompe")
	private boolean revisionPompe;
	@Column(name="prefiltre")
	private boolean prefiltre;
	@Column(name="nitrates")
	private int nitrates;
	@Column(name="nitrites")
	private int nitrites;
	@Column(name="co2")
	private int co2;
	@Column(name="pH")
	private double pH;
	@Column(name="cl2")
	private int cl;
	@Column(name="gH")
	private  int gH;
	@Column(name="kH")
	private int kH;
	@Column(name="compositionRepas")
	private String compositionRepas ="NONE";
	@Column(name="commentaire")
	private String commentaire ="NONE";

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinTable(name="aquarium_users_joint",
	joinColumns=@JoinColumn(name="aquarium_fk"),
	inverseJoinColumns=@JoinColumn(name="users_fk"))
	private Utilisateur utilisateur;
	
	public Aquarium() {}
	
	
	public Aquarium(String nameRecord) {
		super();
		this.nameRecord = nameRecord;
	}


	public Aquarium(int idAquarium, LocalDate derniereMaintenance, LocalDate prochaineMaintenance, String nameRecord,
			boolean nourriture, boolean changementEauBac, boolean filtres, boolean revisionPompe, boolean prefiltre,
			int nitrates, int nitrites, int co2, double pH, int cl, int gH, int kH, String compositionRepas,
			String commentaire, Utilisateur utilisateur) {
		super();
		this.idAquarium = idAquarium;
		this.derniereMaintenance = derniereMaintenance;
		this.prochaineMaintenance = prochaineMaintenance;
		this.nameRecord = nameRecord;
		this.nourriture = nourriture;
		this.changementEauBac = changementEauBac;
		this.filtres = filtres;
		this.revisionPompe = revisionPompe;
		this.prefiltre = prefiltre;
		this.nitrates = nitrates;
		this.nitrites = nitrites;
		this.co2 = co2;
		this.pH = pH;
		this.cl = cl;
		this.gH = gH;
		this.kH = kH;
		this.compositionRepas = compositionRepas;
		this.commentaire = commentaire;
		this.utilisateur = utilisateur;
	}


	public Aquarium(int idAquarium, LocalDate derniereMaintenance, LocalDate prochaineMaintenance, String nameRecord,
			boolean nourriture, boolean changementEauBac, boolean filtres, boolean revisionPompe, boolean prefiltre,
			int nitrates, int nitrites, int co2, double pH, int cl, int gH, int kH, String compositionRepas,
			String commentaire) {
		super();
		this.idAquarium = idAquarium;
		this.derniereMaintenance = derniereMaintenance;
		this.prochaineMaintenance = prochaineMaintenance;
		this.nameRecord = nameRecord;
		this.nourriture = nourriture;
		this.changementEauBac = changementEauBac;
		this.filtres = filtres;
		this.revisionPompe = revisionPompe;
		this.prefiltre = prefiltre;
		this.nitrates = nitrates;
		this.nitrites = nitrites;
		this.co2 = co2;
		this.pH = pH;
		this.cl = cl;
		this.gH = gH;
		this.kH = kH;
		this.compositionRepas = compositionRepas;
		this.commentaire = commentaire;
	}


	public Aquarium(LocalDate derniereMaintenance, LocalDate prochaineMaintenance, boolean nourriture, boolean changementEauBac,
			boolean filtres, boolean revisionPompe, boolean prefiltre, String compositionRepas, String commentaire) {
		super();
		this.derniereMaintenance = derniereMaintenance;
		this.prochaineMaintenance = prochaineMaintenance;
		this.nourriture = nourriture;
		this.changementEauBac = changementEauBac;
		this.filtres = filtres;
		this.revisionPompe = revisionPompe;
		this.prefiltre = prefiltre;
		this.compositionRepas = compositionRepas;
		this.commentaire = commentaire;
	}


	public Aquarium(int idAquarium, LocalDate derniereMaintenance, LocalDate prochaineMaintenance, int nitrates, int nitrites,
			int co2, double pH, int cl, int gH, int kH) {
		super();
		this.idAquarium = idAquarium;
		this.derniereMaintenance = derniereMaintenance;
		this.prochaineMaintenance = prochaineMaintenance;
		this.nitrates = nitrates;
		this.nitrites = nitrites;
		this.co2 = co2;
		this.pH = pH;
		this.cl = cl;
		this.gH = gH;
		this.kH = kH;
	}



	public Aquarium(LocalDate derniereMaintenance, LocalDate prochaineMaintenance, String nameRecord,
			boolean nourriture, boolean changementEauBac, boolean filtres, boolean revisionPompe, boolean prefiltre,
			int nitrates, int nitrites, int co2, double pH, int cl, int gH, int kH, String compositionRepas,
			String commentaire) {
		super();
		this.derniereMaintenance = derniereMaintenance;
		this.prochaineMaintenance = prochaineMaintenance;
		this.nameRecord = nameRecord;
		this.nourriture = nourriture;
		this.changementEauBac = changementEauBac;
		this.filtres = filtres;
		this.revisionPompe = revisionPompe;
		this.prefiltre = prefiltre;
		this.nitrates = nitrates;
		this.nitrites = nitrites;
		this.co2 = co2;
		this.pH = pH;
		this.cl = cl;
		this.gH = gH;
		this.kH = kH;
		this.compositionRepas = compositionRepas;
		this.commentaire = commentaire;
//		this.utilisateur = utilisateur;
	}


	@Override
	public String toString() {
		return "Aquarium [idAquarium=" + idAquarium + ", derniereMaintenance=" + derniereMaintenance
				+ ", prochaineMaintenance=" + prochaineMaintenance + ", nameRecord=" + nameRecord + ", nourriture="
				+ nourriture + ", changementEauBac=" + changementEauBac + ", filtres=" + filtres + ", revisionPompe="
				+ revisionPompe + ", prefiltre=" + prefiltre + ", nitrates=" + nitrates + ", nitrites=" + nitrites
				+ ", co2=" + co2 + ", pH=" + pH + ", cl=" + cl + ", gH=" + gH + ", kH=" + kH + ", compositionRepas="
				+ compositionRepas + ", commentaire=" + commentaire + ", utilisateur=" + utilisateur + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (changementEauBac ? 1231 : 1237);
		result = prime * result + cl;
		result = prime * result + co2;
		result = prime * result + ((commentaire == null) ? 0 : commentaire.hashCode());
		result = prime * result + ((compositionRepas == null) ? 0 : compositionRepas.hashCode());
		result = prime * result + ((derniereMaintenance == null) ? 0 : derniereMaintenance.hashCode());
		result = prime * result + (filtres ? 1231 : 1237);
		result = prime * result + gH;
		result = prime * result + idAquarium;
		result = prime * result + kH;
		result = prime * result + ((nameRecord == null) ? 0 : nameRecord.hashCode());
		result = prime * result + nitrates;
		result = prime * result + nitrites;
		result = prime * result + (nourriture ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(pH);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (prefiltre ? 1231 : 1237);
		result = prime * result + ((prochaineMaintenance == null) ? 0 : prochaineMaintenance.hashCode());
		result = prime * result + (revisionPompe ? 1231 : 1237);
		result = prime * result + ((utilisateur == null) ? 0 : utilisateur.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aquarium other = (Aquarium) obj;
		if (changementEauBac != other.changementEauBac)
			return false;
		if (cl != other.cl)
			return false;
		if (co2 != other.co2)
			return false;
		if (commentaire == null) {
			if (other.commentaire != null)
				return false;
		} else if (!commentaire.equals(other.commentaire))
			return false;
		if (compositionRepas == null) {
			if (other.compositionRepas != null)
				return false;
		} else if (!compositionRepas.equals(other.compositionRepas))
			return false;
		if (derniereMaintenance == null) {
			if (other.derniereMaintenance != null)
				return false;
		} else if (!derniereMaintenance.equals(other.derniereMaintenance))
			return false;
		if (filtres != other.filtres)
			return false;
		if (gH != other.gH)
			return false;
		if (idAquarium != other.idAquarium)
			return false;
		if (kH != other.kH)
			return false;
		if (nameRecord == null) {
			if (other.nameRecord != null)
				return false;
		} else if (!nameRecord.equals(other.nameRecord))
			return false;
		if (nitrates != other.nitrates)
			return false;
		if (nitrites != other.nitrites)
			return false;
		if (nourriture != other.nourriture)
			return false;
		if (Double.doubleToLongBits(pH) != Double.doubleToLongBits(other.pH))
			return false;
		if (prefiltre != other.prefiltre)
			return false;
		if (prochaineMaintenance == null) {
			if (other.prochaineMaintenance != null)
				return false;
		} else if (!prochaineMaintenance.equals(other.prochaineMaintenance))
			return false;
		if (revisionPompe != other.revisionPompe)
			return false;
		if (utilisateur == null) {
			if (other.utilisateur != null)
				return false;
		} else if (!utilisateur.equals(other.utilisateur))
			return false;
		return true;
	}


	protected int getIdAquarium() {
		return idAquarium;
	}
	public void setIdAquarium(int idAquarium) {
		this.idAquarium = idAquarium;
	}
	protected LocalDate getDerniereMaintenance() {
		return derniereMaintenance;
	}
	public void setDerniereMaintenance(LocalDate derniereMaintenance) {
		this.derniereMaintenance = derniereMaintenance;
	}
	protected LocalDate getProchaineMaintenance() {
		return prochaineMaintenance;
	}
	public void setProchaineMaintenance(LocalDate prochaineMaintenance) {
		this.prochaineMaintenance = prochaineMaintenance;
	}
	
	
	protected String getNameRecord() {
		return nameRecord;
	}


	protected void setNameRecord(String nameRecord) {
		this.nameRecord = nameRecord;
	}


	protected int getNitrates() {
		return nitrates;
	}


	protected void setNitrates(int nitrates) {
		this.nitrates = nitrates;
	}


	protected boolean isNourriture() {
		return nourriture;
	}
	protected void setNourriture(boolean nourriture) {
		this.nourriture = nourriture;
	}
	protected boolean isChangementEauBac() {
		return changementEauBac;
	}
	protected void setChangementEauBac(boolean changementEauBac) {
		this.changementEauBac = changementEauBac;
	}
	protected boolean isFiltres() {
		return filtres;
	}
	protected void setFiltres(boolean filtres) {
		this.filtres = filtres;
	}
	protected boolean isRevisionPompe() {
		return revisionPompe;
	}
	protected void setRevisionPompe(boolean revisionPompe) {
		this.revisionPompe = revisionPompe;
	}
	protected boolean isPrefiltre() {
		return prefiltre;
	}
	protected void setPrefiltre(boolean prefiltre) {
		this.prefiltre = prefiltre;
	}
	protected int getNitrites() {
		return nitrites;
	}
	protected void setNitrites(int nitrites) {
		this.nitrites = nitrites;
	}
	protected int getCo2() {
		return co2;
	}
	protected void setCo2(int co2) {
		this.co2 = co2;
	}
	protected double getpH() {
		return pH;
	}
	protected void setpH(double pH) {
		this.pH = pH;
	}
	protected int getCl() {
		return cl;
	}
	protected void setCl(int cl) {
		this.cl = cl;
	}
	protected int getgH() {
		return gH;
	}
	protected void setgH(int gH) {
		this.gH = gH;
	}
	protected int getkH() {
		return kH;
	}
	protected void setkH(int kH) {
		this.kH = kH;
	}
	protected String getCompositionRepas() {
		return compositionRepas;
	}
	protected void setCompositionRepas(String compositionRepas) {
		this.compositionRepas = compositionRepas;
	}
	protected String getCommentaire() {
		return commentaire;
	}
	protected void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
