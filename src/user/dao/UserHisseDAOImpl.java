package user.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Hisse;
import domain.Kullanici;



@Repository
public class UserHisseDAOImpl implements UserHisseDAO {

	private EntityManager entityManager;
	
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public List<Hisse> getAllHisses() {
		TypedQuery<Hisse> query = entityManager.createQuery("Select e from Hisse e", Hisse.class);
		return query.getResultList();
	}

	@Override
	public void addHisse(Hisse hisse) {
		entityManager.getTransaction().begin();
		entityManager.persist(hisse);
		entityManager.getTransaction().commit();
		
	}

	@Override
	public List<Hisse> getHisseByUser(Kullanici user) {
		// TODO Auto-generated method stub
		return null;
	}





}
