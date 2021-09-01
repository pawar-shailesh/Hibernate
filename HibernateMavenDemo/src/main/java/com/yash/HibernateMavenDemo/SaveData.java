package com.yash.HibernateMavenDemo;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class SaveData {  
	public static void main(String[] args) {  

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction(); 

		Employee1 e1=new Employee1();  
		//e1.setId(106);  
		e1.setFirstName("shailesh");  
		e1.setLastName("Pune");  

		session.save(e1);
		session.update(e1);
		//session.delete(e1);
		t.commit();
		System.out.println("successfully saved");  
		

	}  
} 