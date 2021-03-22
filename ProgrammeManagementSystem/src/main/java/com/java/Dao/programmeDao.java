package com.java.Dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.java.register.programme;



public class programmeDao {

	@SuppressWarnings({ "unused", "static-access", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		try {
			factoryprv FactoryProvider = new factoryprv();
			programme p1 = new programme();
			
			String PG = "PG";
           
            factoryprv FactoryProvider1 = new factoryprv();
			programme p11 = new programme();
			Session sp = FactoryProvider1.getfactory().openSession();
			Transaction tx2 = sp.beginTransaction();
		//	Query q =sp.createQuery("from programme order by category");
		//	List<programme> programme = q.list();
			
			Query q1 =sp.createQuery("from programme where Category= :PostGraduate");
			q1.setParameter("PostGraduate",PG);
			List<programme> POGR = q1.list();
			
			tx2.commit();
			
			for( programme l1 : POGR){
				System.out.println(l1.getSno());
				System.out.println(l1.getFees());
				System.out.println(l1.getCategory());
				System.out.println(l1.getProgramme_name());
				System.out.println(l1.getMaximum_duration());
				System.out.println(l1.getMinimum_duration());
				System.out.println(l1.getEligiblity());
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}