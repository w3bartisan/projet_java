
public class Main {

	public static void main(String[] args) {
		//Creation d'un objet personne
		Personne p = new Personne("AURIOL", 25);
		//afficher les propriétés
		System.out.println("le nom est: "+ p.getName());
		System.out.println("l'age est: "+ p.getAge());
	}

}
