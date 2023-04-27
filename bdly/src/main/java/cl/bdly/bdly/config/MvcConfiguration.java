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

import cl.bdly.bdly.dao.ICapacitacionDao;
import cl.bdly.bdly.dao.IClienteDao;
import cl.bdly.bdly.dao.IContactoDao;
import cl.bdly.bdly.dao.IUsuarioDao;
import cl.bdly.bdly.daoimpl.CapacitacionDaoImpl;
import cl.bdly.bdly.daoimpl.ClienteDaoImpl;
import cl.bdly.bdly.daoimpl.ContactoDaoImpl;
import cl.bdly.bdly.daoimpl.UsuarioDaoImpl;


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
		bds.setUsername("Admin");
		bds.setPassword("admin1234");

		return bds;
	}
	
	@Bean
	public ICapacitacionDao getCapacitacionDao() {
		return new CapacitacionDaoImpl(getDataSource());
	}
	
	@Bean
	public IClienteDao getClienteDao() {
		return new ClienteDaoImpl(getDataSource());
	}
	
	@Bean
	public IUsuarioDao getUsuarioDao() {
		return new UsuarioDaoImpl(getDataSource());
	}
	
	@Bean
	public IContactoDao getContactoDao() {
		return new ContactoDaoImpl(getDataSource());
	}

	
}
