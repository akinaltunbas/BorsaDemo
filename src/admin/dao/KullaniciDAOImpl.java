package admin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Kullanici;


@Repository
public class KullaniciDAOImpl implements KullaniciDAO {
	
	
	private EntityManager entityManager;
	
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public void addKullanici(Kullanici user) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		
	}


	@Override
	public List<Kullanici> getKullanicis() {
		
		TypedQuery<Kullanici> query = entityManager.createQuery("Select e from Kullanici e", Kullanici.class);
		return query.getResultList();
	}


	@Override
	public Kullanici getKullaniciById(int id) {
		
		return entityManager.find(Kullanici.class, id);
	}


	@Override
	public void updateKullanici(Kullanici user) {
		Kullanici foundKullanici=getKullaniciById(user.getId());
		if(foundKullanici != null) {
			entityManager.getTransaction().begin();
			foundKullanici.setName(user.getName());
			foundKullanici.setSurname(user.getSurname());
			foundKullanici.setEmail(user.getEmail());;
			foundKullanici.setUsername(user.getUsername());
			foundKullanici.setPassword(user.getPassword());;
			foundKullanici.setUserType(user.getUserType());
			entityManager.getTransaction().commit();
				
		}
		
	}


	@Override
	public void deleteKullanici(int id) {
		Kullanici kullanici = getKullaniciById(id);
		if(kullanici != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(kullanici);
			entityManager.getTransaction().commit();
		}
		
	}

}
