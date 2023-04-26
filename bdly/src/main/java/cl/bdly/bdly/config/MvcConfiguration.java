package cl.bdly.bdly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import cl.bdly.bdly.dao.CapacitacionDao;
import cl.bdly.bdly.dao.ClienteDao;
import cl.bdly.bdly.daoimpl.CapacitacionDaoImpl;
import cl.bdly.bdly.daoimpl.ClienteDaoImpl;


@Configuration
@ComponentScan(basePackages="cl.bdly.bdly")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource bds = new DriverManagerDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/bdlydb");
		bds.setUsername("root");
		bds.setPassword("Larcon90");

		return bds;
	}
	
	@Bean
	public CapacitacionDao getCapacitacionDao() {
		return new CapacitacionDaoImpl(getDataSource());
	}
	
	@Bean
	public ClienteDao getClienteDao() {
		return new ClienteDaoImpl(getDataSource());
	}

	
}
