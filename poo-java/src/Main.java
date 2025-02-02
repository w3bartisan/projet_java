
import java.util.ArrayList ;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		//Creation d'un objet personne
		//Personne p = new Personne("AURIOL", 25);
		//afficher les propriétés
		//System.out.println("le nom est: "+ p.getName() + "  l'age est:" + p.getAge());
		//System.out.println("l'age est: "+ p.getAge());
		 
		//creation d'un enseignant
		
		//Enseignant e = new Enseignant("AURIOL", 25, "DOCTEUR", "Master");
		
		//affichage 
		/*System.out.println(e.toString());
		System.out.println("le grade est:"+ e.getGrade());
		System.out.println("le diplome est:"+ e.getDiplome());
		System.out.println("le nom est:"+ e.getName());
		System.out.println("l'age est:"+ e.getAge());
		
		
		
		// Creation d'un etudiant
		
		Etudiant et = new Etudiant ("AURIOL", 25,"CMUDS-25SCI2000","INFORMATIQUE",4);
		System.out.println(et.afficheMonNom());
		
		Personne p1 = new Personne("PRO", 30);
		
		System.out.println(p1.afficheMonNom());
		*/
		/* liste d'etudiants en java
	 
		List<Etudiant> listEtud = new ArrayList<>();
		
		listEtud.add(new Etudiant ("MBAPPE", 25,"CMUDS-25SCI2500","INFORMATIQUE",4));
		listEtud.add(new Etudiant ("PRO", 25,"CMUDS-25SCI2080","INFORMATIQUE",4));
		listEtud.add(new Etudiant ("VINI", 25,"CMUDS-25SCI2040","INFORMATIQUE",4));
		listEtud.add(new Etudiant ("BLLGHM", 25,"CMUDS-25SCI2300","INFORMATIQUE",4));
		
		System.out.println("les etudiants sont:");
		
		
		// affichage en utilisant la boucle for
		
		for (int i=0; i<listEtud.size();i++) {
			Etudiant e1 = listEtud.get(i);
			System.out.println(e1.toString());
		}
		
		// Affichage en utilisant la boucle forEach
		
	//	for (Etudiant etudiant : listEtud) {
	//		System.out.println(etudiant.toString());
	//	}
		
		//Affichage en utilisant la map
		
		System.out.println(listEtud);
		
		listEtud.remove(1);
		System.out.println(listEtud);
		
		*/
		/* Polymorphisme
		
		Personne per = new Etudiant ("AURIOL", 25,"CMUDS-25SCI2000","INFORMATIQUE",4);
		Personne per2 = new Enseignant("AURIOL", 25, "DOCTEUR", "Master");
		*/
		
		EtudiantService service = new EtudiantService();
		try {
			System.out.println(service.listesEtudiants());
		} catch (Exception e) {
			e.getMessage();
		}
		Etudiant p = new Etudiant ("AURIOL", 25,"CMUDS-25SCI2000","INFORMATIQUE",4);
		service.createEtudiant(p);
		try {
			System.out.println(service.listesEtudiants());
		} catch (Exception e) {
			e.getMessage();
		}
		Etudiant p2 = new Etudiant ("PRO", 25,"CMUDS-25SCI2000","INFORMATIQUE",4);
		service.updateEtudiant(p2, 0);
		try {
			System.out.println(service.listesEtudiants());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		// Personne p3 = new Personne("paul"); impossible car Personne est une classe abstraite  
		
		ServiceEnseigant servv = new ServiceEnseigant();
		
		try {
			System.out.println(servv.listEns());
		} catch (Exception es) {
			es.getMessage(); }
		
		Enseignant ess = new Enseignant("PRO",50,"DOCTEUR","Master");
		
		// creation d'un enseignant la methode create
		
		servv.createEnseignant(ess);
		System.out.println(servv.listEns);
		
		// modification d'un enseignant
		
		Enseignant esss = new Enseignant("Brad", 35, "Professeur", "Doctorat");
		
		servv.updateEnseigant(0, esss);
		System.out.println(servv.listEns);
		
		//lister un enseignant 
		
		
		
		
	} 
	
	}


