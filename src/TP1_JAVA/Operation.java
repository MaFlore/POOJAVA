package TP1_JAVA;

import java.util.Date;

public class Operation {

	protected int numero;
	protected Date dateOperation;
	protected double montant;
	
	public Operation() {
		
	} 
	
	public Operation(int num, Date date, double montant) {
		super();
		this.numero = num;
		this.dateOperation = date;
		this.montant = montant;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

}
