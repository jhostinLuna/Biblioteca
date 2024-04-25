import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateDB {
	
	SessionFactory sessionFactory;
	Session sessionJDBC;
	public HibernateDB() {
		super();
		Configuration cfg = new Configuration().configure();
		 sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().build());
		 sessionJDBC = sessionFactory.openSession();
	}
	
	public void closeSessions() {
		sessionFactory.close();
		sessionJDBC.close();
	}
	
	
	
}
