import java.util.Scanner;


public class UIEatHub {
	static Scanner sca = new Scanner(System.in);  // Create a Scanner object
    static ModelEatHub model = new ModelEatHub(); 
	
	public static void main(String[] args) {
		while(true) {

      
			System.out.println("\nVoulez-vous:\n"
					+ "\t1. Ajouter un client\n"
					+ "\t2. Passer une commade\n"
					+ "\t3. Afficher la liste de tous les clients\n"
					+ "\t4. Afficher la liste de toutes les commandes\n"  
					+ "\t5. Effacer une commade\n"
					+ "\t6. Effacer un client\n"
					+ "\t7. Charger un fichier CLient\n"
					+ "\t8. Sauvegarder un fichier client\n"
					+ "\t9. Quitter le programme");

			//suivant la reponse faire des choses differentes
			switch (sca.nextInt()) {
			case 1: ajouterClient(); break;
			case 2: ajouterCommande(); break;
			case 3: afficherClients(); break;
			case 4: afficherCommandes(); break;
			case 5: effacerCommande(); break;
			case 6: effacerClient(); break;
			case 7: chargerDonnees(); break;
			case 8: sauverDonnees(); break;
			default: return;
			}
		}
	}

	static void ajouterClient() {   // 1.
		
		System.out.println("Ajouter le telephone:");
		String tel = sca.next();
    
		System.out.println("Ajouter le prenom:");
		String prenom = sca.next();

		System.out.println("Ajouter l'addresse:");
		String adr = sca.next();
    sca.nextLine();

		model.ajouterClient(tel, prenom, adr);
	}
	
	static void ajouterCommande() {    // 2.
		System.out.println("Ajouter le prenom:");
    String prenom = sca.next();
    
    System.out.println("Quelle est la commande");
    String commande = sca.next();

    System.out.println("Quelle est l'heure de livraison");
    String heur = sca.next();


    int numeroClient = model.trouvClient(prenom);
    if (numeroClient!=-1) 
    model.ajouterCommande(numeroClient, commande,heur);
	}
	
  	static void afficherClients() {  // 3. 
    System.out.println("Ajouter le telephone:");
		  String tel = sca.next();

    System.out.println("Ajouter le prenom:");
      String prenom = sca.next();
		  System.out.println(model.donnerTousClients());
	}

	static void afficherCommandes() {  // 4. 

     System.out.println("Ajouter le telephone:");
		 String tel = sca.next();

	   System.out.println("Ajouter le prenom:");
		 String prenom = sca.next();

     System.out.println("Quelle est la commande");
     String commande = sca.next();

     System.out.print(model.donnerToutesCommandes());
	}

  	static void effacerCommande() {   // 5. 
		System.out.println("Ajouter le prenom:");
	 	String prenom = sca.next();


    System.out.println("Quelle est la commande");
    String commande = sca.next();

    if (prenom != commande);
      System.out.println("Cette commande à été effacé");

    int numeroClient = model.trouvClient(prenom);
    if (numeroClient!=-1) 
		model.effacerClient(numeroClient);
	}

	static void effacerClient() {  // 6.
		System.out.println("Ajouter le prenom:");
		String prenom = sca.next();	

    if (prenom != prenom);
      System.out.println("Ce client à été effacé");

			int numeroClient = model.trouvClient(prenom);
      if (numeroClient!=-1) 
      model.effacerClient(numeroClient);
	}
			
	static void chargerDonnees() {  // 7. 
		//SeriEatHub.chargerFichier("FichierEatHub.txt", model);
    
    System.out.println("Quel est le teléphone du client");
      String client = sca.next();

    System.out.println("Ajouter le prenom:");
	 	  String prenom = sca.next();
      
		  System.out.println(model.donnerTousClients());
	}
	
	static void sauverDonnees() {  // 8. 
		//SeriEatHub.sauverFichier("FichierEatHub2.txt", model);	

  System.out.println("Ajouter le prenom:");
	 	String prenom = sca.next();

     System.out.println(model.donnerTousClients());

  System.out.println("Vos données ont été sauvé");
	}
	
}
