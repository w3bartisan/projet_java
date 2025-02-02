import java.util.List;


public interface IEnseignant  {
	
	Enseignant createEnseignant (Enseignant es);
	Enseignant updateEnseigant( int posoition, Enseignant es);
	List<Enseignant> listEns() throws EnseignantException;
	
	

}
