package com.yash.bankingapp.data;
import java.util.Date;
import org.hibernate.Session;

import com.yash.bankingapp.domain.User;

public class Application {
public static void main(String[] args) {
 Session session=HibernateUtil.getSessionFactory().openSession(); 
 session.getTransaction().begin();
 User user=new User();
 user.setFirstName("Shailesh");
 user.setLastName("Pawar");
 user.setBirthDate(new Date());
 user.setEmailAddress("shailesh.pawar@yash.com");
 user.setCreatedBy("shailesh");
 user.setCreatedDate(new Date());
 user.setLastUpdatedDate(new Date());
 user.setLastUpdatedBy("shailesh"); 
 session.saveOrUpdate(user);
 session.getTransaction().commit(); 
 session.close();
}
}
