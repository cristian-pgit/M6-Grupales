package cl.bdly.bdly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.bdly.dao.CapacitacionDao;
import cl.bdly.bdly.models.Capacitacion;

@Controller
public class ListarCapaController {
	private static final Logger logger = Logger.getLogger(ListarCapaController.class);
	
	@Autowired
	private CapacitacionDao capaDao;
	
	@RequestMapping(value="/listarcapacitaciones")
	public ModelAndView listarCapacitaciones() {
		List<Capacitacion> capacitaciones = capaDao.getAllCapacitaciones();
		ModelAndView mav = new ModelAndView("listarcapas");
		mav.addObject("capacitaciones", capacitaciones);
		logger.info("Se llama a ListarCapaController.listarCapacitaciones(). Para desplegar las capaciones existentes desde DB");
		return mav;
	}

}