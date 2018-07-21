package by.htp.testSpringMVC.testSpringMVC.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import by.htp.testSpringMVC.testSpringMVC.dao.UserDao;
import by.htp.testSpringMVC.testSpringMVC.domain.User;
@Component
public class UserDaoHibernateImpl implements UserDao {
	
	public UserDaoHibernateImpl() {
		super();
	}

	@Override
	public void create(User entity) {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		//Criteria criteria=session.createCriteria(Car.class);       //с пом маппинга выполняет круд
		Transaction transaction=session.beginTransaction();
		
		session.save(entity);
		
		transaction.commit();
		session.close();
		
	}

	@Override
	public User read(int id) {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(User.class);       //с пом маппинга выполняет круд
		criteria.add(Restrictions.eq("id", id));
		User car=(User) criteria.list().get(0);
//		Transaction tr = session.beginTransaction();
//		Car car = (Car) session.load(Car.class, id);
//		tr.commit();
		session.close();
		return car;
		
	}
	
	public User read(String name, String pass) {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(User.class);       
		criteria.add(Restrictions.eq("name", name));
		criteria.add(Restrictions.eq("pass", pass));
		User car=(User) criteria.list().get(0);
		session.close();
		return car;
		
	}

	@Override
	public void update(User entity) {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.update(entity);
		
		transaction.commit();
		session.close();

	}

	@Override
	public void delete(User entity) {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.delete(entity);
		
		transaction.commit();
		session.close();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> readAll() {
		Session session=SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(User.class);       //с пом маппинга выполняет круд
		List<User>listCar=criteria.list();
		session.close();
		return listCar;
	}


}
