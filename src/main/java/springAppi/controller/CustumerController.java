package springAppi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springAppi.domain.Customer;
import springAppi.domain.repository.impl.CustumerRepository;
import springAppi.service.impl.CustomerService;

@Controller
public class CustumerController {

	@Autowired
	CustumerRepository repositorija;

	@Autowired
	SessionFactory factory;

	@RequestMapping("/customers")
	public String customerList(Model model) {

//		List<Customer> list = new ArrayList<>();
//		Customer klientas = new Customer(25, "Jonas", "Vilnius");
//		Customer klientas1 = new Customer(26, "Tomas", "Kaunas");
//		Customer klientas2 = new Customer(27, "Ona", "Vilnius");
//
//		list.add(klientas);
//		list.add(klientas1);
//		list.add(klientas2);

//		model.addAttribute("Klientas", repositorija.getList());

//			return list;
//		}

		Session session = factory.openSession();
		Query query = session.createQuery("FROM Customer");
		List<Customer> list = query.getResultList();

		model.addAttribute("Klientas", list);
		session.close();
		return "Klientai";

	}

	// GET rodomas tada kai kviečiame URL /products/add
	@RequestMapping(value = "/customers/add", method = RequestMethod.GET)
	public String getAddNewCustomeerForm(@ModelAttribute("newCustomer") Customer newCustomer) {
		return "addCustomer";
	}

	// POST suveikia po mygtuko paspaudimo
	@RequestMapping(value = "/customers/add", method = RequestMethod.POST)
	public String processAddNewCustomerForm(@ModelAttribute("newCustomers") Customer newCustomer) {

		Session session = factory.openSession();

		session.beginTransaction();
		session.save(newCustomer);
		session.getTransaction().commit();
		session.close();

		return "redirect:/customers";
//		return "Klientai";
	}

//	 Klientu atranka pagal miestą
	@RequestMapping(value = "/customers/Vilnius")
	public String atrankaPagalAdresa(Model model) {

		Session session = factory.openSession();
		Query query = session.createQuery("SELECT * FROM Customer WHERE adress = 'Vilnius' ");
		List<Customer> list = query.getResultList();

		model.addAttribute("Klientas", list);
		session.close();

		return "Klientai";
	}

//	// Klientu atranka pagal miestą
//	@RequestMapping(value = "/customers/Vilnius", method = RequestMethod.GET)
//	public String atrankaPagalAdresa(@ModelAttribute("pagalAdresa") Customer pagalAdresa) {
//
//		Session session = factory.openSession();
//		Query query = session.createQuery("SELECT adress FROM Customer WHERE adress = Vilnius ");
//		List<Customer> list = query.getResultList();
//
//		model.addAttribute("AdressVilnius", list);
//		session.close();
//
//		
//
//		return "Klientai";
//	}

}
