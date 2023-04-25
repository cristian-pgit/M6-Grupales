package cl.bdly.bdly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.bdly.dao.CapacitacionDao;
import cl.bdly.bdly.models.Capacitacion;

@Controller
public class ListarCapaController {
	
	@Autowired
	private CapacitacionDao capaDao;
	
	@RequestMapping(value="/listarcapacitaciones")
	public ModelAndView listarCapacitaciones() {
		List<Capacitacion> capacitaciones = capaDao.getAllCapacitaciones();
		ModelAndView mav = new ModelAndView("listarcapas");
		mav.addObject("capacitaciones", capacitaciones);
		return mav;
	}

}