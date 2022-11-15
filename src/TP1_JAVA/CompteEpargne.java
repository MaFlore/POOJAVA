package TP1_JAVA;

import java.util.Date;

public class CompteEpargne extends Compte{

	double  taux;
	
	public CompteEpargne(int code, double solde, double taux) {
		super(code, solde);
		this.taux = taux;
	}
	
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public void debiter(int montant) {
       
		Retrait r = new Retrait(this.listesOperations.size()+1, new Date(), montant);
		if(montant < this.solde) {
			listesOperations.add(r);
			this.solde-=montant;
			System.out.println("Retrait effectué avec succès...");
	        System.out.println("Votre nouveau solde est : "+ this.getSolde() + " Euro\n");
		}
		 else
	        System.out.println("Solde du compte insuffisant pour effectué un retrait...\n");
	}
	
	public void updateSolde() {
		this.solde *= (1 + this.getTaux());
	}

}
