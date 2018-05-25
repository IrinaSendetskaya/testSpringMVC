package by.htp.testSpringMVC.testSpringMVC.dao.hbn;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public final class SessionFactoryManager {
	
	private static SessionFactory sessionFactory;
	private static SessionFactory buildSessionFactory() {
		
		//for XML
		Configuration configuration=new Configuration();   
		
			configuration.configure("config/hibernate.cfg.xml");
			
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.build();
			SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		
		//SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		
			return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory==null) {
			sessionFactory=buildSessionFactory();
		}
		
		return sessionFactory;
	}
	
	public static void closeSession() {
        // Close caches and connection pools
        getSessionFactory().close();
}

}
