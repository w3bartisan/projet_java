import java.util.List;

public interface IEtudiant {
	
	Etudiant createEtudiant(Etudiant e);
	Etudiant updateEtudiant(Etudiant e, int position);
	List<Etudiant> listesEtudiants() throws EtudiantException;
}
