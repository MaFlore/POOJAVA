# POOJAVA
				TP1 : Retour sur les bases du langage Java

On souhaite créer une application orientée objet Java qui permet de gérer des comptes bancaires. Chaque compte est défini par son code et son solde. Il existe deux types de comptes : les comptes épargnes et comptes courants. Un compte courant est caractérisé en plus par un découvert. Un compte épargne est un compte qui possède en plus un taux d’intérêt. Chaque compte peut subir plusieurs opérations. Il existe deux types d’opérations : versement et retrait. Chaque opération est définie par son numéro, sa date et son montant.

L’application doit permettre de : 
•	Créer des comptes
•	Effectuer un versement d’un montant dans un compte. Pour le compte épargne, le retrait ne peut s’effectuer que si le montant à retirer est inférieur au solde, alors que pour le compte courant, le retrait peut se faire à condition que le solde final ne soit pas inférieur au découvert. 
•	Effectuer un virement d’un montant d’un compte vers un autre. (Retirer le montant d’un compte et le verser vers un autre)
•	Consulter le solde du compte
•	Mettre à jour le solde du compte en tenant compte des intérêts. Cette opération ne devrait concerner que les comptes épargnes.
•	Consulter la liste des opérations effectuées sur le compte
•	Consulter le total des montants des versements
•	Consulter le total des montants des retraits

TAF : 
1.	Etablir un diagramme de classes
2.	Ecrire le programme Java qui prend en compte toutes les opérations et contraintes émises dans l’énoncé.
