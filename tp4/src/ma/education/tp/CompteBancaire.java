package ma.education.tp;

public class CompteBancaire implements Compte {

	private String numero;
	private int balance;
	
	@Override
	public void deposer(int montant) {
		this.balance+=montant;
		
	}

	@Override
	public int retirer(int montant) {
		if (balance< montant) { 
			return 0;

	}
		return this.balance-=montant;
	}

	@Override
	public int getBalance() {
		
		return this.balance;
	}
	public CompteBancaire(String numero) {
		this.numero = numero;}

	public String getNumero() {
		return numero;
	}
}
