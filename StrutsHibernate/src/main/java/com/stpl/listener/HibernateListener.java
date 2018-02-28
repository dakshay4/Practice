package com.stpl.listener;

import java.net.URL;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
 
public class HibernateListener implements ServletContextListener{
 
   private static Class clazz = HibernateListener.class;
 
   public static final String KEY_NAME = clazz.getName();

	   
	public void contextDestroyed(ServletContextEvent event) {
		//
	}
 
	public void contextInitialized(ServletContextEvent event) {
 
		try {
	         URL url = HibernateListener.class.getResource("/hibernate.cfg.xml");
	         Configuration config = new Configuration().configure(url);
	         StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder()
	 				.applySettings(config.getProperties());
	         SessionFactory factory = config.buildSessionFactory(builder.build());
	         
	         //save the Hibernate session factory into serlvet context
	         event.getServletContext().setAttribute(KEY_NAME, factory);
	 
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	      }

	}
}