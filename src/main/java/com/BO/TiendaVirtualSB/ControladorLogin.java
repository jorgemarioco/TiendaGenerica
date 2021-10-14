package com.BO.TiendaVirtualSB;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorLogin {
	
	@RequestMapping("/validar")
	public void validar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String Password = request.getParameter("pas");
		
		
		
		
		response.sendRedirect("inicio.jsp");
		
	}

}
