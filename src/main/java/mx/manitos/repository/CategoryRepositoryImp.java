package mx.manitos.repository;

import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.manitos.entity.Category;
import mx.manitos.transformer.TransformerClass;

@Repository
@Transactional
public class CategoryRepositoryImp implements CategoryRepository{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("SELECT c FROM Category c");
		@SuppressWarnings("unchecked")
		List<Category> list = query.list();
		return list;
	}

	public List<TransformerClass> findAllTransformer() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		StringBuilder qyery = new StringBuilder();
		qyery.append("SELECT OD.ORDER_ID, OD.SHIP_NAME, CU.CUSTOMER_CODE, CU.CONTACT_NAME " +
				" FROM ORDERS OD INNER JOIN CUSTOMERS CU ON (OD.CUSTOMER_ID = CU.CUSTOMER_ID) ");
		
		Query query = session.createSQLQuery(qyery.toString());
		query.setResultTransformer(new TransformerClass());
		
		return query.list();
		
	}

}
