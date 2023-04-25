package cl.bdly.bdly.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.bdly.models.Capacitacion;
import cl.bdly.bdly.dao.CapacitacionDao;
import cl.bdly.bdly.daoimpl.CapacitacionDaoImpl;


@Controller
public class CapacitacionController {
	
	@RequestMapping(value="/crearcapacitacion")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("crearcapacitacion");
	}
	
	@RequestMapping(value="/creacapa", method = RequestMethod.POST)
	public ModelAndView loginIn(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String idcapa = request.getParameter("idCapacitacion");
		String rutcliente = request.getParameter("rutCliente");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		String cantAsist = request.getParameter("cantAsist");
		String nomCapa = request.getParameter("nomCapa");
		try {
			Capacitacion capa = CapacitacionDaoImpl.insertCapacitacion(idcapa, rutcliente, dia, hora, lugar, duracion, cantAsist, nomCapa);
			System.out.println("Se ha creado la siguiente capacitacion: "+capa);
			return new ModelAndView("crearcapacitacion");
		} catch (Exception e) {
			e.printStackTrace();
	        ModelAndView mav = new ModelAndView("crearcapacitacion");
	        mav.addObject("message", "Error al Crear la Capacitacion");
	        return mav;
		}
		
	}

}