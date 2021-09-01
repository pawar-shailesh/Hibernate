package com.yash.hibernate.HibernateOneToMany;

import java.util.ArrayList;

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
          

     
Address addr = new Address();    
      addr.setStreet("Hadapsar");
      addr.setCity("pune");
      addr.setPincode("411028");
      addr.setState("Mh");
     
      Address addr1 = new Address();    
      addr1.setStreet("ShivajiNagar");
      addr1.setCity("pune");
      addr1.setPincode("412110");
      addr1.setState("Mh");
      
      Address addr3 = new Address();    
      addr3.setStreet("Indore");
      addr3.setCity("MP");
      addr3.setPincode("452001");
      addr3.setState("MP");
      
      Address addr4 = new Address();    
      addr4.setStreet("Delhi");
      addr4.setCity("Noida");
      addr4.setPincode("212121");
      addr4.setState("DL");
      
      ArrayList<Address> list = new ArrayList<Address>();
      list.add(addr);
     
      list.add(addr1);
     
      
      ArrayList<Address> list1 = new ArrayList<Address>();
      list1.add(addr3);
      list1.add(addr4);
     
      Employee e1=new Employee();  
      //e1.setId(3);  
       e1.setFirstName("Shailesh");  
       e1.setLastName("Pawar");  
       e1.setAddresses(list);
       
      
      Employee e2=new Employee();  
      //e2.setId();  
       e2.setFirstName("Allen");  
       e2.setLastName("Max");  
       e2.setAddresses(list1);
      
      
     
   session.save(e1);
   session.save(e2);
   

   //session.delete(e1);
   session.update(e1);
   session.update(e2);
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