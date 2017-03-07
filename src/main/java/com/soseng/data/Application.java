package com.soseng.data;

import java.util.Date;

import org.hibernate.Session;

import com.soseng.data.entities.User;

public class Application {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
		session.getTransaction().begin();
		
//		User user=new User();
//		user.setBirthDate(new Date());
//		user.setCreatedBy("soseng");
//		user.setCreatedDate(new Date());
//		user.setEmailAddress("soseng@live.com");
//		user.setFirstName("Sopheara");
//		user.setLastName("Seng");
//		user.setLastUpdatedBy("sseng");
//		user.setLastUpdatedDate(new Date());
		
		User user = new User();
		user.setBirthDate(new Date());
		user.setCreatedBy("sseng");
		user.setCreatedDate(new Date());
		user.setEmailAddress("sseng@yahoo.com");
		user.setFirstName("seng");
		user.setLastName("sssBowersox");
		user.setLastUpdatedBy("kevin");
		user.setLastUpdatedDate(new Date());
				
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}

}
