
public class Main {

	public static void main(String[] args) {
		
		/*
		//Creation d'un objet personne
		Personne p = new Personne("AURIOL", 25);
		//afficher les propriétés
		System.out.println("le nom est: "+ p.getName() + "  l'age est:" + p.getAge());
		//System.out.println("l'age est: "+ p.getAge());
		///
		///
		 */
		//creation d'un enseignant
		
		Enseignant e = new Enseignant("AURIOL", 25, "DOCTEUR", "Master");
		
		//affichage 
		//System.out.println(e.toString());
		System.out.println("le grade est:"+ e.getGrade());
		System.out.println("le diplome est:"+ e.getDiplome());
		System.out.println("le nom est:"+ e.getName());
		System.out.println("l'age est:"+ e.getAge());
		
	}
}


