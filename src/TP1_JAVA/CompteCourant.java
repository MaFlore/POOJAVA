package TP1_JAVA;

import java.util.Date;

public class CompteCourant extends Compte{

	double decouvert;
	
	public CompteCourant(int code, double solde, double decouvert) {
		
		super(code, solde);
		this.decouvert = decouvert;
	}

	@Override
	public void debiter(int montant) {
		Retrait r = new Retrait(this.listesOperations.size()+1, new Date(), montant);
        if(this.solde-montant < this.decouvert) {
			listesOperations.add(r);
			this.solde-=montant;
            System.out.println("Retrait effectué avec succès...");
            System.out.println("Votre nouveau solde est : "+ this.getSolde() + " Euro\n");
        }
        else
            System.out.println("Solde du compte insuffisant pour effectué un retrait...\n");
	}
}

