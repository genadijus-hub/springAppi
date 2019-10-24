package springAppi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan("springAppi")
public class WebApplicationContextConfig implements WebMvcConfigurer {
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// Reikia įjungti jei naudojame nestandartinius @RequestMapping'us
		configurer.enable();
	}

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		// Konfiguruojame JSP failų paėmimo vietą ir galūnę
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class); // Nurodoma view klasė - JSP tipas
		resolver.setPrefix("/WEB-INF/views/"); // Dėl saugumo rekomenduojama view failus laikyti WEB-INF kataloge
		resolver.setSuffix(".jsp"); // Nurodoma view failų galūnė
		return resolver;
	}
	

}
