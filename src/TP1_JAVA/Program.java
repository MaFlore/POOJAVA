package TP1_JAVA;

import java.util.List;

public class Program {
	
	public static void main(String args[]) {
		Compte cc = new CompteCourant(1 , 760000, -200);
		Compte ce = new CompteEpargne(2, 0, 0.15);
		cc.acrediter(15000);
		cc.versement(300000, ce);
		cc.getSolde();
		((CompteEpargne) ce).updateSolde();
		List<Operation> listesOperations = cc.getListesOperations();
	}
}
