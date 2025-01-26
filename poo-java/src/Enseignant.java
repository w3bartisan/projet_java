
public class Enseignant extends Personne{
	private String grade;
	private String diplome;
	public Enseignant(String name, int age, String grade, String diplome) {
		super(name,age);
		this.grade = grade;
		this.diplome = diplome;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	@Override
	public String toString() {
		return "Enseignant [grade=" + grade + ", diplome=" + diplome + ", name=" + getName() + ", age="
				+ getAge() +"]";
	}
	
	

}
