package admin.dao;

import java.util.List;

import domain.Kullanici;

public interface KullaniciDAO {
	
	
	public void addKullanici(Kullanici user);
	
	public List<Kullanici> getKullanicis();

	public Kullanici getKullaniciById(int id);
	
	public void updateKullanici(Kullanici user);

	public void deleteKullanici(int id);

}
