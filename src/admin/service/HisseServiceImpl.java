package admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.dao.HisseDAOImpl;
import domain.Hisse;


@Service
public class HisseServiceImpl implements HisseService {

	@Autowired
	private HisseDAOImpl hisseDao;
	
	
	@Override
	public void addHisse(Hisse hisse) {
		
	hisseDao.addHisse(hisse);
		
	}

	@Override
	public List<Hisse> getAllHisses() {
		
		return hisseDao.getAllHisses();
	}

	@Override
	public Hisse getHisseById(int id) {
		
		return hisseDao.getHisseById(id);
	}

	@Override
	public void updateHisse(Hisse hisse) {
		
		hisseDao.updateHisse(hisse);
		
	}

	@Override
	public void deleteHisse(int id) {
		
		hisseDao.deleteHisse(id);
		
	}

}
