package classe;

public class Transaction {
	// Attributs Tansaction

	public int id;
	public String date;
	public float solde;

	// Constructeur
	public Transaction(int id, String date, float solde) {
		super();
		this.id = id;
		this.date = date;
		this.solde = solde;
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

}
