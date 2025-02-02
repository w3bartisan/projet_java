
public abstract class Personne {
	private String name;
	private int age;
	
	public Personne(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Personne(String name) {
		this.name = name;
		this.age = 10;
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String affiche() {
		return "Personne [name=" + name + ", age=" + age + "]";
	}
	
	public String afficheMonNom() {
		return " je suis la classe Personne";
	}
}
