package com.yash.hibernate.SaveCollectionHibernate;

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

		Employee e1=new Employee();  
		e1.setId(3);  
		e1.setFirstName("Shailesh");  
		e1.setLastName("Pawar");  

		Address addr = new Address();    
		addr.setStreet("Hadapsar");
		addr.setCity("pune");
		addr.setPincode("411028");
		addr.setState("MH");

		Address addr1 = new Address();    
		addr1.setStreet("M.G.Road");
		addr1.setCity("Indore");
		addr1.setPincode("452001");
		addr1.setState("MP");

		e1.getListofAddress().add(addr);
		e1.getListofAddress().add(addr1);
		//  session.save(e1);
		session.update(e1);


		// session.delete(e1);
		t.commit();
		System.out.println("successfully saved");  
		//factory.close();
		session.close();  
		//   e1 = null;
		//  session = factory.openSession();
		//session.beginTransaction();

		// e1 = (Employee) session.get(Employee.class, 1);
		//System.out.println(e1.getId()+" "+e1.getFirstName()+" "+e1.getLastName()+""+e1.getAddress()); 

	}  
} 