package repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MySessionFactory {
	private static SessionFactory factory = null;

	private MySessionFactory() {
	}

	public static SessionFactory getSessionFactory() {
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
		return factory;
	}

}