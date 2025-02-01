
import java.util.ArrayList ;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		//Creation d'un objet personne
		Personne p = new Personne("AURIOL", 25);
		//afficher les propriétés
		System.out.println("le nom est: "+ p.getName() + "  l'age est:" + p.getAge());
		//System.out.println("l'age est: "+ p.getAge());
		///
		///
		 
		//creation d'un enseignant
		
		Enseignant e = new Enseignant("AURIOL", 25, "DOCTEUR", "Master");
		
		//affichage 
		//System.out.println(e.toString());
		System.out.println("le grade est:"+ e.getGrade());
		System.out.println("le diplome est:"+ e.getDiplome());
		System.out.println("le nom est:"+ e.getName());
		System.out.println("l'age est:"+ e.getAge());
		
		
		
		// Creation d'un etudiant
		
		Etudiant et = new Etudiant ("AURIOL", 25,"CMUDS-25SCI2000","INFORMATIQUE",4);
	System.out.println(et.toString());
		
		
		// liste d'etudiants en java
	 
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
		
		
		
	}
}


