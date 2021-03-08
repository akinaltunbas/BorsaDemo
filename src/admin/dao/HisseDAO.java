package admin.dao;

import java.util.List;

import domain.Hisse;

public interface HisseDAO {
	
	public void addHisse(Hisse hisse);
	
	public List<Hisse> getAllHisses();
	
	public Hisse getHisseById(int id);
	
	public void updateHisse(Hisse hisse);
	
	public void deleteHisse(int id);
	

}
