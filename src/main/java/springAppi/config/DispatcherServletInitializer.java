package springAppi.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	
	
	

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class [] {RootApplicationContextConfig.class} ;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {WebApplicationContextConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// Nurodome pradžios užklausos susiejimą - request mapping'ą
		return new String[] {"/"};
	}

}
