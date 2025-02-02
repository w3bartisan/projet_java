
public class Etudiant extends Personne {
	
	private String matricule;
	private String filiere;
	private int niveau;
	public Etudiant() {
		super("");
		this.matricule="CM1234" ;
		this.filiere="INFO";
		this.niveau=4;
	}
	public Etudiant(String name, int age, String matricule, String filiere, int niveau) {
		super(name, age);
		this.matricule = matricule;
		this.filiere = filiere;
		this.niveau = niveau;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	@Override
	public String toString() {
		return "Etudiant [matricule = " + matricule + ", filiere =" + filiere + ", niveau =" + niveau + ", nom ="
				+ getName() + ", Age =" + getAge() + "]";
	}
	// redéfinition de la methode affiche
	public String affiche() {
		return "Etudiant [matricule = " + matricule + ", filiere =" + filiere + ", niveau =" + niveau + ", nom ="
				+ getName() + ", Age =" + getAge() + "]";
	}
	
	public String afficheMonNom () {
		return "je suis la classe etudiant";
	}

}
