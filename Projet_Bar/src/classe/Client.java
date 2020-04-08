package classe;

public class Client {
	// Attributs Client
	public int id;
	public String nom;
	public String prenom;
	public float solde;
	public String dateOuverture;
	public String derniereCommande;

	// Constructeur
	public Client(int id, String nom, String prenom, float solde, String dateOuverture, String derniereCommande) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.derniereCommande = derniereCommande;
	}

	// Getter et setters
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

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public String getDerniereCommande() {
		return derniereCommande;
	}

	public void setDerniereCommande(String derniereCommande) {
		this.derniereCommande = derniereCommande;
	}

}
