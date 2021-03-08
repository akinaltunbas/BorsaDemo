package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Hisse;

import user.dao.UserHisseDAOImpl;

@Service
public class UserHiseeServiceImpl implements UserHisseService {
	
	@Autowired
	private UserHisseDAOImpl hisseDao;
	
	
	@Override
	public List<Hisse> getAllHisses() {
	
		return hisseDao.getAllHisses();
	}


	@Override
	public void addHisse(Hisse hisse) {
		hisseDao.addHisse(hisse);
		
	}




}
