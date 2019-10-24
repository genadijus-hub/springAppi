package springAppi.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springAppi.domain.Customer;

@Repository
public class CustumerRepository {

	@Autowired
	SessionFactory factory;


//	@Bean
//	@Transactional
//	public void kuriameVartotojus() {
//		Session session = factory.openSession();
////		CriteriaBuilder cb = session.getCriteriaBuilder();
////		CriteriaQuery<Customer> cr = cb.from(Customer.class);
////		System.out.println("Iveskite klausima ");
////		String klausimas = scanner.nextLine();
////
//		Customer klientas = new Customer("Jonas", "Vilnius");
//		Customer klientas1 = new Customer("Tomas", "Kaunas");
//		Customer klientas2 = new Customer("Ona", "Vilnius");
//
//		session.beginTransaction();
//		session.save(klientas);
//		session.save(klientas1);
//		session.save(klientas2);
//		session.getTransaction().commit();
//		session.close();
//
//		
//
//	}
//	List<Customer> list = new ArrayList<>();
//	

//	@Bean
//	public List<Customer> getList() {
//
//		return list();
//	}
	
	
	
	
}
