import java.util.ArrayList;
import java.util.List;

public class EtudiantService implements IEtudiant{
	
	List<Etudiant> listes = new ArrayList<>();

	public EtudiantService() {
		super();
	}
	
	@Override
	public Etudiant createEtudiant(Etudiant e) {
		listes.add(e);
		return e;
	}

	@Override
	public Etudiant updateEtudiant(Etudiant e, int position) {
		
		listes.set(position, e);
		return e;
	}

	@Override
	public List<Etudiant> listesEtudiants() throws EtudiantException {
		if (listes.isEmpty()) {
			throw new EtudiantException();
		}
		return listes;
	}

}
