package com.soseng.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import com.soseng.data.entities.User;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {
//			Configuration configuration = new Configuration();
////			configuration.addAnnotatedClass(User.class);
//
//			return configuration.buildSessionFactory(new StandardServiceRegistryBuilder()
//					.applySettings(configuration.getProperties())
//					.build());
			
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
			        .configure( "hibernate.cfg.xml" )
			        .build();

			        Metadata metadata = new MetadataSources( standardRegistry )
			        .getMetadataBuilder()
			        .build();

			        return metadata.getSessionFactoryBuilder().build();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("There was an error building the factory");
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;

	}

}
