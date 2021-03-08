package user.service;

import java.util.List;

import domain.Hisse;


public interface UserHisseService {
	
	public List<Hisse> getAllHisses();
	public void addHisse(Hisse hisse);
	
}
