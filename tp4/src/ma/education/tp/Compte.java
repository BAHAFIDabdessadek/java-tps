package ma.education.tp;

public interface Compte {
	
	void deposer(int montant);
	int retirer(int montant);
	int getBalance();

}
