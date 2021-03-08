package user.dao;

import java.util.List;

import domain.Hisse;
import domain.Kullanici;


public interface UserHisseDAO {
	
	
	public List<Hisse> getAllHisses();
	
	public void addHisse(Hisse hisse);
	
	public List<Hisse> getHisseByUser(Kullanici user); 
	

}
