import java.util.ArrayList;
import java.util.List;

public class ServiceEnseigant implements IEnseignant {
	
	List<Enseignant> listEns = new ArrayList<>();


	public ServiceEnseigant() {
		super();
		
	}
	

	@Override
	public Enseignant createEnseignant (Enseignant es) {
		
		listEns.add(es);
			
		return es;
	}

	@Override
	public Enseignant updateEnseigant(int posoition, Enseignant es) {
		
		listEns.set(0, es);
		
		return es;
	}

	
	
	@Override
	
	public List<Enseignant> listEns() throws EnseignantException {
		if (listEns.isEmpty()) {
			throw  new EnseignantException();
		}
		return listEns;
	}
	
	
	
	

}
