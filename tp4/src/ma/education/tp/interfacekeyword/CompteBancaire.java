package ma.education.tp.interfacekeyword;

import ma.education.tp.Compte;

public class CompteBancaire implements Compte{

	private String numero;
	private int balance;
	
	public CompteBancaire(String numero) {
	this.numero = numero;
	}
	@Override
	public void deposer(int montant) {
	this.balance += montant;
	} 
	@Override
	public int retirer(int montant) {
	if (balance < montant) {
	return 0;
	} 
	return this.balance -= montant;
	} 
	
	@Override
	public int getBalance() {
	return this.balance;
	
	}
	public String getNumero() {
	return numero;
	}

	

}
