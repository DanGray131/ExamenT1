package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadosService;
import org.cibertec.edu.pe.modelo.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpleadosController {
	@Autowired
	private IEmpleadosService servicio;
	
	//Listar
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Empleados> ListaEmpleados = servicio.Listado();
		m.addAttribute("listArt", ListaEmpleados);
		return "index";
	}
	
	//Agregar
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("Empleado", new Empleados());
		return "form";
	}
	
	//Metodo grabar
		@RequestMapping(value = "/salvar", method = RequestMethod.POST)
		public String salvar(Empleados e, Model m) {
			servicio.grabar(e);
			return "redirect:/listar";
		}
}
