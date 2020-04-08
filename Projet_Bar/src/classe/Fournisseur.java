package classe;

public class Fournisseur {
	// Attributs Fournisseur
	public int id;
	public String nom;
	public String lieu;
	public int delai;

	// Constructeur
	public Fournisseur(int id, String nom, String lieu, int delai) {
		super();
		this.id = id;
		this.nom = nom;
		this.lieu = lieu;
		this.delai = delai;
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

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

}
