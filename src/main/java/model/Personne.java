package model;
// classe model - represente une table dans la base de données
public class Personne {

	private Integer id;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String adresse;
	private Integer telephone;
	
	
	public Personne() {
		
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, String dateNaissance, String adresse, Integer telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + ", telephone=" + telephone + "]";
	}
	

	
	
}
