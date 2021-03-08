package admin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Hisse;



@Repository
public class HisseDAOImpl implements HisseDAO{
	
	private EntityManager entityManager;
	
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public void addHisse(Hisse hisse) {
		entityManager.getTransaction().begin();
		entityManager.persist(hisse);
		entityManager.getTransaction().commit();
		
	}

	@Override
	public List<Hisse> getAllHisses() {
		TypedQuery<Hisse> query = entityManager.createQuery("Select e from Hisse e", Hisse.class);
		return query.getResultList();
	}

	@Override
	public Hisse getHisseById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Hisse.class, id);
	}

	@Override
	public void updateHisse(Hisse hisse) {
		Hisse foundHisse=getHisseById(hisse.getId());
		if(foundHisse != null) {
			entityManager.getTransaction().begin();
			foundHisse.setKod(hisse.getKod());
			foundHisse.setIsim(hisse.getIsim());
			entityManager.getTransaction().commit();
				
		}
		
	}

	@Override
	public void deleteHisse(int id) {
		Hisse hisse = getHisseById(id);
		if(hisse != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(hisse);
			entityManager.getTransaction().commit();
		}
		
	}

}
