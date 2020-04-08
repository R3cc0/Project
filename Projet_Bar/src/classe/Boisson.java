package classe;

public class Boisson {

	// Attributs Boisson
	public int id;
	public String nom;
	public String marque;
	public int quantite;
	public String dateAchat;
	public String fournisseur;
	public float prixAchat;
	public float prixVente;

	// Constructeur
	public Boisson(int id, String nom, String marque, int quantite, String dateAchat, String fournisseur,
			float prixAchat, float prixVente) {
		super();
		this.id = id;
		this.nom = nom;
		this.marque = marque;
		this.quantite = quantite;
		this.dateAchat = dateAchat;
		this.fournisseur = fournisseur;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
	}

	// Getters and setters
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

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(String dateAchat) {
		this.dateAchat = dateAchat;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public float getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	public float getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}

}
