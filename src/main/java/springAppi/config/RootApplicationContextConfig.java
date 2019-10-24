package springAppi.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

public class RootApplicationContextConfig {
	//Configuration().configure().buildSessionFactory();
	
	@Bean	
	SessionFactory factory() {
		SessionFactory factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
		
		return factory;  
		
	}

}
