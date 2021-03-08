package admin.service;

import java.util.List;

import domain.Hisse;

public interface HisseService {
	
	public void addHisse(Hisse hisse);
	
	public List<Hisse> getAllHisses();
	
	public Hisse getHisseById(int id);
	
	public void updateHisse(Hisse hisse);
	
	public void deleteHisse(int id);

}
