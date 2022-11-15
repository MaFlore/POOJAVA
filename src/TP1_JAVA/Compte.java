package TP1_JAVA;

import java.util.ArrayList;
import java.util.Date;

public abstract class Compte {

	protected int code;
	protected double solde;
	protected ArrayList<Operation> listesOperations = new ArrayList<Operation>();
	
	public Compte() {
		
	}
	
	public Compte(int code, double solde) {
		this.code = code;
		this.solde = solde;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public abstract void debiter(int montant);

	public ArrayList<Operation> getListesOperations() {
		return listesOperations;
	}
	
	public void versement(int montant, Compte compte) {
        this.debiter(montant);
		compte.acrediter(montant);
		this.solde-=montant;
	}
	
	public void acrediter(int montant) {
		Versement v = new Versement(this.listesOperations.size()+1, new Date(), montant);
		listesOperations.add(v);
		this.solde+=montant;
	}
	
	@SuppressWarnings("unused")
	public void totalVersement() {
		double total = 0;
		for(Operation op: listesOperations){
			if( op instanceof Versement) {
				total+= op.getMontant();
			}
		}
	}
	
	@SuppressWarnings("unused")
	public void totalRetrait() {
		double total = 0;
		for(Operation op: listesOperations){
			if( op instanceof Retrait) {
				total+= op.getMontant();
			}
		}
	}
	
	public void listesDesOperations(){
		for(Operation op: listesOperations) {
			if(op instanceof Versement) {
				System.out.println("Numero versement : " + op.getNumero() + " Date versement : " +op.getDateOperation() + " Montant versement : " +op.getMontant());
			}
			else {
				System.out.println("Numero retrait : " + op.getNumero() + " Date retrait : " +op.getDateOperation() + " Montant retrait : " +op.getMontant());
			}
		}
	}
	
}
