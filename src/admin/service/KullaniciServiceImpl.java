package admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.dao.KullaniciDAOImpl;
import domain.Kullanici;


@Service
public class KullaniciServiceImpl implements KullaniciService {
	
	@Autowired
	private KullaniciDAOImpl kullaniciDao;

	@Override
	public void addKullanici(Kullanici user) {
		
		kullaniciDao.addKullanici(user);
		
	}

	@Override
	public List<Kullanici> getKullanicis() {
		
		return kullaniciDao.getKullanicis();
	}

	@Override
	public Kullanici getKullaniciById(int id) {
		
		return kullaniciDao.getKullaniciById(id);
	}

	@Override
	public void updateKullanici(Kullanici user) {
		
		kullaniciDao.updateKullanici(user);
		
	}

	@Override
	public void deleteKullanici(int id) {
		
		kullaniciDao.deleteKullanici(id);
	}



}
